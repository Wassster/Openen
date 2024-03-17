import java.util.ArrayList;

public class VerhuurProduct {

    private String omschrijving;
    private double verhuurPrijs;
    private double borg;
    private ArrayList<Product> alleVerhuurdeProducten;
    private Exemplaar exemplaren;

    public VerhuurProduct(String omschrijving, double verhuurPrijs, double borg){
        this.omschrijving = omschrijving;
        this.verhuurPrijs = verhuurPrijs;
        this.borg = borg;
        this.alleVerhuurdeProducten = new ArrayList<Product>();

    }


    public String getOmschrijvingen(){
        return omschrijving;

    }
    public double getBorg() {
        return borg;
    }

    public double getVerhuurPrijs() {
        return verhuurPrijs;
    }

    public ArrayList<Product> getAlleVerhuurdeProducten() {
        return alleVerhuurdeProducten;
    }

    public String geefDetails(){
        String details = exemplaren.getAanschafdatum() + "\n" + exemplaren.getSerieNr();

        return details;
    }

    public String isVerhuurd(){
        if(exemplaren.getStatus()){
            return "ja" + exemplaren.getPeriode();
        }else{
            return "nee";
        }
    }
}
