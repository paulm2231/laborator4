package lab4_1;

 class Imprimanta extends Ex1{

    private int ppm;
    private String rezolutie;
    private int p_car;
    private Mod m_tip;

    public Imprimanta(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie, int ppm, String rezolutie, int p_car, Mod m_tip ) {

        super(denumire, nr_inv, pret, zona_mag,  situatie);
        this.ppm=ppm;
        this.rezolutie=rezolutie;
        this.p_car=p_car;
        this.m_tip=m_tip;
    }

     public int getPpm() {
         return ppm;
     }

     public void setPpm(int ppm) {
         this.ppm = ppm;
     }

     public String getRezolutie() {
         return rezolutie;
     }

     public void setRezolutie(String rezolutie) {
         this.rezolutie = rezolutie;
     }

     public int getP_car() {
         return p_car;
     }

     public void setP_car(int p_car) {
         this.p_car = p_car;
     }

     public Mod getM_tip() {
         return m_tip;
     }

     public void setM_tip(Mod m_tip) {
         this.m_tip = m_tip;
     }

     @Override
     public String toString() {
         return super.toString()+" Imprimanta{" +
                 "ppm=" + ppm +
                 ", rezolutie='" + rezolutie + '\'' +
                 ", p_car=" + p_car +
                 ", m_tip=" + m_tip +
                 '}';
     }
 }
