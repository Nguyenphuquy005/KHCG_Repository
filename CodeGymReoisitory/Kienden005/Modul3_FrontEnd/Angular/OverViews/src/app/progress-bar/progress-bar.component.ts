import { Component, OnInit , Input} from '@angular/core';

@Component({
  selector: 'app-progress-bar',
  templateUrl: './progress-bar.component.html',
  styleUrls: ['./progress-bar.component.css']
})
export class ProgressBarComponent implements OnInit {
  @Input() backgroundColor = '#3366CC';
  @Input() progressColor = '#000000';
  @Input() width = 50;
  constructor() { }

  ngOnInit(): void {
  }

}
