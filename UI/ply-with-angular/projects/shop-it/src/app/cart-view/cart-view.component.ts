import { Component, Input, SimpleChange } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart-view',
  templateUrl: './cart-view.component.html',
  styleUrls: ['./cart-view.component.css']
})
export class CartViewComponent {

  cart: Array<any> = [];

  constructor(private cartService: CartService) { }

  ngOnChanges(changes: SimpleChange) {
    console.log("CartViewComponent.ngOnChanges()");
    console.log(changes);
    // todo any side-effects on new changes
  }

  ngOnInit() {
    console.log("CartViewComponent::ngOnInit()");
    // todo one-time initialization
    this.cart = this.cartService.cart
  }

  ngOnDestroy() {
    console.log("CartViewComponent::ngOnDestroy()");
    // todo one-time cleanup before destroying the component
  }

}
