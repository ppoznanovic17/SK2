import { Injectable } from '@angular/core';
import {Cao} from "../components/home/home.component";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class ProbaService {

  constructor(private http: HttpClient) { }


  helloworldApi(){
    return this.http.get<Cao>('http://localhost:9000/service1/hello')
  }
}
