package BuilderDesignPattern;

public class Student {

    private String name;
    private String address;
    private double psp;
    private int age;

    private Student(Builder b){
        this.address=b.getAddress();
        this.psp=b.getPsp();
        this.age=b.getAge();
        this.name=b.getName();
    }
    public void printValues(){
        System.out.println("Name "+this.name);
        System.out.println("PsP "+this.psp );
        System.out.println("Age "+this.age);
        System.out.println("Address "+this.address );
    }
    public static Builder getBuilder(){
        return  new Builder();
    }
    public static class Builder {
        private String name;
        private String address;
        private double psp;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public boolean validate()  {
            if (age > 24 && psp<70) {
                return false;
            }
            return true;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public double getPsp() {
            return psp;
        }

        public int getAge() {
            return age;
        }

        public Student build() throws Exception {
            if (!validate()){
                throw new Exception("Exception raised");
            }
            return new Student(this);
        }
    }
}
