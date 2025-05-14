/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elda
 */
import java.util.Scanner;
public class MainApp {
    static Note[] catatan = new Note[100];
    static int jumlah = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU CATATAN ===");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Tampilkan Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    tambahCatatan(input);
                    break;
                case 2:
                    tampilkanCatatan();
                    break;
                case 3:
                    ubahCatatan(input);
                    break;
                case 4:
                    hapusCatatan(input);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        input.close();
    }

    public static void tambahCatatan(Scanner input) {
        System.out.print("Masukkan isi catatan: ");
        String isi = input.nextLine();
        if (jumlah < catatan.length) {
            catatan[jumlah++] = new Note(isi);
            System.out.println("Catatan ditambahkan.");
        } else {
            System.out.println("Kapasitas penuh.");
        }
    }

    public static void tampilkanCatatan() {
        if (jumlah == 0) {
            System.out.println("Belum ada catatan.");
        } else {
            for (int i = 0; i < jumlah; i++) {
                System.out.println((i + 1) + ". " + catatan[i]);
            }
        }
    }

    public static void ubahCatatan(Scanner input) {
        tampilkanCatatan();
        System.out.print("Pilih nomor catatan yang ingin diubah: ");
        int idx = input.nextInt() - 1;
        input.nextLine();
        if (idx >= 0 && idx < jumlah) {
            System.out.print("Masukkan isi baru: ");
            String isiBaru = input.nextLine();
            catatan[idx].setIsi(isiBaru);
            System.out.println("Catatan diubah.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    public static void hapusCatatan(Scanner input) {
        tampilkanCatatan();
        System.out.print("Pilih nomor catatan yang ingin dihapus: ");
        int idx = input.nextInt() - 1;
        input.nextLine();
        if (idx >= 0 && idx < jumlah) {
            for (int i = idx; i < jumlah - 1; i++) {
                catatan[i] = catatan[i + 1];
            }
            catatan[--jumlah] = null;
            System.out.println("Catatan dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }
}
