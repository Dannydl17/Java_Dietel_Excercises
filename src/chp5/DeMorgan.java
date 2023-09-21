package chp5;

public class DeMorgan {
    public static void main(String[] args) {
        int x = 6;
        int y = 8;
//        !(x < 5)&&!(y>=7);
        System.out.println(!(x < 5) || !(y >= 7));


        int a =4;
        int b = 4;
        int g =3;
        System.out.println(!(a == b) && !(g != 5));



    }
}
