Use anudeep_student_management_system;

select * from student;

-- Modified Student table
CREATE TABLE Student (
    RollNo INT PRIMARY KEY AUTO_INCREMENT, -- Made RollNo the primary key
    Name VARCHAR(50) NOT NULL,
    Address VARCHAR(60)
);

-- Modified Student table
ALTER TABLE Student
MODIFY COLUMN RollNo INT PRIMARY KEY AUTO_INCREMENT, -- Made RollNo the primary key
MODIFY COLUMN Name VARCHAR(50) NOT NULL;

-- checking the description of the student table
desc student;

-- Course table with one-to-many relationship with Student
CREATE TABLE Course (
    CourseID INT PRIMARY KEY AUTO_INCREMENT, -- Unique ID for each course
    CourseName VARCHAR(100) NOT NULL,       -- Name of the course
    Description TEXT,                      -- Optional course description
    EnrollDate DATE NOT NULL,              -- Date of enrollment
    CompletionDate DATE,                   -- Date of completion
    RollNo INT,                            -- Foreign key to Student table
    FOREIGN KEY (RollNo) REFERENCES Student(RollNo) ON DELETE CASCADE
);

-- chaching the desc for the course
desc course;

-- Insert dummy data into Student table
INSERT INTO Student (Name, Address) VALUES
('John Doe', '123 Main St'),
('Jane Smith', '456 Elm St'),
('Alice Johnson', '789 Oak St');

-- Insert dummy data into Course table
INSERT INTO Course (CourseName, Description, EnrollDate, CompletionDate, RollNo) VALUES
('Mathematics', 'Basic algebra and calculus', '2025-01-01', '2025-06-01', 1),
('Physics', 'Mechanics and thermodynamics', '2025-02-01', '2025-07-01', 1),
('Chemistry', 'Organic and inorganic chemistry', '2025-03-01', NULL, 2),
('Biology', 'Anatomy and genetics', '2025-04-01', NULL, 3);

-- query for the view all data from the both table and in single table
SELECT 
    s.RollNo,
    s.Name AS StudentName,
    s.Address,
    c.CourseID,
    c.CourseName,
    c.Description,
    c.EnrollDate,
    c.CompletionDate
FROM 
    Student s
INNER JOIN 
    Course c
ON 
    s.RollNo = c.RollNo;

