import { Component, OnInit } from '@angular/core';
import {UrlService} from '../url.service';
import {Url} from '../url';

@Component({
  selector: 'app-urls',
  templateUrl: './urls.component.html',
  styleUrls: ['./urls.component.css']
})
export class UrlsComponent implements OnInit {

  urls: Url[];
  constructor(private urlService: UrlService) { }
  ngOnInit() {
    this.getUrls();
  }

  getUrls(): void {
    this.urlService.getUrls()
      .subscribe(urls => this.urls = urls);
  }

  add(originalUrl: string ): void {
    this.urlService.createUrl({originalUrl} as Url)
      .subscribe(
        url => {
          this.urls.push(url);
        }
      );
  }

  copyMessage(val: string) {
    const selBox = document.createElement('textarea');
    selBox.style.position = 'fixed';
    selBox.style.left = '0';
    selBox.style.top = '0';
    selBox.style.opacity = '0';
    selBox.value = val;
    document.body.appendChild(selBox);
    selBox.focus();
    selBox.select();
    document.execCommand('copy');
    document.body.removeChild(selBox);
  }

}
