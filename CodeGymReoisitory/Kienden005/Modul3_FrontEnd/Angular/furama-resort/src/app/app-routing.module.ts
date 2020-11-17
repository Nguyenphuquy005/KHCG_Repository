import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {Routes, RouterModule} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {EmployeeListComponent} from './components/employees/employee-list/employee-list.component';
import { CreatEmployeeComponent} from './components/employees/creat-employee/creat-employee.component';
import {FormsModule , ReactiveFormsModule} from '@angular/forms';
import { Ng2SearchPipeModule } from 'ng2-search-filter';
import {NgxPaginationModule} from 'ngx-pagination';
import { DeleteEmployeeDialogComponent } from './components/employees/delete-employee-dialog/delete-employee-dialog.component';
import { MatDialogModule } from '@angular/material/dialog';
import { BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { NoopAnimationsModule } from '@angular/platform-browser/animations';
import { UpdateEmployeeComponent } from './components/employees/update-employee/update-employee.component';

const routers: Routes = [
  {path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'create-employee', component: CreatEmployeeComponent},
  {path: 'update-employee/:id', component: UpdateEmployeeComponent},
  {path: '**', component: PageNotFoundComponent},
];
@NgModule({
  declarations: [HomeComponent, PageNotFoundComponent, EmployeeListComponent , CreatEmployeeComponent, DeleteEmployeeDialogComponent,
    UpdateEmployeeComponent],
  imports: [
    CommonModule,
    RouterModule.forRoot(routers),
    FormsModule,
    Ng2SearchPipeModule,
    NgxPaginationModule,
    ReactiveFormsModule,
    MatDialogModule,
    BrowserAnimationsModule,
    NoopAnimationsModule
  ],
  exports: [RouterModule, MatDialogModule],
  entryComponents: [DeleteEmployeeDialogComponent]
})
export class AppRoutingModule {
}
