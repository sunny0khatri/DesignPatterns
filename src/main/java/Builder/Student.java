package Builder;

public class Student {
    private String name;
    private int age;
    private int gradYear;
    private String batch;
    private String college;
    private String phone;
    private double grade;


    private Student(){}

    private Student(Builder builder){
        this.name=builder.name;
        this.age= builder.age;
        this.gradYear= builder.gradYear;
        this.batch= builder.batch;
        this.college= builder.college;
        this.phone= builder.phone;
        this.grade= builder.grade;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    static class Builder{
        private String name;
        private int age;
        private int gradYear;
        private String batch;
        private String college;
        private String phone;
        private double grade;

//        private Builder(){}

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getCollege() {
            return college;
        }

        public Builder setCollege(String college) {
            this.college = college;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public double getGrade() {
            return grade;
        }

        public Builder setGrade(double grade) {
            this.grade = grade;
            return this;
        }

        Student build() throws RuntimeException{
            if(this.age<=20)
                throw new RuntimeException("Age can't be less than 20");
            if(gradYear>=2021)
                throw new RuntimeException("Graduation year can't be greater than 2020");
            if(this.grade<6)
                throw new RuntimeException("grade can't be less than 6");
            return new Student(this);
        }
    }
}
