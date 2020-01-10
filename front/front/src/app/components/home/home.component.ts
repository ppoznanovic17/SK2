import { Component, OnInit } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ProbaService} from "../../service/proba.service";
import {AuthService} from "../../service/auth.service";
import {Router} from "@angular/router";

export class Cao {
  tekst:String

}

export class User {

  id:number
  username:String
  email:String
  password:String

}

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(
    private service:ProbaService,
    private jwtAuthService: AuthService,
    private router:Router
    ) { }

    username:String
    password1:String
    password2:String
    email:String

    invalidLogin:boolean
    errorMessage:String

    regMsg:String

    hello = new Cao()


  ngOnInit() {
    this.hello.tekst = 'init'
  }

  hellof(){
    this.service.helloworldApi().subscribe(
      response => {
        this.hello = response
        console.log(this.hello)
        console.log(this.hello.tekst)
      },
      error => {
        console.log('Error')
      }

    )
  }

  handleJWTAuthLogin() {
      this.jwtAuthService.login(this.username,this.password1)
        .subscribe(
          data => {
            this.invalidLogin = false
            this.router.navigate(['home'])
          },
          error => {
            this.invalidLogin = true
            this.errorMessage = 'Neuspesna prijava'
          }
        )
  }

  handleRegister() {

    if(this.password2 == this.password1 && this.username.length>1 && this.email.endsWith("@gmail.com") && this.password1.length>1){
      let user = new User()
      user.email = this.email
      user.password = this.password1
      user.username = this.username
      this.jwtAuthService.register(user).subscribe(
        data => {
          this.regMsg = `Uspesno ste se registrovali! (${user.username})`
        },
        error => {
          this.regMsg = 'Neuspesna registracija'
        }
      )
    }else{
      this.regMsg = 'Neuspesna registracija'
    }

  }




}
