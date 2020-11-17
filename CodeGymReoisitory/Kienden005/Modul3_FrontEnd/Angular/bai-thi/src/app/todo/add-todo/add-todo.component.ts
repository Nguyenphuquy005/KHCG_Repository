import { Component, OnInit } from '@angular/core';
import {FormBuilder, Validators, FormGroup} from '@angular/forms';
import { TodoServicesService } from '../../services/todo-services.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-todo',
  templateUrl: './add-todo.component.html',
  styleUrls: ['./add-todo.component.css']
})
export class AddTodoComponent implements OnInit {
  public formAddTodo: FormGroup;
  constructor(
    public todoService: TodoServicesService,
    public formBuilder: FormBuilder,
    public roter: Router
  ) { }

  ngOnInit(): void {
    this.formAddTodo = this.formBuilder.group({
               name: ['', [Validators.required]  ],
             price: ['', [Validators.required, Validators.pattern('^[0-9]*$')]  ]
    });
  }

  addTodo() {
     this.todoService.addNewTodo(this.formAddTodo.value).subscribe(data => {
       this.roter.navigateByUrl('');
     });
  }
}
