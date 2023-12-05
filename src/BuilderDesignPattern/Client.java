package BuilderDesignPattern;
//This is the client
public class Client {

    public static void main(String[] args) throws Exception {




        //method chaining
        //Student.getBuilder().setName().setAge().setPsp().setAddress();

        Student s = Student.getBuilder()
                .setName("Mailar")
                .setPsp(78)
                .setAge(25)
                .setAddress("Blr")
                .build();

        s.printValues();
    }
}
