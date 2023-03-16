package lab4_1;

 class Sisteme_calcul extends Ex1{
    private String tip_mon;
    private int vit_proc;
    private String c_hdd;
    private Sis_operare sis_operare;

     public Sisteme_calcul(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie) {
         super(denumire, nr_inv, pret, zona_mag, situatie);
         this.tip_mon=tip_mon;
         this.vit_proc=vit_proc;
         this.c_hdd=c_hdd;
         this.sis_operare=sis_operare;
     }

     public String getTip_mon() {
         return tip_mon;
     }

     public void setTip_mon(String tip_mon) {
         this.tip_mon = tip_mon;
     }

     public int getVit_proc() {
         return vit_proc;
     }

     public void setVit_proc(int vit_proc) {
         this.vit_proc = vit_proc;
     }

     public String getC_hdd() {
         return c_hdd;
     }

     public void setC_hdd(String c_hdd) {
         this.c_hdd = c_hdd;
     }

     public Sis_operare getSis_operare() {
         return sis_operare;
     }

     public void setSis_operare(Sis_operare sis_operare) {
         this.sis_operare = sis_operare;
     }

     @Override
     public String toString() {
         return super.toString()+" Sisteme_calcul{" +
                 "tip_mon='" + tip_mon + '\'' +
                 ", vit_proc=" + vit_proc +
                 ", c_hdd='" + c_hdd + '\'' +
                 ", sis_operare=" + sis_operare +
                 '}';
     }
 }
