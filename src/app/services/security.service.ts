import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse } from '@angular/common/http';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { tap } from 'rxjs/operators';

interface User {
  name: string;
}
@Injectable({
  providedIn: 'root'
})
export class SecurityService {

  authenticated = false;

  constructor(private http: HttpClient, private router: Router) { }

  authenticate(credentials, callback) {
    const headers = new HttpHeaders(credentials ? {
      authorization : 'Basic' + btoa(credentials.username + ':' + credentials.password)
    } : {});

    this.http.get('user', {headers}).subscribe(response => {
      if (response[name]) {
        this.authenticated = true;
      } else {
        this.authenticated = false;
      }
      return callback && callback();
    });
  }

  logout(): Observable<{}> {
    return this.http.post('logout', {}).pipe(
      tap(() => this.authenticated = false)
    ) as Observable<{}>;
  }

}
