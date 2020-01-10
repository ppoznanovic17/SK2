import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../components/home/home.component";
import {map} from "rxjs/operators";
import {API_URL, LOG_USERNAME, TOKEN} from "../app.constants";

@Injectable({
  providedIn: 'root'
})
export class AuthService {



  constructor(private http: HttpClient) { }

  register (user) {
      return this.http.post(`${API_URL}/auth/reg`,user)
  }

  login (username, password) {
    return this.http.post<any>(`${API_URL}/auth/login`, {
      username,
      password
    })
      .pipe(map(
        data => {
          sessionStorage.setItem(LOG_USERNAME, username)
          sessionStorage.setItem(TOKEN, `Bearer ${data.token}`)
          return data
        }
      ))
  }

  isUserLoggedIn () {
    let user = sessionStorage.getItem('auth')
    return !(user===null)
  }

  logout () {
    sessionStorage.removeItem('auth')
    sessionStorage.removeItem('user')
  }

  logUsername () {
    let username = sessionStorage.getItem('user')
    return username
  }

  getauthToken(){
    if(this.getAuthUser())
      return  sessionStorage.getItem(TOKEN)
  }
  getAuthUser(){
    let user = sessionStorage.getItem(LOG_USERNAME)
    return user

    }

}
