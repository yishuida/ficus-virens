
import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { FicusVirensModule } from './app/ficus-virens.module';
import { environment } from './environments/environment';
import { JwksValidationHandler } from 'angular-oauth2-oidc';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(FicusVirensModule)
  .catch(err => console.error(err));
