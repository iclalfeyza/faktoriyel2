import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("n degerini giriniz: ");
        int n = scan.nextInt();
        System.out.println("r degerini giriniz: ");
        int r = scan.nextInt();

        if(r > n) {
            System.out.println("Hatalı girdi");
            System.exit(0);
        }

        double combination = (factorial(n)*1.0)/(factorial(r)*factorial(n-r));

        System.out.println((int)combination);

    }

    static double factorial(int n) {
        if(n == 0) return 1;
        else return(n*factorial(n-1));
    }

}
