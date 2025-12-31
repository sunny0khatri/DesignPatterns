package Prototype;

// Prototype design pattern is used when we want to create many objects of another object where many fields
// are same for the objects

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private String batch;
    private String college;
    private String city;
    private int psp;
    private int avgPsp;

    Student(){}

    Student(Student st){
        this.avgPsp=st.avgPsp;
        this.batch=st.batch;
        this.city=st.city;
    }


    @Override
    public Student clone() {
        return new Student(this);
//        Student st=new Student();
//        st.avgPsp=this.avgPsp;
//        st.batch=this.batch;
//        st.city=this.city;
//        return st;

    }

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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public int getAvgPsp() {
        return avgPsp;
    }

    public void setAvgPsp(int avgPsp) {
        this.avgPsp = avgPsp;
    }
}
