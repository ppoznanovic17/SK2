import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from "./components/home/home.component";
import {ListComponent} from "./components/list/list.component";
import {LogoutComponent} from "./components/logout/logout.component";


const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: ListComponent },
  { path: 'logout', component: LogoutComponent },
  { path: 'login', component: HomeComponent }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
