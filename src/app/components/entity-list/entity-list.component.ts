import { Component, OnInit, Input } from '@angular/core';
import { Recipe } from 'src/app/models/recipe';

@Component({
  selector: 'app-entity-list',
  templateUrl: './entity-list.component.html',
  styleUrls: ['./entity-list.component.css']
})
export class EntityListComponent implements OnInit {
  @Input() pageHeader: string;
  @Input() entityList: Recipe[];

  constructor() { }

  ngOnInit() {
  }

}
