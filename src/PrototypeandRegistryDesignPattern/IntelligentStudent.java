package PrototypeandRegistryDesignPattern;

public class IntelligentStudent extends Student{


    private int iq;
    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent obj){
        super(obj);
        this.iq=obj.iq;

    }
    @Override
    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }

    @Override
    public void printValues(){
//        System.out.println("Name "+this.name);
//        System.out.println("Age "+this.age);
//        System.out.println("Gender "+this.gender);
        System.out.println("IQ  "+this.iq);

    }
}
