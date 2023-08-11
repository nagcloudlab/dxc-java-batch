import { Component, Input } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-cart-badge',
  templateUrl: './cart-badge.component.html',
  styleUrls: ['./cart-badge.component.css']
})
export class CartBadgeComponent {

  count = 0

  constructor(private cartService: CartService) {
  }

  ngOnInit(): void {
    this.cartService.cartStream
      .subscribe({
        next: (cart: any) => {
          this.count = cart.length
        }
      })
  }

}
