import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';            // <-- required

import { FicusVirensRoutingModule } from './ficus-virens-routing.module';
import { FicusVirensApp } from './ficus-virens-app';
import {HttpClientModule} from '@angular/common/http';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import { AboutMeComponent } from './pages/about-me/about-me.component';
import { TimeLineComponent } from './pages/time-line/time-line.component';
import { IndexComponent } from './pages/index/index.component';
import {DashboardComponent} from './pages/dashboard/dashboard.component';
import { TopBarComponent } from './shared-bak/top-bar/top-bar.component';
import { MatButtonModule } from '@angular/material/button';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatIconModule } from '@angular/material/icon';
import { MatListModule } from '@angular/material/list';
import { MatToolbarModule } from '@angular/material/toolbar';
import {NavbarComponent} from './shared-bak/navbar/navbar.component';
import { FooterComponent } from './shared-bak/footer/footer.component';
import { authInterceptorProviders } from './core/helpers/auth.interceptor';
import {LoginComponent} from './admin/pages/login/login.component';
import {BoardAdminComponent} from './board-admin/board-admin.component';
import {ProfileComponent} from './profile/profile.component';
import { FormsModule } from '@angular/forms';


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
    FooterComponent,
    LoginComponent,
    BoardAdminComponent,
    ProfileComponent,
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
    MatGridListModule,
    CommonModule,
    FormsModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [FicusVirensApp]
})
export class FicusVirensModule { }
