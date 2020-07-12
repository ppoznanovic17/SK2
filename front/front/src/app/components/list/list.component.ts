import { Component, OnInit } from '@angular/core';
import {User} from "../home/home.component";
import {DataService} from "../../service/data/data.service";
import {Router} from "@angular/router";
import {error} from "util";

export class Subscription {

  constructor(){
  }

  public subscriptionId:number
  public city:String
  public type:number
  public country:String
  public longitude:number
  public latitude:number
  public isSub:boolean
  public rel:Rel

}

export class Rel {

  constructor() {
  }

  public id:number
  public userId:number
  public subId:number

}

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {

  user:User
  subs:Subscription[]
  rels: Rel[]



  id:number


  constructor(private dataService:DataService,
              private router:Router) { }

  ngOnInit() {

    this.refreshTodos()
  }

  async refreshTodos () {

        this.subs = await this.dataService.retriveAllSubs().toPromise()
    console.log(this.subs)

    /*.subscribe(
       response => {
          return this.subs = response

      },
      error => {
        console.log('Error retrive all subs error')
      }
    )*/

      this.user = await this.dataService.retriveUserByUsername(sessionStorage.getItem('user')).toPromise()


    console.log(this.user.id)
     this.rels = await this.dataService.retriveAllSubsForUser(this.user.id).toPromise()


    console.log(this.subs.length)
    for (let s = 0; s < this.subs.length; s++) {
      for(let r=0; r < this.rels.length; r++){
        if (this.subs[s].subscriptionId === this.rels[r].subId){
          this.subs[s].isSub = true
          this.subs[s].rel = this.rels[r]
          break
        }else{
          this.subs[s].isSub = false
        }
      }

    }

  }

   subscribe(s:Subscription){
    s.isSub = true
    let rel =  new Rel()
    rel.subId = s.subscriptionId
    rel.userId = this.user.id
     rel.id  = 1
    s.rel = rel

    this.dataService.saveRelation(rel).subscribe(
      res => {
        console.log(res)
      }
    )

  }

  unsubscribe(s:Subscription){
    s.isSub = false

    this.dataService.deleteRelation(s.rel.id).subscribe(
      res => {
        console.log(res)
      }
    )
  }

  help(num:number){
    if(num == 1) return 1 + ' hour'
    return num + ' hours'
  }
}
