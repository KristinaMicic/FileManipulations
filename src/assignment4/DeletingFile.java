package assignment4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Kristina
 */
public class DeletingFile {
    
    public DeletingFile(){}
    
    public void deleteFile(){
    System.out.println("Unesite putanju foldera koju zelite da obrisete.");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        
        if(file.exists()){
            file.delete();
            System.out.println("Folder uspesno obrisan.");
        } 
        else{
            System.out.println("Ne moze da se obrise " + file.getName() + " zato sto " + file.getName() + " ne postoji.");
        }
    }
}



