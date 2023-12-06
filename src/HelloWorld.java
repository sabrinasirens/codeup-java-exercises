public class HelloWorld {
    public static void main(String[] args) {
        int myFavoriteNumber = 2;
        String myString = "Testing";
        double shortPi = 3.14;
        float myNumber = (float) shortPi;
        System.out.print("Hello");
        System.out.println(" World!");
        System.out.println(myFavoriteNumber);
        System.out.println(myString);
        System.out.println(myNumber);

        /*int x = 5;
        System.out.println(++x);
        System.out.println(x);
         */

       /* String theNumberThree = "three";
        Object o = theNumberThree;
        int three = (int) o;
        int three = (int) "three";
        System.out.println(three);
        */

        short x = 8;
        short y = 20000;
        x *= y;
        //y -= x;
        System.out.println(x);
        //System.out.println(y);
    }
}
