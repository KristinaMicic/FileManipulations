package assignment4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
/**
 *
 * @author Kristina
 */
public class FileInfo {
    
    public FileInfo(){}
    
    public void getInfo(){
        System.out.println("Unesite putanju foldera o kome zelite da dobijete informacije.");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
         
        try{
            if(file.exists()){
             System.out.println("Informacije o folderu:");
             System.out.println("Naziv: " + file.getName());
             System.out.println("Putanja: " + file.getPath());
             System.out.println("Velicina: " + file.length());
                //za datum kreiranja i datum poslednje modifikacije je koriscen paket java.nio, a ne klasa java.io.File jer je jednostavnije,ne i preglednije.
             BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
             System.out.println("Datum kreiranja: " + attr.creationTime());
             System.out.println("Datum poslednje modifikacije: " + attr.lastModifiedTime());      
            }
        } 
        catch (IOException e) {
            System.out.println("Folder nije uspesno kreiran.");
        } 
    }
    
}
