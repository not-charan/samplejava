class iphone6 {
     void makeCalls() {
        System.out.println("It has Calling Functionality");

    }
}
    class iphone10 extends iphone6 {
        void faceId() {
            System.out.println("Unlocking by FaceId");
        }
    }

    class iphone12 extends iphone10 {
        void support5G() {
            System.out.println("Support 5G Networking");
        }

        public static void main(String[] args) {
            iphone12 phone = new iphone12();
            phone.makeCalls();
            phone.faceId();
            phone.support5G();


        }
    }
