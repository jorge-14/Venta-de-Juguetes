import { ApplicationConfig, provideBrowserGlobalErrorListeners, provideZonelessChangeDetection } from '@angular/core';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { providePrimeNG } from 'primeng/config';
import Aura from '@primeuix/themes/aura';
import { routes } from './app.routes';
import { provideRouter } from '@angular/router';
import {definePreset} from '@primeuix/themes';

const myFund = definePreset(Aura, {
  semantic: {
    primary: {
      50: '{sky.50}',
      100: '{sky.100}',
      200: '{sky.200}',
      300: '{sky.300}',
      400: '{sky.400}',
      500: '{sky.500}',
      600: '{sky.600}',
      700: '{sky.700}',
      800: '{sky.800}',
      900: '{sky.900}',
      950: '{sky.950}'
    }
  }
});

export const appConfig: ApplicationConfig = {
  providers: [
    provideBrowserGlobalErrorListeners(),
    provideZonelessChangeDetection(),
    provideRouter(routes),
    provideAnimationsAsync(),
    providePrimeNG({
      theme: { preset: myFund },
      license: 'eyJpZCI6IjY0M2FhMDYwLWM5YmYtNDhhNi1iMWMxLTczMzNiYzZhNTM2ZiIsInByb2R1Y3QiOiJwcmltZXVpIiwidGllciI6ImNvbW11bml0eSIsInR5cGUiOiJkZXYiLCJpYXQiOjE3ODgxMzIzNjQsImV4cCI6MTgxOTY2ODM2NH0.qVIsSFe0jV8MSaZ-QK22QCIhRWMbIbTB_XNF4oLpsUUvU2JT4gqRiOgd7kCQqyM7NTxoP8TPAFwETZ_yu4PhBQ'
    })
  ]
};



