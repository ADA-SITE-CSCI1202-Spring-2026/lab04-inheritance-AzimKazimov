import java.util.*;
public class Inheritance {
    
public class Person {
    
    private String firstName;
    private String lastName;
    private String gender;

   
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.gender = "";
    }

    public Person(String firstName, String lastName, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", Gender: " + gender;
    }

    
    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }
        return this.firstName.equals(p.getFirstName()) && 
               this.lastName.equals(p.getLastName()) && 
               this.gender.equals(p.getGender());
    }
}


public class Teacher extends Person {
    
    private String department;
    private String[] courses;

    
    public Teacher() {
        super(); 
        this.department = "";
        this.courses = new String[0];
    }

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {
        
        super(firstName, lastName, gender); 
        this.department = department;
        this.courses = courses;
    }

    
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    
    
    public String toString() {
        String courseList = "";
        if (courses != null) {
            courseList = java.util.Arrays.toString(courses);
        }
        
        return "Teacher Profile: " + super.toString() + 
               ", Department: " + department + 
               ", Courses: " + courseList;
    }

    
    public boolean equals(Teacher t) {
        if (t == null) {
            return false;
        }
        
        
        boolean isSamePerson = super.equals(t);
        
        
        boolean isSameDept = this.department.equals(t.getDepartment());
        
        return isSamePerson && isSameDept;
    }
}

public class Student extends Person {
    
    private String studentId;

    
    public Student() {
        super(); 
        this.studentId = "";
    }

    public Student(String firstName, String lastName, String gender, String studentId) {
        
        super(firstName, lastName, gender);
        this.studentId = studentId;
    }

    
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    
    public String toString() {
        return "Student Profile: " + super.toString() + 
               ", Student ID: " + studentId;
    }

    
    public boolean equals(Student s) {
        if (s == null) {
            return false;
        }

        
        boolean isSamePerson = super.equals(s);
        
        
        boolean isSameId = this.studentId.equals(s.getStudentId());

        return isSamePerson && isSameId;
    }
}


}
