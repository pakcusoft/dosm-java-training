package ideps.training.java;

import java.util.Scanner;

public class Amali2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan apa-apa nombor, 0 untuk keluar");
        int input = scanner.nextInt();
        if (input == 0) {
            System.out.println("Tamat");
        } else {
            for (int i = 0; i < input; i++) {
                System.out.println("> " + i);
            }
        }
    }
}
