package com.c01;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Student)) return false;
        Student s=(Student)obj;
        if (this.getAge() == s.getAge()
                    && this.getName() == s.getName()) {
                return true;
            }else return false;


//        if (obj instanceof Student) {
//            Student s = (Student) obj;
//            if (this.getAge() == s.getAge()
//                    && this.getName() == s.getName()) {
//                return true;
//            }else return false;
//        } else {
//            return false;
//        }
    }
}
