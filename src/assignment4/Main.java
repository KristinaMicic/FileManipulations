package assignment4;

import java.util.Scanner;

/**
 *
 * @author Kristina
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Odaberite operaciju:");
        System.out.println("Unesite 1 ukoliko zelite da izlistate sadrzaj foldera.");
        System.out.println("Unesite 2 ukoluko zelite prikaz informacija o folderima.");
        System.out.println("Unesite 3 ukoliko zelite da kreirate novi folder.");
        System.out.println("Unesite 4 ukoliko zelite da preimenujete folder.");
        System.out.println("Unesite 5 ukoliko zelite da kopirate folder.");
        System.out.println("Unesite 6 ukoliko zelite da premestite folder.");
        System.out.println("Unesite 7 ukoliko zelite da izbrisete folder.");
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine(); 
        
        switch(input){
            case "1":
                System.out.println("Izabrali ste opciju 1, listanje sadrzaja foldera.");
                ListingContent listingContent = new ListingContent();
                listingContent.listContent();
                break;
            case "2":
                System.out.println("Izabrali ste opciju 2, informacije o folderu");
                FileInfo info = new FileInfo();
                info.getInfo(); 
                break;
            case "3":
                System.out.println("Izabrali ste opciju 3, kreiranje novog foldera.");
                CreatingFile creatingFile = new CreatingFile();
                break;
            case "4":
                System.out.println("Izabrali ste opciju 4, preimenovanje foldera.");
                RenamingFile renameFile = new RenamingFile();
                renameFile.renameFile();
                break;
            case "5":
                System.out.println("Izabrali ste opciju 5, kopiranje foldera.");
                CopingFile copyFile = new CopingFile();
                copyFile.copyFile();
                break;
            case "6":
                System.out.println("Izabrali  ste opciju 6, premestanje foldera.");
                MovingFile moveFile = new MovingFile();
                moveFile.moveFile();
                break;
            case "7":
                System.out.println("Izabrali se opciju 7, brianje foldera.");
                DeletingFile deleteFile = new DeletingFile();
                deleteFile.deleteFile();
                break;
            default:
                System.out.println("Niste odabrali odgovarajucu operaciju. Unesite broj od 1 do 7.");
                Scanner sc1 = new Scanner(System.in);
                String input1 = sc1.nextLine(); 
        }
        
        
    }
    
}
