/*
   Oğuzhan Topal
   190503001
*/
abstract class Person {
  private String name;
  private String nachname;
  private String buergerId;

  public Person(String buergerId){
    this.buergerId = buergerId;
  }
  public Person(String name, String nachname, String buergerId) {
    this.name = name;
    this.nachname = nachname;
    this.buergerId = buergerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getNachname() {
    return nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

  public String getBuergerId() {
    return buergerId;
  }

  public void setBuergerId(String buergerId) {
    this.buergerId = buergerId;
  }
  public int checkBuergerId(String buergerId) {
    if (!buergerId.matches("\\d{7}")) {
            System.out.println("Falsche Eingabe, bitte geben Sie eine siebenstellige Nummer");
            return 1;
          }
    return 0;
  }
  public int checkName(String name) {
    if (!name.matches("[A-Za-z. ]{2,}")) {
            System.out.println("Falsche Eingabe, bitte geben Sie einen Namen ein, der mindestens 2 Zeichen lang ist und nur aus Buchstaben, Punkten und Leerzeichen besteht.");
            return 1;
          }
    return 0;
    }
  public int checkNachname(String nachname) {
    if (!name.matches("[A-Za-z. ]{2,}")) {
          System.out.println("Falsche Eingabe, bitte geben Sie einen Nachnamen ein, der mindestens 2 Zeichen lang ist und nur aus Buchstaben, Punkten und Leerzeichen besteht.");
           return 1;
          }
    return 0;
    }
  @Override
  public String toString() {
    return this.buergerId + " " + this.name + " " + this.nachname;
  }
  @Override
  public boolean equals(Object obj){
    Person m =(Person) obj;
    if (getBuergerId().equals(m.getBuergerId())){
      return true;
    }
    return false;
  }
}
