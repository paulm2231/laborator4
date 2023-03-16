package lab4_1;

public class Echipament {
    private String denumire;
    private int nr_inv;
    private float pret;
    private String zona_mag;
    private String situatie;


    public Echipament(String denumire, int nr_inv,float pret,String zona_mag,String situatie){
        this.denumire=denumire;
        this.nr_inv=nr_inv;
        this.pret=pret;
        this.zona_mag=zona_mag;
        this.situatie=situatie;
    }
    public String getDenumire()
    {
        return denumire;
    }

    public int getNr_inv()
    {
        return nr_inv;
    }

    public float getPret() {
        return pret;
    }

    public String getZona_mag() {
        return zona_mag;
    }

    public String getSituatie() {
        return situatie;
    }

    public String  toString ()
    {
        return "Echipamente: " + "denumire:"+getDenumire()+
                "inventar"+ getNr_inv()+
                "pret"+getPret()+
                "zona magazin"+getZona_mag()+
                "situatie"+getSituatie();
    }
}
