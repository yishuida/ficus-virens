import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { PageNotFoundComponent } from './default/page-not-found/page-not-found.component';
import { PostListComponent } from './home/post-list/post-list.component';
import { AboutMeComponent } from './home/about-me/about-me.component';
import { TimeLineComponent } from './home/time-line/time-line.component';
import { IndexComponent } from './home/index/index.component';
import { PostEditComponent } from './management/post-edit/post-edit.component';
import {DashboardComponent} from './management/dashboard/dashboard.component';
import { TopBarComponent } from './common/top-bar/top-bar.component';
import {MatIconModule, MatListModule, MatToolbarModule} from '@angular/material';

@NgModule({
  declarations: [
    AppComponent,
    PageNotFoundComponent,
    PostListComponent,
    AboutMeComponent,
    TimeLineComponent,
    IndexComponent,
    DashboardComponent,
    PostEditComponent,
    TopBarComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatListModule,
    MatToolbarModule,
    MatIconModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
