package org.nsgacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setRoll(555);
//        student.setName("siddhesh");
//        student.setMks(99.99f);
//        System.out.println(student);

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(org.nsgacademy.Student.class);
//        config.configure(); //default file name : hibernate.cfg.xml
//        SessionFactory factory;
//        factory = config.buildSessionFactory();


        SessionFactory factory = new Configuration()
                            .configure()
                            .addAnnotatedClass(org.nsgacademy.Student.class)
                            .buildSessionFactory();

//        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(student); //earlier in version 6, method was save()
//        transaction.commit();


        Session session = factory.openSession();

//        eager fetching : query will get executed whether we use it or not after fetching
//        Student student = session.find(Student.class,111); //earlier in version 6, method was get()
//        System.out.println(student);

//        Student student = session.byId(Student.class).load(222); //another way to retrieve data by ID
//        System.out.println(student);



//        lazy fetching : if we dont print data after fetching then query will not get executed
//        Student student = session.byId(Student.class).getReference(222); //another way to retrieve data by ID
//        System.out.println(student);

        session.close();
        factory.close();
    }
}