package com.alat.laptop;

import com.laptop.Laptop;
import java.util.Scanner;

public abstract class PBO6Package implements Laptop {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isOn = false;
        int volume = 50;
        

        while (true) {
            System.out.println("--Menu Laptop--");
            System.out.println("1. ON");
            System.out.println("2. OFF");
            System.out.println("3. UP");
            System.out.println("4. DOWN");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();

            switch (pilihan) {
                //nyalakan laptop
                case 1:
                    if (!isOn) {
                        System.out.println("Laptop menyala");
                        System.out.println("MacBook");
                        isOn = true;
                    } else {
                        System.out.println("Laptop sudah menyala!");
                    }
                    break;
                //matikan laptop
                case 2:
                    if (isOn) {
                        System.out.println("Laptop dimatikan...");
                        isOn = false;
                    } else {
                        System.out.println("Laptop sudah dimatikan!");
                    }
                    break;
                // volume up
                case 3:
                    if (isOn) {
                        if (volume < 100) {
                            volume += 10;
                            System.out.println("Volume naik menjadi " + volume);
                        } else {
                            System.out.println("Volume sudah maksimal!");
                        }
                    } else {
                        System.out.println("Nyalakan laptop terlebih dahulu!");
                    }
                    break;
                //volume down
                case 4:
                    if (isOn) {
                        if (volume > 0) {
                            volume -= 10;
                            System.out.println("Volume turun menjadi " + volume);
                        } else {
                            System.out.println("Volume sudah minimal!");
                        }
                    } else {
                        System.out.println("Nyalakan laptop terlebih dahulu!");
                    }
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}