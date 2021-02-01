package assignment4;

import java.io.File;
import java.util.Scanner;
/**
 *
 * @author Kristina
 */
public class RenamingFile {
    
    public RenamingFile (){}
    
    public void renameFile (){
        System.out.println("Unesite putanju foldera koju zelite da preimenuje.");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        //File file = new File(path);
        
        File oldfile = new File(path);  //file koji zelimo da preimenujemo
        System.out.println("Unesite putanju koja sadrzi novo ime foldera/fajla.");
        Scanner sc1 = new Scanner(System.in);
        String newPath = sc.nextLine(); //korisnik ce da unese novo ime
        File newfile = new File(newPath); 
        
        if(!oldfile.exists()){
            System.out.println("Folder ne postoji!");
            return;
        }
        if(newfile.exists()){
            System.out.println("Folder sa datim nazivom vec postoji!");
            return;
        }
        if(oldfile.renameTo(newfile)){
            System.out.println("Uspesno preimenovanje");
        }
        else{
            System.out.println("Neuspesno preimenovanje");
        }
        
    }

}
