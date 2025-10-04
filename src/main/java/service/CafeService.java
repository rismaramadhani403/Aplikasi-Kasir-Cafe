/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author ASUS
 */
import model.*;
import exception.ValidationException;

public class CafeService {
    private MenuItem[] menuList;
    private CartItem[] cart;
    private int cartCount;
    private static final double TAX_RATE = 0.11; // 11% pajak

    public CafeService() {
        menuList = new MenuItem[]{
            new MenuItem("C01", "Espresso", 15000),
            new MenuItem("C02", "Cappuccino", 18000),
            new MenuItem("C03", "Latte", 20000),
            new MenuItem("C04", "Mocha", 22000),
            new MenuItem("F01", "Croissant", 17000),
            new MenuItem("F02", "Brownie", 15000)
        };
        cart = new CartItem[20];
        cartCount = 0;
    }

    public void showMenu() {
        System.out.println("\\n=== MENU CAFE ===");
        for (MenuItem item : menuList) {
            System.out.println(item);
        }
    }

    public void addToCart(String id, int qty) throws ValidationException {
        MenuItem found = null;
        for (MenuItem item : menuList) {
            if (item.getId().equalsIgnoreCase(id)) {
                found = item;
                break;
            }
        }

        if (found == null) {
            throw new ValidationException("Menu dengan ID " + id + " tidak ditemukan.");
        }

        if (qty <= 0) {
            throw new ValidationException("Jumlah harus lebih dari 0.");
        }

        if (cartCount < cart.length) {
            cart[cartCount++] = new CartItem(found, qty);
            System.out.println(found.getName() + " ditambahkan ke keranjang!");
        } else {
            throw new ValidationException("Keranjang penuh!");
        }
    }

    public void showCart() {
        if (cartCount == 0) {
            System.out.println("Keranjang masih kosong.");
            return;
        }

        System.out.println("\\n=== KERANJANG PESANAN ===");
        double subtotal = 0;
        for (int i = 0; i < cartCount; i++) {
            System.out.println((i + 1) + ". " + cart[i]);
            subtotal += cart[i].getTotal();
        }
        System.out.println("Subtotal: Rp " + String.format("%,.0f", subtotal));
    }

    public void checkout() {
        if (cartCount == 0) {
            System.out.println("Keranjang kosong, tidak bisa checkout.");
            return;
        }

        double subtotal = 0;
        for (int i = 0; i < cartCount; i++) {
            subtotal += cart[i].getTotal();
        }

        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        System.out.println("\\n=== STRUK PEMBAYARAN ===");
        showCart();
        System.out.println("Pajak 11%: Rp " + String.format("%,.0f", tax));
        System.out.println("Total Bayar: Rp " + String.format("%,.0f", total));
        System.out.println("\\nTerima kasih telah berbelanja di Cafe Kami ☕️");
        cartCount = 0; // reset keranjang
    }
}