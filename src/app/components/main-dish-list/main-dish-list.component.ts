import { Component, OnInit } from '@angular/core';
import { MainDishService } from 'src/app/services/main-dish.service';

@Component({
  selector: 'app-main-dish-list',
  templateUrl: './main-dish-list.component.html',
  styleUrls: ['./main-dish-list.component.css']
})
export class MainDishListComponent implements OnInit {

  constructor(private mainDishService: MainDishService) { }

  ngOnInit() {
  }

}
