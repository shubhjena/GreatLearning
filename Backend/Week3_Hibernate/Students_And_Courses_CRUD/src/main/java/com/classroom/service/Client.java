package com.classroom.service;

import com.classroom.entities.Course;
import com.classroom.entities.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        StandardServiceRegistry standardServiceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata = new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder().build();
//        Session session = sessionFactory.openSession();
        Session session = sessionFactory.getCurrentSession();
        Transaction t = session.beginTransaction();
        //Create Entry
//        Student s1 = new Student("Shubh",21);
//        Student s2 = new Student("Ajay",1);
//        session.save(s1);
//        session.save(s2);
//        System.out.println("Successfully Saved!");

        //Read Entry
        /*
        *Get Vs Load
        *load will throw error get(null) will not throw error
        * use get when we are not sure if the id exists
        * use load if we are sure that id definitely exists
        * load has better performance - initializes the object only if it is called
        * Read lazy loading vs eager loading
        */
//        Student student = session.find(Student.class,1);
//        Student student = session.get(Student.class,1);
//        Student student = session.load(Student.class,1);
//        System.out.println("Student Details: "+student);

        //Update Entry
//        Student student = session.get(Student.class,3);
//        if(null == student){
//            student = new Student();
//            student.setName("Ankit");
//            student.setRollNo(25);
//        }else{
//            student.setName("Akhil");
//        }
//        session.saveOrUpdate(student);
//        System.out.println("Student Details Updated!");

        //Delete Entry
//        Student student = session.find(Student.class,3);
//        session.delete(student);
//        System.out.println("Successfully Deleted!");

        //Custom Query
//        Query query =session.createQuery("SELECT s FROM Student s WHERE s.rollNo > :rn")
//                .setParameter("rn",13);
//        List<Student> students=query.getResultList();

        //Assignment: Student course relationship: ONe student will take one course; many students can take one course
        //Create courses
//        String[] courses = {"JAVA","Python","JavaScript"};
//        for (int i = 0; i < 3; i++) {
//            Course course = new Course(courses[i]);
//            session.save(course);
//        }
//        System.out.println("Successfully Saved Courses!");
        Object[][] studentData = {
                {"Shubh", 21, 1},
                {"Tarun", 11, 2},
                {"Jaya", 15, 3},
                {"Ajay", 32, 1},
                {"Rohit", 9, 2},
                {"Prashant", 102, 3},
                {"Kunal", 25, 2},
                {"Abhi", 29, 1},
                {"Shamal", 33, 1},
                {"Pragyan", 14, 3},
        };
        for (int i = 0; i < studentData.length; i++) {
            String name = (String) studentData[i][0];
            int rollNo = (int) studentData[i][1];
            int courseId = (int) studentData[i][2];
            Course course = session.find(Course.class, courseId);
            Student student = new Student(name, rollNo, course);
            session.save(student);
        }
        System.out.println("Successfully Saved Students!");

        t.commit();
//        sessionFactory.close();
        session.close();
    }
}

