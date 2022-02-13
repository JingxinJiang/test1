/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * Jingxin
 */
package student;

/**
 *
 * @author Ronak
 */
public class StudentList {
    public static void main(String[] args)
    {
        Student [] studentList =new Student[4];
        
        Student s1 = new Student();
        s1.setName("Ronak");
        
        Student s2 = new Student();
        s2.setName("Sheth");
        
        Student s3 = new Student();
        
        s3.setName("Selena");
        
        Student s4 = new Student();
        s4.setName("tanya");
        
        studentList[0] =s1;
        studentList[1] =s2;
        studentList[2] =s3;
        studentList[3] =s4;
        for (Student s : studentList){
            System.out.println(s.getName());
        }
        PartTimeStudents [] PartTimestudentList =new PartTimeStudents[2];
        
        PartTimeStudents p1 = new PartTimeStudents(20, "lycy");
        PartTimeStudents p2 = new PartTimeStudents(18, "liy");
        PartTimestudentList[0]=p1;
        PartTimestudentList[1]=p1;
        for (PartTimeStudents p : PartTimestudentList){
            System.out.println(p.getName());
        }
        
        
    }
    
}
