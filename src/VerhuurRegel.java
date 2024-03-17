public class VerhuurRegel {

    private String eindDatum;

    private int aantalDagen;

    private Exemplaar exemplaar;

    public VerhuurRegel(String eindDatum, int aantalDagen){
        this.eindDatum = eindDatum;
        this.aantalDagen = aantalDagen;

    }

    public String getEindDatum(){
        return eindDatum;
    }

    public int getAantalDagen(){
        return aantalDagen;
    }
}
