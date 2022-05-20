package control;
public class student {
    String fullname;
    String lastname;
    int age;
    String gender;

  
    
    public String getInfo() {
        return ("fullanme: "+fullname+" lastname:"+lastname+" Age is:"+age+" gender is: "+gender);
    }
    

    public static void main(String[] args) {
        student s1 = new student();
        s1.fullname="Faaiz";
        s1.lastname="Ali";
        s1.age=21;
        s1.gender="male";
        System.out.println(s1.getInfo());
    }
}