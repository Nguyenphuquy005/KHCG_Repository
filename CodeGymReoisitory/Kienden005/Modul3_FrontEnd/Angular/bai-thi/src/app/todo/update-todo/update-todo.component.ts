import { Component, OnInit } from '@angular/core';
import {FormBuilder, Validators, FormGroup} from '@angular/forms';
import { TodoServicesService } from '../../services/todo-services.service';
import { Router, ActivatedRoute } from '@angular/router';
@Component({
  selector: 'app-update-todo',
  templateUrl: './update-todo.component.html',
  styleUrls: ['./update-todo.component.css']
})
export class UpdateTodoComponent implements OnInit {
  public formUpdateTodo: FormGroup;
  public idTodo: any;
   public gvht: any;
  constructor(
    public todoService: TodoServicesService,
    public formBuilder: FormBuilder,
    public roter: Router,
    public acticform: ActivatedRoute
  ) { }

  ngOnInit(): void {
    this.formUpdateTodo = this.formBuilder.group({
      msv: [''],
      name: ['', [Validators.required, Validators.pattern('^([a-zA-X]|[(\\s)])*$')]],
      group: ['', [Validators.required, Validators.pattern('^(Nhóm[\\s]1|Nhóm[\\s]2|Nhóm[\\s]3)$')]],
      dt: [this.gvht , [Validators.required]],
      teacher: [''],
      email: ['', [Validators.required, Validators.email] ],
      phone: ['', [Validators.required, Validators.pattern('^[0-9]{10,12}$')] ]
    });
    this.acticform.params.subscribe(data => {
      this.idTodo = data.id;
      // tslint:disable-next-line:no-shadowed-variable
      this.todoService.getByIdTodo(this.idTodo).subscribe(data => {
        console.log(data);
         });
      });
  }
  editTodo() {
          this.todoService.updateTodo(this.formUpdateTodo.value, this.idTodo).subscribe(data => {
            this.roter.navigateByUrl('/');
            console.log(this.gvht.value);
          });
  }
}
