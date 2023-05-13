
class Triangle implements Cloneable{
    int a,b,c;
    Triangle(int x, int y, int z){
       this.a = x;
        this.b = y;
        this.c = z;
    }
    void show() {
        int z =a+b+c
;        System.out.println("sum of all sides is  " +z);
    }
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2,3,5);
        t1.show();
        try {
            Triangle t2 = (Triangle) t1.clone();
            t2.a=6;
            t2.show();
        }
        catch(CloneNotSupportedException a){
            System.out.println(a);
        }

    }
}

