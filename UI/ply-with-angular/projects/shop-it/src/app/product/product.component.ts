import { Component, EventEmitter, Input, Output } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

  @Input()
  product: any;

  constructor(
    private cartService: CartService
  ) { }

  currentTab: number = 1

  handleTabChange(index: number) {
    this.currentTab = index
  }
  isTabActive(index: number): boolean {
    return this.currentTab === index
  }
  handleBuy(event: MouseEvent, productId: number): void {
    this.cartService.addToCart({ id: productId, name: this.product.name, price: this.product.price })
  }

}
