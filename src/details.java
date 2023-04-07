class details {
    String name;
    int grade;

    String registration;



    public static void Information(String name)
    {
        System.out.println("Name :" +" "+ name);

    }
    public static void  Information(int grade)
    {
        System.out.println(grade);
    }
    public void Information(String name, String registration,int grade){
        System.out.println("Student name:" + name +" "+ "Registration number:"+  registration +" "+ "Grade:"+" "+grade);
    }
    public class Student {
        public static void main(String[] args) {
            details s1=new details();
            s1.grade=8;
            s1.registration="22MIC7096";
            s1.name="Sri charan";

            s1.Information(s1.name,s1.registration,s1.grade);


        }
    }
}
//Overloading//