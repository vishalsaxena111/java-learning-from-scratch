package Java8Features;

import java.util.function.Predicate;

public class PredicateExample {

    public static void hello(int k){
        if(k == 3) {
            return ;
        } else{
            System.out.println("Hello ::::::"+k );
            PredicateExample.hello(++k);

        }
    }

    public static void main(String[] args) {

       PredicateExample.hello(1);
    }
}
