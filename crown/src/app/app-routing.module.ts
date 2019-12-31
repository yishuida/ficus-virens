import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Routes, RouterModule } from '@angular/router';
import { PageNotFoundComponent } from './default/page-not-found/page-not-found.component';
import { PostListComponent } from './home/post-list/post-list.component';
import {IndexComponent} from './home/index/index.component';

const appRoutes: Routes = [
  { path: '', component: IndexComponent },
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
export class AppRoutingModule { }
