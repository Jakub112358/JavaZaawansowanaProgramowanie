package zad33;
//Napisz program, który wyświetli wszystkie zdjęcia (.png, .jpg) w danym katalogu i podkatalogach.

import java.io.File;

public class Task33 {
    public static void main(String[] args) {
        String directoryPath = "C:\\Users\\Michał\\Documents\\kurs java\\zad33";
        searchForPngJpgFiles(directoryPath);
    }

    private static void searchForPngJpgFiles(String path) {
        File file = new File(path);

        File[] filesPNG = file.listFiles(f -> f.getName().endsWith(".png")); //zwroci pliki PNG
        File[] filesJPG = file.listFiles(f -> f.getName().endsWith(".jpg")); //zwroci pliki JPG
        File[] directories = file.listFiles(f -> f.isDirectory()); //tutaj zwróci wszystkie foldery


        for (File f : filesPNG) {
            System.out.println(path + "\\" + f.getName());
        }

        for (File f : filesJPG) {
            System.out.println(path + "\\" + f.getName());

        }

        for (File directory : directories) {
            searchForPngJpgFiles(directory.getPath());
        }
    }
}
