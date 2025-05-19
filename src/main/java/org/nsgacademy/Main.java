package org.nsgacademy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setRoll(111);
        student.setName("om ghodekar");
        student.setMks(99.99f);
        System.out.println(student);
    }
}