import { Component, OnInit } from '@angular/core';
import { authCodeFlowConfig } from '../../config/authCodeFlowConfig';
import {OAuthService} from 'angular-oauth2-oidc';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {

  constructor(private oauthService: OAuthService) {
    this.oauthService.configure(authCodeFlowConfig);
    this.oauthService.loadDiscoveryDocumentAndLogin();
  }

  ngOnInit() {
  }
  login() {
    this.oauthService.initCodeFlow();
  }
  printHello() {
    console.log('hello world!');
  }

  logout() {
    this.oauthService.logOut();
  }
  get givenName() {
    const claims = this.oauthService.getIdentityClaims();
    if (!claims) {
      return null;
    }
    return claims['name'];
  }
}
