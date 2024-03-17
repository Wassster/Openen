import java.time.Instant;
import java.util.Date;

public class Exemplaar {

    private String aanschafDatum;
    private int serieNr;
    private boolean status;
    private VerhuurRegel regels;

    public Exemplaar(String aanschafDatum, int serieNr, boolean status){
        this.aanschafDatum = aanschafDatum;
        this.serieNr = serieNr;
        this.status = status;

    }

    public String getAanschafdatum(){
        return aanschafDatum;
    }

    public int getSerieNr(){
        return serieNr;
    }

    public boolean getStatus(){
        return status;
    }

    public String getPeriode(){
        String resultaat = Date.from(Instant.now()) + regels.getEindDatum();

        return resultaat;

    }



}
