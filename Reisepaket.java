import java.util.ArrayList;
public class Reisepaket{
  private int PaketID;
  private String Destination;
  private String Datum;
  private String Dauer;
  private String Preis;

  public Reisepaket(int PaketID){
    this.PaketID = PaketID;
  }
  public Reisepaket (int PaketID, String Destination, String Datum, String Dauer, String Preis){
    this.PaketID = PaketID;
    this.Destination = Destination;
    this.Datum = Datum;
    this.Dauer = Dauer;
    this.Preis = Preis;
  }
  public static void changePrice(ArrayList<Reisepaket> reisepakete, int paketID, String neuPreis) {
    for (Reisepaket reisepaket : reisepakete) {
      if (reisepaket.PaketID == paketID) {
        reisepaket.Preis = neuPreis;
        break;
      }
    }
  }
}
