package Prototype;

public class IntelligentStudent extends Student{
    private double iq;

    IntelligentStudent(){}

    IntelligentStudent(IntelligentStudent st){
        super(st);
        this.iq= st.iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
//        IntelligentStudent st=new IntelligentStudent();
//        st.setAvgPsp(this.getAvgPsp());
//        st.setCity(this.getCity());
//        st.setBatch(this.getBatch());
//        return st;
    }

    public double getIq() {
        return iq;
    }

    public void setIq(double iq) {
        this.iq = iq;
    }
}
