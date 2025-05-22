package Tugas9Pratikum;

import java.io.File;

public class DaftarFile {
    public static void main(String[] args) {
        File directory = new File("C:\\Data\\Java"); 

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                    }
                }
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
