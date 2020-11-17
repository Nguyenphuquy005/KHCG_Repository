import { Component, OnInit , Input } from '@angular/core';

@Component({
  selector: 'app-name-cart',
  templateUrl: './name-cart.component.html',
  styleUrls: ['./name-cart.component.css']
})
export class NameCartComponent implements OnInit {
  @Input() cardName: string;
  @Input() email: string;
  @Input() phone: string;
  constructor() { }

  ngOnInit(): void {
  }

}
