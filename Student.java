package ru.AndJava2020.Ex14;

public class Student implements Test {
    private static int value=0;
    private int iDNumber;
    private double GPA;

    Student(double gpa){
        value++;
        this.iDNumber=value;
        this.GPA=gpa;
    }
    public double getGPA() {
        return GPA;
    }
    public int getiDNumber() {
        return iDNumber;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return iDNumber == student.iDNumber;
    }
    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", GPA=" + GPA +
                '}';
    }
}