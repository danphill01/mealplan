import { Component } from '@angular/core';
import { SecurityService } from './services/security.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Menu Plan';

  constructor(private security: SecurityService, private router: Router ) {
    this.security.authenticate(undefined, undefined);
  }

  authenticated() { return this.security.authenticated; }

  logout() {
    return this.security.logout().subscribe(() => this.router.navigateByUrl('/login'));
  }
}
