package assignment4;

import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 *
 * @author Kristina
 */
public class CopingFile {
    public CopingFile(){}
    
    public void copyFile (){
        
        System.out.println("Unesite putanju foldera koji želite da kopirate.");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        //npr. C:\Users\Kristina\Desktop\folder1\text.txt
        File originalFile = new File(path);
        Path pathOfOrigFile = originalFile.toPath();
        
        
        System.out.println("Unesite putanju na koju želite da  kopiratte folder/fajl (ukljucujuci naziv fajla koji se kopira).");
        //Scanner sc1 = new Scanner(System.in);
        String path1 = sc.nextLine();
        //npr. C:\Users\Kristina\Desktop\folder2\text.txt
        File copyFile = new File(path1);
        Path pathOfCopyFile = copyFile.toPath();
        
        //zakomentarisan deo koda funkcionise samo za kopiranje sadrzaja fajlova
      /*  try (FileInputStream inStream = new FileInputStream(originalFile);
            FileOutputStream outStream = new FileOutputStream(copyFile);) {

            byte[] buffer = new byte[1024];

            int length;
            
            while ((length = inStream.read(buffer)) >= 0) {
                outStream.write(buffer, 0, length);
            }
            System.out.println("Folder je uspesno kopiran!");

            } 
        catch (IOException exc) {
            System.out.println(exc);
        }      */
      
      try {
            if (!Files.exists(pathOfOrigFile)) {
                System.out.println("File doesn't exists!");
                return;
            }
            if (!Files.exists(pathOfCopyFile.getParent())) {
                System.out.println("Location doesn't exists!");
                return;
            }
            if (Files.exists(pathOfCopyFile)) {
                System.out.println("File already exists on the location!");
                return;
            }

            Files.copy(pathOfOrigFile, pathOfCopyFile);
            System.out.println("File " + pathOfOrigFile.getFileName() + " is copied!");

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
