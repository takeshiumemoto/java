package weihtif;

public class himanritu {
    public static void main(String[] args) {
        double height,weight,fat;

        height = 1.75;
        weight = 22*height*height;
        fat=(50-weight)/weight*100;

        System.out.println("あなたの肥満率は"+(int)fat+"%です");

        if(fat>=20){
            System.out.println("あなたは太りすぎです");
        }
        if(fat<=-10){
            System.out.println("あなたは痩せすぎです");
        }
    }
}
