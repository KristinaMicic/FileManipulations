package assignment4;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Kristina
 */
public class ListingContent {
    
    public ListingContent(){}
    
    public void listContent(){
        System.out.println("Unesite putanju foldera ciji sadrzaj zelite da izlistate.");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        if(file.exists() && file.isDirectory()){
            String[] strings = file.list();
            for(int i = 0; i < strings.length; i++){
                System.out.println(strings[i]);
            }
        }
    } 
    
}
