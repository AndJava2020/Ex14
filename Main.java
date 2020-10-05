package ru.AndJava2020.Ex14;

public class Main {


    public static void main(String[] args) {
        // write your code here
        Test[] students=new Student[]{
                new Student(3.0),
                new Student(4.0),
                new Student(5.0),
                new Student(4.0),
                new Student(3.0),
        };

        System.out.println(iteratSearch(students, students[2]));
        Student[] students2=new Student[]{
                new Student(5.0),
                new Student(4.0),
                new Student(3.0),
                new Student(2.0)
        };
        System.out.println();
        System.out.println(students2[2]);
        System.out.println(binSearch(0,students2.length-1,students2,students2[2]));
    }

    public static Test iteratSearch(Test[] mass, Test t){
        for (Test g:mass
        ) {
            if(g==t) return g;
        }
        return null;
    }
    public static Test binSearch(int begin, int end,Test[] mass, Test t){
        int mid=(begin+end)/2;
        if(mass[mid]==t) return mass[mid];
        if(begin==mid||end==mass.length) return null;
        if(t.getiDNumber()<mass[mid].getiDNumber()) return binSearch(begin,mid, mass, t);
        else {
            return binSearch(mid, end, mass, t);
        }
    }

}
