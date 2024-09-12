import java.util.Scanner;

public class TagihanListrik06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean cekPenggunaan;
        double tagihanListrik, penggunaankWh, harga = 1500.0, limitkWh = 500.0;

        System.out.print("Masukkan penggunaan kWh anda: ");
        penggunaankWh = input.nextDouble();

        tagihanListrik = penggunaankWh * harga;
        cekPenggunaan = penggunaankWh > limitkWh;

        System.out.println();

    }
    
}
