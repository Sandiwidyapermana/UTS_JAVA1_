package javaapplication8;

import java.util.Scanner;

class Pajak {
    private String vendor;
    private String tipe;
    private double harga;

    public Pajak(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    public double hitungHargaSetelahPPN() {
        double ppn = 0;
        if (harga < 4200000) {
            ppn = 0.01; // PPN 1%
        } else if (harga >= 4200000 && harga <= 4500000) {
            ppn = 0.02; // PPN 2%
        } else if (harga > 4500000) {
            ppn = 0.05; // PPN 5%
        }
        return harga + (harga * ppn);
    }
}