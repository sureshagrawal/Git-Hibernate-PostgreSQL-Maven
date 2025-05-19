package org.nsgacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRoll(555);
        student.setName("siddhesh");
        student.setMks(99.99f);
        System.out.println(student);

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(org.nsgacademy.Student.class);
//        config.configure(); //default file name : hibernate.cfg.xml
//        SessionFactory factory;
//        factory = config.buildSessionFactory();


        SessionFactory factory = new Configuration()
                            .configure()
                            .addAnnotatedClass(org.nsgacademy.Student.class)
                            .buildSessionFactory();

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(student);
        transaction.commit();

        session.close();
        factory.close();
    }
}