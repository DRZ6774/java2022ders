package gun04;

public class C04_ExplicitNarrowing_Calısma {
    public static void main(String[] args) {
        int sayi1=879;
        double sayi2=10;

        double sayi3=sayi1/sayi2;
        System.out.println(sayi3); //87.9

        int sayi4= (int) (sayi1/sayi2);
        System.out.println(sayi4); //87

        int sayi5=140;
        byte sayı6= (byte) sayi5;
        System.out.println(sayı6); //-116


        }
    }

