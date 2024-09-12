import java.util.Scanner;


public class Gaji06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float gajiKaryawan, gajiAfterBonus, gajiAfterPajak, gajiHarian, upahPerJam, jamKerja;
        float pajak = 5 / 100f, bonus = 10 / 100f;
        System.out.print("Masukkan jumlah jam kerja: ");
        jamKerja = input.nextInt();
        System.out.print("Masukkan upah perjam: ");
        upahPerJam = input.nextFloat();

        gajiHarian = jamKerja * upahPerJam;
        gajiKaryawan = gajiHarian * 30;
        gajiAfterBonus = gajiKaryawan + (gajiKaryawan * bonus);
        gajiAfterPajak = gajiAfterBonus - (pajak * gajiAfterBonus);

        System.out.println(" Jumlah Gaji Karyawan per bulan sebesar Rp. " + gajiKaryawan);
        System.out.println(" Jumlah Gaji Karyawan after bonus sebesar Rp. " + gajiAfterBonus);
        System.out.println("Jumlah Gaji Karyawan after pajak sebesar Rp. " + gajiAfterPajak);

    }
}
