public class Mainer2 {


    public static void main(String[] args) {

//        Test2 instance = Test2.getInstance();

        System.out.println(Test2.i1);
//        System.out.println(Test2.i2);

    }


}


class Test2 {

    static int i1;

    static Test2 instance = new Test2();

    static int i2 = 2;

    static {

        System.out.println("------>" + i1);
        System.out.println("------>" + i2);

    }

    private Test2() {

        i1++;
        i2++;
        System.out.println(i1);
        System.out.println(i2);
    }

    static Test2 getInstance() {
        return instance;
    }

}
