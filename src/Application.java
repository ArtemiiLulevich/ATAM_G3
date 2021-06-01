import java.util.ArrayList;
import java.util.List;

public class Application {

    int a = 7;
    static int b = 6;

    public static void main(String[] args) {
//        System.out.println("Hello world!");

        int h = 65;
        short s = 0;
        double d = 0.4562;
        float f = 0;
        long l = 0L;


//        Calc calc = new Calc();
//
//        if (calc.sum(d, h) > 70){
//            System.out.println("More");
//        } else if (calc.sum(d, h) == 70){
//            System.out.println("Equal");
//        } else {
//            System.out.println("Less");
//        }

        String[] strings = new String[]{"one", "two", "three"};

//        for (int a = 0; a < strings.length; a++){
//            System.out.println(strings[a]);
//        }// forEach analog

        for (String num: strings){
            System.out.println(num);
        }//forEach


        List<Integer> list_ints = new ArrayList<>();

        list_ints.add(1);
        list_ints.add(2);
        list_ints.add(7);
        list_ints.add(10);



        System.out.println(list_ints);

//        System.out.println(calc.sum(
//                3434567865L,
//                5156));
//
//        System.out.println(calc.multiple(
//                234,
//                23));
//
//
//        h = Integer.parseInt("45");
//        System.out.println(h);
//
//        Application application = new Application();
//        application.a = 9;
//        System.out.println(application.a);
//
//        application.test(
//                h + "", // Good trick
//                "first ",
//                "method");

//        Application application1 = new Application();
//        System.out.println(application1.a);
    }

//    public void test(String name, String name1, String name2){
//        System.out.println(name + name1 + name2);
//    }
}
