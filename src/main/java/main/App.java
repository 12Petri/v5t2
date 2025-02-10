//Valikko rakenne pitkälti edellisistä tehtävistä.
//Muut kurssimateriaalista tai edellisistä tehtävistä.

package main;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna tehtaalle nimi:");
        String factoryName = sc.nextLine();
        Factory factory = new Factory(factoryName);
    
        boolean exit = false;
        while (!exit) {
            System.out.println("1) Lisää kone\r\n" + //
                                "2) Listaa kaikki koneet\r\n" + //
                                "0) Lopeta ohjelma");
    
    if(sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);
                                
        switch (i) {
            case 1:
                System.out.println("Anna koneen tyyppi: ");
                String type = sc.nextLine();
                System.out.println("Anna koneen malli: ");
                String model = sc.nextLine();
                System.out.println("Anna työntekijän nimi: ");
                String name = sc.nextLine();
                System.out.println("Anna työntekijän ammattinimike: ");
                String role = sc.nextLine();
                factory.addMachine(type, model, name, role);
                break;
            case 2:
                factory.showMachines();
                break;
            case 0:
                System.out.println("Kiitos ohjelman käytöstä.");
                exit = true;
                break;
            default:
                System.out.println("Syöte oli väärä");
                break;
            }
        }

    }
    sc.close();
    } 
}
