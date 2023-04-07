
class basics {
    String name;
    int n=4;
     basics()
    {
        this.name="Sd";
    }
    void diplay(){
        System.out.println("Person class Constructor");
        System.out.println(n);
        System.out.println(name);
    }
}

class Studen extends basics {
    String hi;
    int num=5;
     Studen() {
        this.hi="szfsz";
    }
    void display() {
        System.out.println("Student class Constructor");
        System.out.println(num);
        System.out.println(hi);
    }
    public static void main(String[] args) {
        Studen a =new Studen();
        a.display();
    }
}

