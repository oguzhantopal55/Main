/*
   Oğuzhan Topal
   190503001
*/
import java.util.ArrayList;

public class Mitarbeiter extends Person {
  private String e_mail;
  private String pflicht;

  public Mitarbeiter(String buergerId){
    super(buergerId);
  }
  public Mitarbeiter(String name, String nachname, String buergerId, String e_mail, String pflicht) {
    super(name, nachname, buergerId);
    this.e_mail = e_mail;
    this.pflicht = pflicht;
  }

  public String getE_mail() {
    return e_mail;
  }

  public void setE_mail(String e_mail) {
    this.e_mail = e_mail;
  }

  public String getPflicht() {
    return pflicht;
  }

  public void setPflicht(String pflicht) {
    this.pflicht = pflicht;
  }

}
