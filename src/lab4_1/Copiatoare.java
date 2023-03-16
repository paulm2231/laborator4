package lab4_1;

 class Copiatoare extends Ex1 {
     private int p_top;
     private Format format;
     public Copiatoare(String denumire, int nr_inv, int pret, String zona_mag, Situatie situatie, int p_ton, Format format) {
         super(denumire, nr_inv, pret, zona_mag, situatie);
        this.p_top=p_top;
        this.format=format;

     }

     public int getP_top() {
         return p_top;
     }

     public void setFormat(Format format) {
         this.format = format;
     }

     public Format getFormat() {
         return format;
     }

     public void setP_top(int p_top) {
         this.p_top = p_top;
     }

     @Override
     public String toString() {
         return super.toString()+" Copiatoare{" +
                 "p_top=" + p_top +
                 ", format=" + format +
                 '}';
     }
 }
