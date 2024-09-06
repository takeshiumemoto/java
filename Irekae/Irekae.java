package Irekae;



public class Irekae {
    public static void main(String[] args){
        int a,b;
        a=123;
        b=456;

        int tmp;
        tmp = a;
        a=b;
        b=tmp;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
