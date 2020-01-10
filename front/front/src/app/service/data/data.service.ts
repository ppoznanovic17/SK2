import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Rel, Subscription} from "../../components/list/list.component";
import {API_URL} from "../../app.constants";
import {User} from "../../components/home/home.component";

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient) {
  }

   retriveAllSubs(){
    return this.http.get<Subscription[]>(`${API_URL}/subs`)
  }

   retriveAllSubsForUser(id){
    return this.http.get<Rel[]>(`${API_URL}/rel/${id}`/*,{headers: new HttpHeaders({
        auth: sessionStorage.getItem("auth")
      })}*/)
  }

   retriveAllRel(){
    return this.http.get<Rel[]>(`${API_URL}/rel`)
  }

   retriveAllUsers(){
    return this.http.get<User[]>(`${API_URL}/user/all`)
  }

   retriveUserByUsername(username){
    return this.http.get<User>(`${API_URL}/user/${username}`)
  }

   retriveUserById(id){
    return this.http.get<User>(`${API_URL}/user/id/${id}`)
  }

  saveRelation(rel) {
    return this.http.post(`${API_URL}/rel/post`,
      rel)
  }

  deleteRelation(id){
    return this.http.delete(`${API_URL}/rel/del/${id}`)

  }


}
