package designPatterns.builder;

public class Student {
    private int id;
    private int psp;
    private int yoe;
    private String name;
    private int gradYear;
    private int age;

    //Validation: psp > 80, gradYear < 2023, age > 18
    private Student(Builder b){
        this.id = b.id;
        this.psp = b.psp;
        this.yoe = b.yoe;
        this.name = b.name;
        this.gradYear = b.gradYear;
        this.age = b.age;
    }

    public static Builder builder(){
        Builder b = new Builder();
        return b;
    }

    public int getId() {
        return id;
    }

    public int getPsp() {
        return psp;
    }

    public int getYoe() {
        return yoe;
    }

    public String getName() {
        return name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public int getAge() {
        return age;
    }

    //inner class/nested class
    static class Builder{
        private int id;
        private int psp;
        private int yoe;
        private String name;
        private int gradYear;
        private int age;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        /**
         *
         * @return Student object after validating all required attributes
         * @throws Exception when validation fails, and stops creation of Student obj
         */
        public Student build() throws Exception {
            if(gradYear >= 2023){
                throw new Exception("Grad year is not valid");
            }
            if(age < 18){
                throw new Exception("Age is not valid");
            }
            if(psp < 80){
                throw new Exception("PSP is not valid");
            }
            Student s = new Student(this);
            return s;
        }
    }
}
// BUILDER PATTERN
// 1. Create a static Builder class inside required class
// 2. Create a static method called builder() -> which returns object of Builder class
// 3. Create setters inside Builder class, which set the value and also return the Builder obj
// 4. Create a build() method inside Builder class, which does the validations and returns a required class object
// 5. make constructor private for Builder and Student


// IMMUTABLE CLASS
// 1. Make all attributes private final
// 2. Initialise everything inside the constructor
// 3. No setter methods
// 4. Only getter methods, and if attribute is an object, return deep copy.