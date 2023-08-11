import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  cart: Array<any> = [];
  cartStream = new BehaviorSubject<any[]>(this.cart); // stream
  constructor() { }
  addToCart(item: any) {
    this.cart = this.cart.concat(item);
    this.cartStream.next(this.cart); // propagate change
  }
}
