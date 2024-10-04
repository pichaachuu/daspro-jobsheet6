import java.util.Scanner;
public class PerbandinganBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 28, b = 54, c = 15;

        if (a > b) {
            if (a > c) {
                System.out.println("Angka terbesar adalah " + a);
            } else 
            System.out.println("Angka terbesar adalah: " + c);
        } else {
            if (b > c) {
                System.out.println("Angka terbesar adalah " + b);
            } else
            System.out.println("Angka terbesar adalah " + c);
        }
    }
}
