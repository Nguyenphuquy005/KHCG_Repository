import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TodoListComponent } from './todo/todo-list/todo-list.component';
import { Routes, RouterModule } from '@angular/router';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import { NgxPaginationModule } from 'ngx-pagination';
import { AddTodoComponent } from './todo/add-todo/add-todo.component';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { UpdateTodoComponent } from './todo/update-todo/update-todo.component';

const routers: Routes = [
  {path: '', component: TodoListComponent},
  {path: 'add-todo', component: AddTodoComponent},
  {path: 'update-todo/:id', component: UpdateTodoComponent}
]

@NgModule({
  declarations: [TodoListComponent, AddTodoComponent, UpdateTodoComponent],
  exports: [
    TodoListComponent,
  ],
  imports: [
    CommonModule,
    RouterModule.forRoot(routers),
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    ReactiveFormsModule,
  ]
})
export class AppRoutingModule { }
