package com.hibernatejpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

public class JpaCrud 
{
	public void insertRecord(Student st) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(st); // used to insert data into database
        entityManager.getTransaction().commit();
        entityManager.clear();
        System.out.println("Record Successfully inserted in to Database");
    }
	
	public void deleteRecordById(int id) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Student s =entityManager.find(Student.class, id);
        entityManager.remove(s); // used to insert data into database
        entityManager.getTransaction().commit();
        entityManager.clear();
        System.out.println("Record Successfully deleted in to Database");
    }
	
	public void searchRecordById(int id) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Student s =entityManager.find(Student.class, id);
        System.out.println("Id: "+s.getSid());
        System.out.println("Name: "+s.getSname());
        System.out.println("Dept: "+s.getSdept());
        entityManager.getTransaction().commit();
        entityManager.clear();
        System.out.println("Record Successfully find in to Database");
    }
	

	public void updateRecordById(int id, String name, String dept) {
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        Student s =entityManager.find(Student.class, id);
        s.setSname(name);
        s.setSdept(dept);
        entityManager.getTransaction().commit();
        entityManager.clear();
        System.out.println("Record Successfully updated in to Database");
    }
	
	public void fetchStudentRecord() 
	{
        EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();
        entityManager.getTransaction().begin();
        List<Student> studentsList = new ArrayList<Student>();
        studentsList = entityManager.createQuery("FROM Student").getResultList();
        if (studentsList == null) {
            System.out.println("No Record Found");
        } else {
            for (Student student : studentsList) {
                System.out.println("student id :: " + student.getSid());
                System.out.println("student name :: " + student.getSname());
                System.out.println("student Dept :: " + student.getSdept());
            }
        }
    }
}
