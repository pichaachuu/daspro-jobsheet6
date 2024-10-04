import java.util.Scanner;
public class Sepatu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan merk sepatu");
        String merk = input.nextLine();
        System.out.println("Masukkan kategori sepatu");
        String kategori = input.nextLine();
        System.out.println("Masukkan ukuran sepatu");
        int ukuranSepatu = input.nextInt();

        int hargaSepatu = 0;
        boolean stock = true;

        if (merk.equalsIgnoreCase("converse")) {
           if (kategori.equalsIgnoreCase("SlipOn")) {
            if (ukuranSepatu >= 36 && ukuranSepatu <= 40 ) {
                hargaSepatu = 800000;
                System.out.println("Harga Sepatu : " +hargaSepatu);
            } else
            System.out.println("Ukuran tidak tersedia");
           } else if (kategori.equalsIgnoreCase("HighTop")) {
            if (ukuranSepatu >= 40 && ukuranSepatu <= 44) {
                hargaSepatu = 1200000;
                System.out.println("Harga Sepatu : " +hargaSepatu);
            } else
            System.out.println("ukuran tidak tersedia");
           } else
           System.out.println("Kategori tidak tersedia");
        } else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("Woman")) {
                if (ukuranSepatu >= 36 && ukuranSepatu <= 41) {
                    hargaSepatu = 1000000;
                    System.out.println("Harga Sepatu : " +hargaSepatu);
                } else
                System.out.println("ukuran sepatu idak tersedia");
            } else if (kategori.equalsIgnoreCase("Man")) {
                if (ukuranSepatu >= 41 && ukuranSepatu <= 44) {
                    hargaSepatu = 1800000;
                    System.out.println("Harga Sepatu : " +hargaSepatu);
                } else
                System.out.println("Ukuran tidak tersedia");
            } else
            System.out.println("Kategori tidak tersedia");
        } else if (merk.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids")) {
                if (ukuranSepatu >= 36 && ukuranSepatu <= 40) {
                    hargaSepatu = 750000;
                    System.out.println("Harga Sepatu : " +hargaSepatu);   
                } else
                System.out.println("Ukuran tidak tersedia");
            } else if (kategori.equalsIgnoreCase("Adult")) {
                if (ukuranSepatu >= 40 && ukuranSepatu <= 44) {
                    hargaSepatu = 1500000;
                    System.out.println("Harga Sepatu : " +hargaSepatu);
                } else
                System.out.println("ukuran tidak tersedia");
            } else
            System.out.println("Kategori tidak tersedia");
        } else
        System.out.println("Merk tidak tersedia");

    }
}
