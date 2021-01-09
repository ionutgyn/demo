import { Component } from '@angular/core';
import {Article} from './article';
import {ArticleService} from './article.service';
import {Router} from "@angular/router";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  articles: Article[];

  constructor(private router: Router, private articleService: ArticleService) {
  }

  getArticles() {
    this.articleService.getArticles().subscribe(data => {
      this.articles = data;
    });
  }

  ngOnInit(): void {
    this.router.events.subscribe(value => {
      this.getArticles();
    });
  }
}
