package javaapplication8;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama vendor: ");
        String vendor = scanner.nextLine();

        System.out.print("Masukkan tipe smartphone: ");
        String tipe = scanner.nextLine();

        System.out.print("Masukkan harga smartphone: ");
        double harga = scanner.nextDouble();

        Pajak pajak = new Pajak(vendor, tipe, harga);
        double hargaSetelahPPN = pajak.hitungHargaSetelahPPN();

        System.out.println("Harga smartphone setelah ditambah PPN: Rp " + hargaSetelahPPN);
    }
}