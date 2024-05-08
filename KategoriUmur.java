package Umur;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KategoriUmur {
    private static final int BALITA_AGE = 5;
    private static final int ANAK_AGE = 12;
    private static final int REMAJA_AGE = 18;
    private static final int DEWASA_AGE = 40;
    private static final int PARUBAYAH_AGE = 60;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nama;
        int umur;
        char ulangi;

        do {
            nama = getInput("Masukkan Nama: ", reader);
            umur = getIntegerInput("Masukkan Umur: ", reader);

            String category = categorizeAge(umur);
            System.out.println("Anda termasuk dalam kategori " + category + ".");

            ulangi = getCharInput("Apakah ingin mengulangi? (y/n): ", reader);
        } while (ulangi == 'y' || ulangi == 'Y');
    }

    private static String getInput(String prompt, BufferedReader reader) {
        System.out.print(prompt);
        try {
            return reader.readLine();
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
            return "";
        }
    }

    private static int getIntegerInput(String prompt, BufferedReader reader) {
        while (true) {
            try {
                return Integer.parseInt(getInput(prompt, reader));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
    }

    private static char getCharInput(String prompt, BufferedReader reader) {
        while (true) {
            String input = getInput(prompt, reader);
            if (input.length() == 1) {
                return input.charAt(0);
            } else {
                System.out.println("Invalid input. Please enter a single character.");
            }
        }
    }

    private static String categorizeAge(int age) {
        if (age < BALITA_AGE) {
            return "balita";
        } else if (age < ANAK_AGE) {
            return "anak-anak";
        } else if (age < REMAJA_AGE) {
            return "remaja";
        } else if (age < DEWASA_AGE) {
            return "dewasa";
        } else if (age < PARUBAYAH_AGE) {
            return "parubayah";
        } else {
            return "lanjut usia";
        }
    }
}