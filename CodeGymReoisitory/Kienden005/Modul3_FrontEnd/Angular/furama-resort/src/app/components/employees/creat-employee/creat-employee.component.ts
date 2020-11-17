import {Component, OnInit} from '@angular/core';
import {EmployeeService} from '../../../services/employee.service';
import {Employee} from '../../../module/employee.class';
import {Router} from '@angular/router';
import { FormGroup , FormBuilder , Validators } from '@angular/forms';

@Component({
  selector: 'app-creat-employee',
  templateUrl: './creat-employee.component.html',
  styleUrls: ['./creat-employee.component.css']
})
export class CreatEmployeeComponent implements OnInit {

  public formAddNew: FormGroup;
  list: string;
  flase: any;
  public maxday = new Date();
  public minday = new Date(1990, 0, 1);
  constructor(public  employeeService: EmployeeService,
              public formBuider: FormBuilder,
              public router: Router) {
  }
  ngOnInit(): void {
    this.formAddNew = this.formBuider.group({
      fullName: ['', [Validators.required]],
      position: ['', [Validators.required]],
      academicLevel: ['', [Validators.required]],
      part: ['', [Validators.required]],
      dateOfBirth: ['', [Validators.required]],
      identityNumber: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      salary: ['', [Validators.required, Validators.pattern('^[0-9]{0,10}$')]],
      email: ['', [Validators.required, Validators.email]],
      phoneNumber: ['', [Validators.required, Validators.pattern('^(090|091|[\(]84[\)][\+]91|[\(]84[\)][\+]90)[0-9]{7}$')]],
      address: ['', [Validators.required]],
    });
  }

  onAddEmployee() {
    this.employeeService.addEmployee(this.formAddNew.value).subscribe(data => {
      this.router.navigateByUrl('employee-list');
    });
    console.log(this.formAddNew);
  }
}
