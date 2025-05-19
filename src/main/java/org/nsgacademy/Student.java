package org.nsgacademy;

public class Student {
    private int roll;
    private String name;
    private float mks;

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", mks=" + mks +
                '}';
    }

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
}
