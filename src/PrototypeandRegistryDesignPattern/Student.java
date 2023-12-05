package PrototypeandRegistryDesignPattern;

public class Student {

    private String name;
    private int age;
    private String gender;

    private String batch;
    public Student(){}

    public Student(String batch){
        this.batch=batch;
    }

    public Student(Student obj){
        this.age=obj.age;
        this.gender=obj.gender;
        this.name=obj.name;
        this.batch=obj.batch;

    }

    public Student copy(){
        return new Student(this);
    }
    public void printValues(){
        System.out.println("Name "+this.name);
        System.out.println("Age "+this.age);
        System.out.println("Gender "+this.gender);


    }

    public void setName(String name) {
        this.name = name;
    }
}
