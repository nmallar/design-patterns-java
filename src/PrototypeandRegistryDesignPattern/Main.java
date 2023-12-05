package PrototypeandRegistryDesignPattern;

public class Main {

    public static void main(String[] args) {

//       without registry
//        Student st=new Student();
//        Student is=new IntelligentStudent();
//
////        Student copy=st.copy();
////        st.printValues();
//
//        Student copy2=is.copy();
//        is.printValues();

        //with registry

        StudentRegistry sr=new StudentRegistry();
        sr.addStudent("nov21batch", new Student("no21batch"));
        sr.addStudent("aug21batch", new Student("aug21batch"));

        Student amar=sr.getStudent("nov21batch");
        amar.setName("amar");
        amar.printValues();

    }
}
