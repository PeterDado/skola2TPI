package tyzden16;

public class muz extends Entita  {
    private final String pohlavie="muz";
    public muz(int vek,String meno,int vyska){
        super(vek,meno,vyska);
    }
    public String getPohlavie() {
        return pohlavie;
    }
}
