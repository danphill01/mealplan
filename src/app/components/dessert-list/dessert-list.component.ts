import { Component, OnInit } from '@angular/core';
import { DessertService } from 'src/app/services/dessert.service';

@Component({
  selector: 'app-dessert-list',
  templateUrl: './dessert-list.component.html',
  styleUrls: ['./dessert-list.component.css']
})
export class DessertListComponent implements OnInit {

  constructor(private dessertService: DessertService) { }

  ngOnInit() {
  }

}
