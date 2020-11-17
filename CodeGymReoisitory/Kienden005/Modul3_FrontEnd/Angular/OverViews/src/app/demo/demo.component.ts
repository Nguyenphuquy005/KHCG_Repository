import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-demo',
  templateUrl: './demo.component.html',
  styleUrls: ['./demo.component.css']
})
export class DemoComponent implements OnInit {
  isBk;

  constructor() { }

  ngOnInit(): void {
  }

  clickChair(chairnumber: number) {
       if (this.isBk === '') {
         this.isBk = 'blue';
       } else {
         this.isBk = '' ;
       }
  }
}
