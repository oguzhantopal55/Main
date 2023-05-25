/*
   Oğuzhan Topal
   190503001
*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class Main {

  public static void main(String[] args) {
    ArrayList<Mitarbeiter> mitarbeiter = new ArrayList<>();
    ArrayList<Kunde> kunden = new ArrayList<>();
    ArrayList<Reisepaket> reisepakete = new ArrayList<>();
    Kunde nullPerson = new Kunde("","","","",0);
    Scanner sc = new Scanner(System.in);

    int operation = 0;
    while (operation != 100) {

      System.out.println("Welche Operation möchten Sie durchführen?");
      System.out.println("  1- Mitarbeiter hinzufuegen");
      System.out.println("  2- Mitarbeiter auflisten");
      System.out.println("  3- Mitarbeiter suchen");
      System.out.println("  4- Kunde hinzufuegen");
      System.out.println("  5- Kunden auflisten");
      System.out.println("  6- Kunde suchen");
      System.out.println("  100 - Programm beenden");
      try{
      operation = sc.nextInt();
      sc.nextLine();
      if (operation == 1) {
        System.out.println("Geben Sie den Namen des Mitarbeiters ein:");
        String name = sc.nextLine();
        nullPerson.setName(name);
        if (nullPerson.checkName(name) == 1){
          break;
        }
        System.out.println("Geben Sie den Nachnamen des Mitarbeiters ein:");
        String nachname = sc.nextLine();
        nullPerson.setNachname(nachname);
        if (nullPerson.checkNachname(nachname) == 1){
          break;
        }
        System.out.println("Geben Sie die Buergernummer des Mitarbeiters ein:");
        String buergerId = sc.nextLine();
        nullPerson.setBuergerId(buergerId);
        if (nullPerson.checkBuergerId(buergerId) == 1){
        break;
        }
        System.out.println("Geben Sie die E-Mail-Adresse des Mitarbeiters ein:");
        String email = sc.nextLine();

        System.out.println("Geben Sie die Pflicht des Mitarbeiters ein:");
        String pflicht = sc.nextLine();

        Mitarbeiter neuMitarbeiter = new Mitarbeiter(name, nachname, buergerId, email, pflicht);
        mitarbeiter.add(neuMitarbeiter);
      }
      else if (operation == 2) {
        for(int i = 0; i < mitarbeiter.size(); i++) {
            System.out.println(mitarbeiter.get(i));
      }
      }
      else if(operation == 3){
        System.out.println("Geben Sie die Buergernummer des Mitarbeiters ein:");
        String buergerId = sc.nextLine();
        int index = mitarbeiter.indexOf(new Mitarbeiter(buergerId));
        if (index == -1){
          System.out.println("Person konnte nicht gefunden werden");
        }
        else{
          System.out.println(mitarbeiter.get(index));
        }

      }
      else if (operation == 4) {
        System.out.println("Geben Sie den Namen des Kunden ein:");
        String name = sc.nextLine();
        nullPerson.setName(name);
        if (nullPerson.checkName(name) == 1){
          break;
        }
        System.out.println("Geben Sie den Nachnamen des Kunden ein:");
        String nachname = sc.nextLine();
        nullPerson.setNachname(nachname);
        if (nullPerson.checkNachname(nachname) == 1){
          break;
        }
        System.out.println("Geben Sie die BuergerID des Kunden ein:");
        String buergerId = sc.nextLine();
        nullPerson.setBuergerId(buergerId);
        if (nullPerson.checkBuergerId(buergerId) == 1){
          break;
        }
        System.out.println("Geben Sie die BesuchtOrt des Kunden ein:");
        String besuchtort = sc.nextLine();
        System.out.println("Geben Sie die Kontakt des Kunden ein:");
        String  stringkontakt = sc.nextLine();
        int kontakt = Integer.parseInt(stringkontakt);
        Kunde neuKunde = new Kunde(name, nachname, buergerId, besuchtort, kontakt);
        kunden.add(neuKunde);
      }
      else if (operation == 5) {
        for(int i = 0; i < kunden.size(); i++) {
            System.out.println(kunden.get(i));
        }
      }
      else if(operation == 6){
        System.out.println("Geben Sie die Buergernummer des Kunden ein:");
        String buergerId = sc.nextLine();
        int index = kunden.indexOf(new Kunde (buergerId));
        if (index == -1){
          System.out.println("Person konnte nicht gefunden werden");
        }
        else{
          System.out.println(kunden.get(index));
        }
      }
      else if(operation == 7){
          System.out.println("Geben Sie die PaketID des Reisepaket ein:");
          int paketId = sc.nextInt();
          System.out.println("Geben Sie die Destination des Reisepaket ein:");
          String dest = sc.nextLine();
          System.out.println("Geben Sie die Datum des Reisepaket ein:");
          String dat = sc.nextLine();
          System.out.println("Geben Sie die Dauer des Reisepaket ein:");
          String dau = sc.nextLine();
          System.out.println("Geben Sie die Preis des Reisepaket ein:");
          String preis = sc.nextLine();
          Reisepaket neuReisepaket = new Reisepaket(paketId, dest, dat, dau, preis);
          reisepakete.add(neuReisepaket);
      }
      else if(operation == 8){
        for(int i = 0; i < reisepakete.size(); i++) {
            System.out.println(reisepakete.get(i));
        }
      }
      else if (operation == 9){
        System.out.println("Geben Sie die PaketID des Reisepaket ein:");
        int PaketId = sc.nextInt();
        int index = reisepakete.indexOf(new Reisepaket (PaketId));
        if (index == -1){
          System.out.println("Reisepaket konnte nicht gefunden werden");
        }
        else{
          System.out.println(kunden.get(index));
        }
      }
      else if(operation == 10){
        System.out.println("Geben Sie die PaketID des Reisepaket ein:");
        int paketıd = sc.nextInt();
        System.out.println("Geben Sie die neuPreis des Reisepaket ein:");
        String neuPreis = sc.nextLine();
        Reisepaket.changePrice(reisepakete, paketıd, neuPreis);
      }
    }
    catch(InputMismatchException e){
      System.out.println("Bitte geben Sie eine gültige Option ein.");
      sc.nextLine();
  }
}
}
}
