export class Employee {
  public id: number;
  public fullName: string;
  public position: string;
  public academicLevel: string;
  public part: string;
  public dateOfBirth: string;
  public salary: string;
  public email: string;
  public phoneNumber: string;
  public address: string;
  // tslint:disable-next-line:max-line-length
  constructor(fullName: string, position: string, academicLevel: string, part: string, dateOfBirth: string, salary: string, email: string, phoneNumber: string, address: string) {
    fullName = this.fullName;
    position = this.position;
    academicLevel = this.academicLevel;
    part = this.part;
    dateOfBirth = this.dateOfBirth;
    salary = this.salary;
    email = this.email;
    phoneNumber = this.phoneNumber;
    address = this.address;
  }
}
