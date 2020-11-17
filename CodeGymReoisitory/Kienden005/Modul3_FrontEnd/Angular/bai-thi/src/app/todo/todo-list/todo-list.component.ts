import { Component, OnInit } from '@angular/core';
import { TodoServicesService} from '../../services/todo-services.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})
export class TodoListComponent implements OnInit {
    public todolist;
  term: any;
  p: any;
  name: any;
  id: any;
  isDialog = false;
  idTodo: any;
  nameTodo: any;
  constructor(
      public todoService: TodoServicesService,
      public router: Router
  ) { }
  ngOnInit(): void {
    this.todoService.getAllTodo().subscribe(data => {
      this.todolist = data ;
    });
  }

  delete(id, name) {
              this.isDialog = true;
              this.idTodo = id ;
              this.name = name;
  }

  deleteDialod() {
    this.isDialog = false;
  }

  deleteAction() {
    this.todoService.deleteTodo(this.idTodo).subscribe(data => {
      this.ngOnInit();
      this.isDialog = false;
    });
  }
}
