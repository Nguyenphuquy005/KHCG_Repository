import { Component, OnInit , Inject} from '@angular/core';
import { MatDialogRef, MAT_DIALOG_DATA} from '@angular/material/dialog';
import { EmployeeService } from '../../../services/employee.service';

@Component({
  selector: 'app-delete-employee-dialog',
  templateUrl: './delete-employee-dialog.component.html',
  styleUrls: ['./delete-employee-dialog.component.css']
})
export class DeleteEmployeeDialogComponent implements OnInit {
public employeeOfFullname;
public employeeOfId;
  constructor(
    public employeeService: EmployeeService,
    public dialogRef: MatDialogRef<DeleteEmployeeDialogComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any) {}

  ngOnInit(): void {
this.employeeOfFullname = this.data.data1.fullName;
this.employeeOfId = this.data.data1.id;
}

  deleteEmployee() {
     this.employeeService.deleteEmployee(this.employeeOfId).subscribe(data => {
       this.dialogRef.close();
     });
  }
}
