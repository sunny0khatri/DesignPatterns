package Prototype;

public class Client {

    public static void initRegistry(StudentRegistry registry){
        Student st=new Student();
        st.setAvgPsp(87);
        st.setBatch("Beginner Batch");
        st.setCity("Patna");
        registry.register("Beginner",st);


        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.setAvgPsp(95);
        intelligentStudent.setBatch("Intelligent Batch");
        intelligentStudent.setCity("Bangalore");
        registry.register("Intelligent",intelligentStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        initRegistry(studentRegistry);
        Student st=studentRegistry.get("Beginner").clone();
        st.setName("ABCD");
        st.setAge(28);


        IntelligentStudent intelligentStudent=(IntelligentStudent) studentRegistry.get("Intelligent").clone();  //need to typecast to Intelligent student
        intelligentStudent.setName("zxcv");
        intelligentStudent.setAge(27);
        intelligentStudent.setCollege("AVSFEHk");
        intelligentStudent.setIq(185);

    }
}
