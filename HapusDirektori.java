package Tugas9Pratikum;

import java.io.File;

public class HapusDirektori {
    public static void main(String[] args) {
        File dir = new File("C:\\Data\\Java\\FolderTarget"); 

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                    }
                }
            }

            if (dir.delete()) {
                System.out.println("Direktori berhasil dihapus.");
            } else {
                System.out.println("Gagal menghapus direktori.");
            }
        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}
