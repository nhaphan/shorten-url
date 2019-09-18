import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Url} from './url';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UrlService {
  private baseUrl = 'http://localhost:8080/urls';
  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };
  constructor(
    private http: HttpClient
  ) { }

  createUrl(url: Url): Observable<Url> {
      return this.http.post<Url>(this.baseUrl , url, this.httpOptions);
  }
  getUrls(): Observable<Url[]> {
    return this.http.get<Url[]>(this.baseUrl );
  }
}
