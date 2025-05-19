package org.nsgacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Configuration config = new Configuration();
//        config.addAnnotatedClass(org.nsgacademy.Student.class);
//        config.configure(); //default file name : hibernate.cfg.xml
//        SessionFactory factory;
//        factory = config.buildSessionFactory();

//        step - 1 : create factory which contains all database connection info and object details
        SessionFactory factory = new Configuration()
                            .configure()
                            .addAnnotatedClass(org.nsgacademy.Student.class)
                            .buildSessionFactory();



//        step - 2 : make connection i.e. session
        Session session = factory.openSession();



//        step - 3 : Execute Query -- Insert data
//        persist()/save() : it will execute INSERT query

//        Student student = new Student();
//        student.setRoll(555);
//        student.setName("siddhesh");
//        student.setMks(99.99f);
//        Transaction transaction = session.beginTransaction();
//        session.persist(student); //earlier in version 6, method was save()
//        transaction.commit();



//        step - 3 : Execute Query -- Select data and print data
//        find()/get()/byId() : It will execute SELECT query

//        eager fetching : query will get executed whether we use it or not after fetching
//        Student student = session.find(Student.class,111); //earlier in version 6, method was get()
//        System.out.println(student);

//        Student student = session.byId(Student.class).load(222); //another way to retrieve data by ID
//        System.out.println(student);


//        lazy fetching : if we dont print data after fetching then query will not get executed
//        Student student = session.byId(Student.class).getReference(222); //another way to retrieve data by ID
//        System.out.println(student);



//        step - 3 : Execute Query -- Update data
//        merge() : it will execute UPDATE/INSERT query
//        merge() : it will always first search whether record is present or absent, if present then update record and if absent then insert new record

//        Student student = new Student();
//        student.setRoll(666);
//        student.setName("kiran");
//        student.setMks(70.00f);
//        Transaction transaction = session.beginTransaction();
//        session.merge(student); //if related data is present then update record otherwise insert record
//        transaction.commit();



//        step - 3 : Execute Query -- Delete data
//        remove() : it will execute DELETE query
//        before remove, first retrieve object by using find()
        Transaction transaction = session.beginTransaction();
        Student student = session.find(Student.class,222);
        session.remove(student);
        transaction.commit();



//        step - 4 : Close session i.e. connection and also close resource i.e. factory
        session.close();
        factory.close();
    }
}