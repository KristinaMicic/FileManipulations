package assignment4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
/**
 *
 * @author Kristina
 */
public class MovingFile {
    public MovingFile(){}
    
    public void moveFile(){
        
        System.out.println("Unesite putanju foldera koju zelite da premestite.");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        File file = new File(path);
        Path pathOfOrigFile = file.toPath();
        
        System.out.println("Unesite putanju na koju želite da  premestite folder/fajl.");
        Scanner sc1 = new Scanner(System.in);
        String path1 = sc.nextLine();
        File movedFile = new File(path1);
        Path pathOfMovedFile = movedFile.toPath();
        
        try {
            if (!Files.exists(pathOfOrigFile)) {
                System.out.println("Fajl ne postoji.");
                return;
            }
            if (!Files.exists(pathOfMovedFile.getParent())) {
                System.out.println("Lokacija ne postoji.");
                return;
            }
            if (Files.exists(pathOfMovedFile)) {
                System.out.println("Fajl vec postoji na toj lokaciji.");
                return;
            }

            Files.copy(pathOfOrigFile, pathOfMovedFile);
            System.out.println("Fajl " + pathOfOrigFile.getFileName() + " je kopiran");
            file.delete();  //premestanje fajla/foldera je uradjeno na isti nacin kao i kopiranje, s tim da se originalni fajl/folder brise
            System.out.println("Fajl " + pathOfOrigFile.getFileName() + " je premesten i izbrisan!");

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
