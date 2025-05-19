package org.nsgacademy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stud")
public class Student {
    @Id
    @Column(name="st_roll")
    private int roll;
    @Column(name="st_name")
    private String name;
    @Column(name="st_mks")
    private float mks;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMks() {
        return mks;
    }

    public void setMks(float mks) {
        this.mks = mks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", mks=" + mks +
                '}';
    }
}
