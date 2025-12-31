package Builder;

public class Client {
    public static void main(String[] args){


//        // can be implented like this also if we make builder constructor public
//        Student.Builder builder=new Student.Builder();
//        builder.setName("Sunny");
//        builder.setAge(28);
//        builder.setGrade(70.6);
//        builder.setGradYear(2020);
//        builder.setPhone("1234567890");
//        builder.setBatch("ECE");
//        builder.setCollege("NIT Durgapur");
//        try{
//            Student student = builder.build();
//        }catch (RuntimeException ex){
//            System.out.println(ex.getMessage()+". Please try to create object with valid values.");
//        }

        try {
            Student student = Student.getBuilder()
                    .setName("Sunny")
                    .setAge(28)
                    .setBatch("ECE")
                    .setCollege("NIT Durgapur")
                    .setGradYear(2022)
                    .setGrade(70.6)
                    .setPhone("1234567890")
                    .build();
        }catch (RuntimeException ex){
            System.out.println(ex+". Please try to create object with valid values.");
        }

        System.out.println("Debug");

    }
}
