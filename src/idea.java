public class idea{

    public void school(){
        System.out.println("Good School");

    }

}
class thought extends idea{
    public void school(){
        System.out.println("bad school");

    }
     public static void main(String[] args) {
        thought t1=new thought();
        t1.school();
        idea i1=new idea();
        i1.school();


    }

}
