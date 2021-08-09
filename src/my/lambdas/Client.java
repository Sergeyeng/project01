package my.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Client {

    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();

        data.add(1);
        data.add(2);
        data.add(3);

/*        List<Integer> results = data.stream()
                .filter(x -> x % 2 == 1)
                .collect(Collectors.toList());*/
        /*for (int x: results) {
            System.out.println(x);
        }*/


        /*results.stream().forEach( x -> {
            System.out.println(x);
        });*/

        data.stream()
                .filter(x -> x % 2 == 1)
                //.collect(Collectors.toList())
                .forEach(x -> {
            System.out.println(x);
        });
    }

    public static void main1(String[] args) {
        //System.out.println("Hello World!");

        IntegerCollectionManager icm = new IntegerCollectionManager();
        List<Integer> data = new ArrayList<>();

        data.add(1);
        data.add(2);
        data.add(3);

        // just comment
        // just comment 2
//        List<Integer> results = icm.squares(data);

/*        for(int x:results){
            System.out.println(x);
        }*/

        // Передача действия в стиле классического ООП
        IntegerCollectionManager1 icm1 = new IntegerCollectionManager1();

        /*List<Integer> results = icm1.transform(data, new TransformInteger() {
            @Override
            public Integer doTransform(Integer x) {
                return x * x;
            }
        });

        for(int x:results){
            System.out.println(x);
        }*/

        // Передача действия в функциональном стиле (лямбда стилб)
        //List<Integer> results = icm1.transform(data, x -> { return x * x; });

        // короткий вариант верхнего
        /*List<Integer> results = icm1.transform(data, x -> x * x * x);

        for(int x:results){
            System.out.println(x);
        }*/

        // Лямбда выражение может быть длинным и сложным
        /*icm1.transform(data, x -> {
            System.out.println(x * x);
            return x;
        });*/

        IntegerCollectionManager2 icm2 = new IntegerCollectionManager2();
        /*icm2.transform(data, x -> {
            System.out.println(x * x);
            return x;
        });*/

        List<Integer> results = icm2.filter( data, x -> x % 2 == 0 );

/*        for(int x:results){
            System.out.println(x);
        }*/
        icm2.doIt(results, x -> {
            System.out.println(x);
        });

    }

}
