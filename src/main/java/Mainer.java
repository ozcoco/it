import java.util.concurrent.atomic.AtomicInteger;

public class Mainer {

    public static void main(String[] args) {

        System.out.println(Test.str);

        Test[] test = new Test[1];

        System.out.println(test.getClass());
        System.out.println(test.getClass().getSuperclass());

//        AtomicInteger atomicInteger = test[0].atomicInteger;

        short[] s1 = new short[1];

        boolean b1 = s1[0] == 0;

        System.out.println(s1.getClass());
        System.out.println(s1.getClass().getSuperclass());

        System.out.println("******************************************************************************");

        System.out.println(Inter2.str);

    }


    int i = 1;

    private int printX() {

        i++;

        return 0;
    }

}


class Test {

    AtomicInteger atomicInteger = new AtomicInteger(0);

    static final String str = "tttttttttttttttt";


    static {
//        str = "tttttttttttttttt";

        System.out.println("--->" + str);
    }


}


interface Inter1 {

    static String str = "1111";

    static void f1() {

        System.out.println("1111");

    }

}


interface Inter2 extends Inter1 {

    static String str = "2222";

    static void f1() {
        System.out.println("2222");
    }

}