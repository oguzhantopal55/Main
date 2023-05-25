/*
   Oğuzhan Topal
   190503001
*/
import java.util.ArrayList;

public class Kunde extends Person {
  private String besuchtOrt;
  private int kontakt;

  public Kunde (String buergerId){
    super(buergerId);
  }
  public Kunde(String name, String nachname, String buergerId, String besuchtOrt, int kontakt) {
    super(name, nachname, buergerId);
    this.besuchtOrt = besuchtOrt;
    this.kontakt = kontakt;
  }

  public String getBesuchtOrt() {
    return besuchtOrt;
  }

  public void setBesuchtOrt(String besuchtOrt) {
    this.besuchtOrt = besuchtOrt;
  }

  public int getKontakt() {
    return kontakt;
  }

  public void setKontakt(int kontakt) {
    this.kontakt = kontakt;
  }

}
