import { Component } from '@angular/core';
import { OAuthService } from 'angular-oauth2-oidc';
import {authCodeFlowConfig } from './config/authCodeFlowConfig';

@Component({
  selector: 'app-root',
  templateUrl: './ficus-virens-app.html',
  styleUrls: ['./ficus-virens-app.css']
})
// tslint:disable-next-line:component-class-suffix
export class FicusVirensApp {
  title = 'crown';
}
