import java.util.Scanner;
public class Pemilihan2Percobaan213 {
    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("====== MENU KAFE JTI ======");
        System.out.println("---------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih =");
        int pilihanMenu = input13.nextInt();
        input13.nextLine();
        System.out.print("Apakah punya member (y/n ? =)");
        String member = input13.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            double diskon = 0.10;
            System.out.println("Besar diskon = 10%");

            int harga = 0;
            
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
                
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga bundling " + harga);

            } else {
                System.out.println("Masukkan pilihan dengan benar");
                return;
            }

            double totalBayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalBayar);
        }
    }
}
