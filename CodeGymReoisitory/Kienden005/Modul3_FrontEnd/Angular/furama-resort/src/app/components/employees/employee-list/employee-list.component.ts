import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../../services/employee.service';
import {Employee} from '../../../module/employee.class';
import {MatDialog } from '@angular/material/dialog';
import { DeleteEmployeeDialogComponent } from '../delete-employee-dialog/delete-employee-dialog.component';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {
  public employees;
  id: number;
  public employee: Employee[];
  term: string;
  p: any;
  name: any;

  constructor(
    public employeeService: EmployeeService,
    public dialog: MatDialog
  ) {
  }

  ngOnInit(): void {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.employees = data;
    });
  }

  openDialog(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(dataOfEmployee => {
      const dialogRef = this.dialog.open(DeleteEmployeeDialogComponent, {
        height: '400px',
        width: '600px',
        data: { data1: dataOfEmployee },
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
                this.ngOnInit();
        });
    });
  }
}
