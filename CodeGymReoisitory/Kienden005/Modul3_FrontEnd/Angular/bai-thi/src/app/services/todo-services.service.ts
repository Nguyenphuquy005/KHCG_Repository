import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TodoServicesService {
     public API = ' http://localhost:3000/todo';
  constructor(
    public http: HttpClient
  ) {
  }
  getAllTodo(): Observable<any>{
          return this.http.get(this.API);
  }
  addNewTodo(todo): Observable<any>{
    return  this.http.post(this.API, todo);
  }
  deleteTodo(id): Observable<any>{
    return this.http.delete(this.API + '/' + id);
  }
  getByIdTodo(id): Observable<any>{
    return  this.http.get(this.API + '/' + id);
  }
  updateTodo(todo, id): Observable<any>{
    return this.http.put(this.API + '/' + id , todo);
  }
}
