use anpc8336 ;
show tables;

select * from employee  ;
select count(distinct(empDepartment)) from Employee;


select * from employee order by empSalary desc  , empname desc ;

select empstate, sum(empsalary) from employee group by empstate order by empstate  ;

-- write a query to get highest budget spending on top three state 
select empstate, sum(empsalary) from employee group by empstate order by empstate desc   ;
select empstate, sum(empsalary) as emp_salary from employee group by empstate order by emp_salary desc limit 3;

-- how to get all empname whose name is starting from  r ;
select empName from employee where empname like 'r%' ;

-- fing any name that ends with a  ;

select empName from employee where empname like '%a' ;

-- find all name that have sh at any position 
select empName from employee where empname like '%sh%' ;

-- find all name that have a at second position 
select empName from employee where empname like '_a%' ;

-- find all name that have atleast  3 characater and that are stating wih a ;

select empName from employee where empname like 'a__%' ;

--  find a name which is starting with r and ending with  a
 ;
 
 select empName from employee where empname like 'r%a' ;
-- AND  , or 
-- IN  
select * from  employee  where empdepartment = 'it' or empdepartment = 'hr';

select * from  employee  where empdepartment IN ('it'  , 'hr');

select * from  employee ;
-- Exists
-- delete from employee where exists (select * from employee where empDepartment = "operations" ) ;

-- DELETE FROM employee 
-- WHERE EXISTS (
--     SELECT * FROM employee WHERE empDepartment = "operations"
-- );


-- select exists ( select  * from Employee where empDepartment = 'it' ) as highestSalary ;
select *  from Employee where empDepartment not in ('it' , 'hr') ;

select * from Employee where empID between  1 and  10;
 --         --------------------unique key -----------------------
create table schools  (schoolId int unique  , schoolName varchar(220)  )  ;
desc schools  ;

insert into schools values (1,"IndraGhandhi" )  ;
select * from schools  ;

 --   primary key 
 -- each table can have single primary key  
 -- it would always not null 
 -- it would be unique  
 -- 
 
 create table mobile ( mid int primary key  , mobileModel varchar(225)  )  ;
 desc mobile  ;
 alter table schools add primary key (schoolId , schoolName)  ;
 select * from schools  ;
 desc schools ;
 insert into schools (SchoolName) values(  "Tagore") ;
 
 TRUNCATE table schools ;
 alter table schools drop primary key  ;
 
CREATE TABLE orders (
    oid INT,
    name VARCHAR(225),
    companyname VARCHAR(225),
    PRIMARY KEY (oid , name)
);
 
 select * from orders ;
 insert into orders values ( 2  , 'Pant' , 'anouk' ) ;

 
 -- ----------------------------- constraints -------------------------------------------------
 
CREATE TABLE sttt (

    sid INT PRIMARY KEY AUTO_INCREMENT,
    sname VARCHAR(225) UNIQUE,
    age INT CHECK (age > 18),
    city VARCHAR(225) DEFAULT 'Indore'
    
);
 insert into sttt ( sname  , age) values("sachin"  , 19)  ;
 select * from sttt  ;
 drop table sttt  ;
 
 show tables  ;
 
 
 create table shirts (id  int  , name varchar(225)  , size enum('s', 'l' , 'xl')  );
 
 insert into shirts values (90  , 'mufty'  , 'xl') ;
 
 desc shirts ;
 
 create table person (pid int primary key  ,  name varchar (225) )  ;
 -- jo bhi table pehale banat hai that will be  parent table 
 
 CREATE TABLE MobileNumer (
    NumberID INT PRIMARY KEY,
    mobileNumber VARCHAR(225),
    personID INT,
    
    Foreign key(personID)  references Person (pid)  
    
);

insert into person values (12 , "Shshank" )  ;
insert into MobileNumer values (235  , "23333322"  , 12) ;
insert into person values ( 23  , "Sachin" ) ;
insert into mobileNumer values (232 , "7770913190" , 23) ;

insert into mobileNumer values (23289 , "9977661085" , 8989) ;
select * from person  ;

select * from mobilenumer;

 -- one to  one one person should have one adhaar  
 
 CREATE TABLE AdharCard (
    AdharcardNumber INT PRIMARY KEY,
    personId INT UNIQUE,
    issue_date DATE,
    
    foreign key (personId) references person(pid) 
    
);

insert into AdharCard values (23232323 , 23 , '2024-12-02' ) ;
 
 
insert into AdharCard values (23290323 , 23 , '2024-12-02' ) ;
 
 select * from AdharCard ;
 
 
 SELECT 
    p.pid, p.name, m.mobileNumber
FROM
    person p
        INNER JOIN
    MobileNumer m ON p.pid = m.personID;
 
 SELECT 
    p.pid, p.name, a.AdharCardNumber
FROM
    person p
        INNER JOIN
    AdharCard a ON p.pid = a.personID;
    
    
create table Studentt( studentId int primary key  ,  name varchar(225)  )  ;
create table course( courseid int primary key  , coursename varchar(225)  ) ;

CREATE TABLE student_course (
    studentid INT,
    courseid INT,
   primary key (studentid ,courseid )  ,

    foreign key (studentid) references Studentt(studentId)  ,
     foreign key (courseid) references course(courseid)  
    
    
) ;
insert into studentt values ( 12  , 'Ruhul') ;
insert into studentt values ( 13  , 'Shashank') ;

insert into course  values ( 67  , 'java') ;
insert into course values (24  , 'C++' )  ;
insert into course values (28 , 'python' )  ;




insert into student_course  values (13 , 24)  ;
insert into student_course  values (13 , 28 ) ;

SELECT 
    s.studentId, s.name AS Student_name, c.coursename
FROM
    student_course sc
        INNER JOIN
    studentt s ON s.studentId = sc.studentid
        INNER JOIN
    course c ON sc.courseid = c.courseid;
    
select * from employee  ;


  
 

















