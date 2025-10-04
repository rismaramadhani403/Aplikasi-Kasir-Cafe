/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import service.CafeService;
import exception.ValidationException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CafeService service = new CafeService();
        int pilihan;

        do {
            System.out.println("\\n=== APLIKASI KASIR CAFE ===");
            System.out.println("1. Lihat Menu");
            System.out.println("2. Tambah Pesanan");
            System.out.println("3. Lihat Keranjang");
            System.out.println("4. Checkout");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> service.showMenu();
                case 2 -> {
                    System.out.print("Masukkan ID Menu: ");
                    String id = sc.nextLine().trim();
                    System.out.print("Masukkan jumlah: ");
                    int qty = sc.nextInt();
                    sc.nextLine();
                    try {
                        service.addToCart(id, qty);
                    } catch (ValidationException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 3 -> service.showCart();
                case 4 -> service.checkout();
                case 0 -> System.out.println("Keluar dari aplikasi...");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
