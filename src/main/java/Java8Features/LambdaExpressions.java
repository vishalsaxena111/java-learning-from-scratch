package Java8Features;

import sun.misc.JavaObjectInputStreamReadString;

public class LambdaExpressions {


    public String sayHello(String s) {

        return "Hellooo !" + s;
    }

    public static void main(String[] args) {
        JavaObjectInputStreamReadString javaObjectInputStreamReadString = (s) -> "Hiiiii !" + s;
        System.out.println(javaObjectInputStreamReadString);
    }



}
