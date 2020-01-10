import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import {FormsModule} from "@angular/forms";
import {HTTP_INTERCEPTORS, HttpClientModule} from "@angular/common/http";
import { ListComponent } from './components/list/list.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoutComponent } from './components/logout/logout.component';
import { OptionsComponent } from './components/options/options.component';
import { FooterComponent } from './components/footer/footer.component';
import {HttpIntercepterBasicAuthService} from "./service/http/http-intercepter-basic-auth.service";

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListComponent,
    HeaderComponent,
    LogoutComponent,
    OptionsComponent,
    FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,

  ],
  providers: [    {provide: HTTP_INTERCEPTORS, useClass: HttpIntercepterBasicAuthService, multi : true}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
