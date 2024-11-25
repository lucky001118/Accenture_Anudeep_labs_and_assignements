SELECT * FROM accenture.employee;

use accenture;
 
 SELECT * FROM employee;
 
 CREATE TABLE Employee (
    EmpId INT PRIMARY KEY,
    EmpName VARCHAR(255),
    EmpDepartment VARCHAR(255),
    EmpJoiningDate DATE,
    EmpSalary DOUBLE,
    EmpCity VARCHAR(255),
    EmpState VARCHAR(255)
);

INSERT INTO Employee (EmpId, EmpName, EmpDepartment, EmpJoiningDate, EmpSalary, EmpCity, EmpState) VALUES
(1, 'Rajesh Kumar', 'IT', '2020-06-15', 75000.50, 'Bangalore', 'Karnataka'),
(2, 'Neha Sharma', 'HR', '2021-04-22', 60000.00, 'Mumbai', 'Maharashtra'),
(3, 'Arun Mehta', 'Finance', '2019-11-11', 85000.75, 'Delhi', 'Delhi'),
(4, 'Suman Gupta', 'Marketing', '2022-02-05', 55000.00, 'Kolkata', 'West Bengal'),
(5, 'Amit Trivedi', 'Operations', '2018-09-14', 50000.00, 'Ahmedabad', 'Gujarat'),
(6, 'Priya Kapoor', 'IT', '2020-03-30', 95000.00, 'Hyderabad', 'Telangana'),
(7, 'Karan Malhotra', 'Finance', '2021-10-17', 72000.00, 'Chennai', 'Tamil Nadu'),
(8, 'Rita Desai', 'HR', '2017-08-25', 58000.00, 'Pune', 'Maharashtra'),
(9, 'Vikram Singh', 'Sales', '2019-01-20', 67000.00, 'Jaipur', 'Rajasthan'),
(10, 'Ankita Roy', 'IT', '2022-07-01', 80000.00, 'Lucknow', 'Uttar Pradesh'),
(11, 'Gopal Mishra', 'Operations', '2016-05-10', 47000.00, 'Patna', 'Bihar'),
(12, 'Meena Iyer', 'Finance', '2021-03-12', 90000.00, 'Coimbatore', 'Tamil Nadu'),
(13, 'Rohan Verma', 'Marketing', '2018-12-05', 60000.00, 'Nagpur', 'Maharashtra'),
(14, 'Pooja Jain', 'HR', '2019-09-18', 62000.00, 'Bhopal', 'Madhya Pradesh'),
(15, 'Sunil Yadav', 'Sales', '2020-01-28', 70000.00, 'Kanpur', 'Uttar Pradesh'),
(16, 'Sonal Chauhan', 'IT', '2021-06-23', 78000.00, 'Surat', 'Gujarat'),
(17, 'Deepak Joshi', 'Finance', '2020-11-03', 85000.00, 'Indore', 'Madhya Pradesh'),
(18, 'Kavita Menon', 'Operations', '2017-07-15', 52000.00, 'Kochi', 'Kerala'),
(19, 'Manoj Pandey', 'Marketing', '2019-04-29', 59000.00, 'Varanasi', 'Uttar Pradesh'),
(20, 'Shreya Das', 'HR', '2020-08-11', 56000.00, 'Guwahati', 'Assam');

-- get total salary of emp of  Maharashtra  
select SUM(EmpSalary) AS SUM_SALARY From Employee where EmpState='Maharashtra' ;

-- you have to all emp from karanataka but their id should be less than 15
select * from Employee Where EmpState = 'karnataka'and empid < 15  ;

-- you have to all emp who is from deparment IT and state is gujrat  or any emp can have salaray above 70000 );
select * from Employee where (empDepartment = 'IT' and  empState = 'Gujarat'  ) or empSalary  > 70000 ;

-- checking the limit command
select * from Employee LIMIT 6;

-- fitering employees higher paid if they have 70000+ salary else lower paid
Select *  ,IF(EmpSalary>70000, "Higher paid" ,"Lower paid") AS SalaryStatus from Employee;

-- checking the CASE 
Select *  , CASE EmpState when "Maharashtra" THEN "M" WHEN "Karnataka" THEN "K" END AS StateSymbol from Employee;

-- HOW TO GET all imployee name whos name starts with R 
Select EmpName from  Employee where EmpName like 'r%' ;

-- HOW TO GET all imployee name whos name starts with A 
Select EmpName from  Employee where EmpName like 'a%' ;

-- find all name that have 'sh' at any position
Select EmpName from  Employee where EmpName like '%sh%' ;

-- find all name that have 'a' at second position
Select EmpName from  Employee where EmpName like '_a%' ;

-- find all names that have atleast three char and that are starting with 'a' 
Select EmpName from  Employee where EmpName like 'a__%' ;

-- fid the name that start with r and ending with a
Select EmpName from  Employee where EmpName like 'r%a' ;

-- use of AND, OR operator

-- use of IN, it is the use as replacement of OR 
select * from employee where empDepartment = 'it' OR empDepartment = 'hr';
select * from employee where empDepartment in ('it','hr');

-- use of EXIST 
-- delete from employee where exists(select * from employee where empDepartment = "Operations" );  ---- it's wrong
select exists(select * from employee where empSalary = 95000 ) as highestSalary;

-- use of Not keyword 
select * from employee where EmpDepartment not in ('IT', 'HR'); 

-- use of BETWEEN
select * from Employee where empId between 1 and 5;

