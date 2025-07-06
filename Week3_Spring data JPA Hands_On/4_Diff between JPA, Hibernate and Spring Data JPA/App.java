package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Create SessionFactory
        SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(Employee.class)
            .buildSessionFactory();

        // Create session
        Session session = factory.getCurrentSession();

        try {
            // Create new Employee
            Employee emp = new Employee();
            emp.setFirstName("John");
            emp.setLastName("Doe");
            emp.setSalary(50000);

            // Start transaction
            session.beginTransaction();

            // Save employee object
            session.persist(emp);

            // Commit transaction
            session.getTransaction().commit();
            System.out.println("Employee inserted successfully!");
        } finally {
            factory.close();
        }
    }
}
