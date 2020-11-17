
create database projectMd4;
use  projectMd4;
create table tickerPices (
  id int UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nameTicker nvarchar(30) not null,
  showTime nvarchar(30) not null,
  thu246gt Double not null,
  thu246gv  Double not null,
  thu246gd  Double not null,
  thu3gt Double not null,
  thu3gv  Double not null,
  thu3gd  Double not null,
  thu67CNgt Double not null,
  thu67CNgv  Double not null,
  thu67CNgd  Double not null
);
insert into tickerPices (nameTicker,showTime,thu246gt,thu246gv,thu246gd,thu3gt,thu3gv,thu3gd,thu67CNgt,thu67CNgv,thu67CNgd)
values ('Giá vé 2D','Trước 17h', 40000 , 45000 , 10000 , 50000,55000,120000, 55000, 60000, 150000 ),
        ('Giá vé 2D','Sau 17h', 45000 , 50000 , 110000,60000,70000,150000,65000,70000,180000),
		('Giá vé 3D','Trước 17h', 60000 , 65000 , 140000, 80000,90000,170000, 85000,10000,190000),
        ('Giá vé 3D','Sau 17h', 80000 , 90000 , 200000, 80000, 100000 ,210000, 90000,110000,210000);