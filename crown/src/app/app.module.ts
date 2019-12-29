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
import { DashboardComponent } from './manager/dashboard/dashboard.component';
import { PostEditComponent } from './management/post-edit/post-edit.component';

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
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    BrowserAnimationsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
