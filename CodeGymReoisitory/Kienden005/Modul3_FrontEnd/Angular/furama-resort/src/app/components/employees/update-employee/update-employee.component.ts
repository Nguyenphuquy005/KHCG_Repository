import { Component, OnInit } from '@angular/core';
import {EmployeeService} from '../../../services/employee.service';
import {Employee} from '../../../module/employee.class';
import {Router, ActivatedRoute} from '@angular/router';
import { FormGroup , FormBuilder , Validators } from '@angular/forms';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  public formEdit: FormGroup;
  list: string;
  flase: any;
  public maxday = new Date();
  public minday = new Date(1990, 0, 1);
  public employeeId ;
  constructor(public  employeeService: EmployeeService,
              public formBuider: FormBuilder,
              public router: Router,
              public acticrouter: ActivatedRoute
              ) {
  }
  ngOnInit(): void {
    this.formEdit = this.formBuider.group({
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
    this.acticrouter.params.subscribe(data => {
      this.employeeId = data.id;
      this.employeeService.getEmployeeById(this.employeeId).subscribe(data => {
        this.formEdit.patchValue(data);
      });
    });
  }

  onEditEmployee() {
     this.employeeService.editEmployee(this.formEdit.value, this.employeeId).subscribe(data =>{
       this.router.navigateByUrl('employee-list');
     });
  }
}
