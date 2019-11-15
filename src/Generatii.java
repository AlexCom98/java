import java.util.Scanner;

public class Generatii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti varsta:");
        int age = in.nextInt();


        String generatia;


        if (age <= 0) {
            generatia = "valoare incorecta";
            System.out.println("varsta imposibila");
        }
        if (age > 0 && age < 6) {
            generatia = "alfa";
            System.out.println("Varta medie");
        } else if (age <= 20) {
            generatia = "z";
            System.out.println("Varta mare");
        } else

        {
            generatia = "builders";
        }
        System.out.println("Generatia este: " + generatia);


    }
}

