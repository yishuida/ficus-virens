import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './pages/page-not-found/page-not-found.component';
import {IndexComponent} from './pages/index/index.component';
import {TimeLineComponent} from './pages/time-line/time-line.component';
import {AboutMeComponent} from './pages/about-me/about-me.component';

const appRoutes: Routes = [
  { path: 'index', component: IndexComponent },
  { path: '', redirectTo: 'index', pathMatch: 'full'},
  { path: 'time-line', component: TimeLineComponent },
  { path: 'about-me', component: AboutMeComponent },
  { path: '**', component: PageNotFoundComponent },
];

@NgModule({
  imports: [
    CommonModule,
    RouterModule.forRoot(appRoutes),
  ],
  exports: [
    RouterModule
  ]
})
export class FicusVirensRoutingModule { }
