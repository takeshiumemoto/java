package Bunki6;

public class Bunki6 {
    public static void main(String[] args) {
        int a = 1;
        String message = switch(a){
            case 1: yield "Goodmorinig";
            case 2: yield "Goodafternonn";
            case 3: yield "Goodevening";
            default: yield "Good night";
        };
        System.out.println(message);
    }

    
}

