package assignment4;

import java.io.File;
import java.util.Scanner;

/**
 * @author Kristina
 */
public class CreatingFile {
    
    public CreatingFile(){
        System.out.println("Unesite naziv fajla koji zelite da kreirate."); 
        
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        File newFile = new File(fileName);
        try {
            if(!newFile.exists())
            {
                newFile.mkdir(); //pozivamo f-ju koja pravi folder
                System.out.println("Uspesno kreiran folder sa nazivom " + newFile.getName());
            }
            else
            {
                System.out.println("Folder sa imenom " + newFile.getName() + " vec postoji.");
            }
            
        } catch (Exception e) {
            System.out.println("Folder nije uspesno kreiran.");
        } 
        
    }
}
