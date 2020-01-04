import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { FicusVirensRoutingModule } from './ficus-virens-routing.module';
import { FicusVirensApp } from './ficus-virens-app';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import { AboutMeComponent } from './pages/about-me/about-me.component';
import { TimeLineComponent } from './pages/time-line/time-line.component';
import { IndexComponent } from './pages/index/index.component';
import {DashboardComponent} from './pages/dashboard/dashboard.component';
import { TopBarComponent } from './shared/top-bar/top-bar.component';
import {MatButtonModule, MatIconModule, MatListModule, MatToolbarModule} from '@angular/material';
import {NavbarComponent} from './shared/navbar/navbar.component';

@NgModule({
  declarations: [
    FicusVirensApp,
    PageNotFoundComponent,
    AboutMeComponent,
    TimeLineComponent,
    IndexComponent,
    DashboardComponent,
    TopBarComponent,
    NavbarComponent,
  ],
  imports: [
    BrowserModule,
    FicusVirensRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatListModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
  ],
  providers: [],
  bootstrap: [FicusVirensApp]
})
export class FicusVirensModule { }
