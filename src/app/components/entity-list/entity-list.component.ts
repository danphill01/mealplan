import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-entity-list',
  templateUrl: './entity-list.component.html',
  styleUrls: ['./entity-list.component.css']
})
export class EntityListComponent implements OnInit {
  @Input() pageHeader: string;
  @Input() entityList: any[];

  constructor() { }

  ngOnInit() {
  }

}
