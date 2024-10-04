import java.util.Scanner;
public class buku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jenis buku");
        String jenisBuku = input.nextLine();
        System.out.println("Masukkan jumlah buku");
        int jumlahBuku = input.nextInt();

        double diskon = 0;

        if (jenisBuku.equalsIgnoreCase("Kamus")) {
            diskon = 0.10;
            if (jenisBuku.equalsIgnoreCase("Kamus") && (jumlahBuku > 2)) {
                diskon += 0.02;
            }
        } else if (jenisBuku.equalsIgnoreCase("Novel")) {
            diskon = 0.07;
            if (jenisBuku.equalsIgnoreCase("Novel") && (jumlahBuku > 3)) {
                diskon += 0.02;
            } else {
                diskon += 0.01;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05;
            }
        }

        System.out.println("Diskon yang didapat " + (diskon * 100) + "%");

    }
}
