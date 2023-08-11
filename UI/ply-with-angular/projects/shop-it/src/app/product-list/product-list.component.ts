import { Component, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent {



  products = [
    {
      id: 1,
      name: "Laptop",
      price: 250000,
      currencyCode: "INR",
      isAvailable: true,
      description: 'Laptop description',
      imageUrl: "assets/images/Laptop.png"
    },
    {
      id: 2,
      name: "Mobile",
      price: 50000,
      currencyCode: "INR",
      isAvailable: true,
      description: 'Mobile description',
      imageUrl: "assets/images/Mobile.png"
    }
  ]



}
