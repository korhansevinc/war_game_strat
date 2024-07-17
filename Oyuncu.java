public abstract class Oyuncu implements Comparable {
      private double saldiriGucu ;
      private String isim ;
      private double deneyimPuani ;

      public abstract void bilgi() ;
      public abstract String ozet();
      public abstract double getToplamHamleGucu();
      
      public Oyuncu(String newIsim , double newSaldiriGucu , double newDeneyimPuani){
            this.isim = newIsim ;
            this.saldiriGucu = newSaldiriGucu ;
            this.deneyimPuani = newDeneyimPuani ;
      }
      public int compareTo(Object o){
            return 1 ;
      }


      public void  setSaldiriGucu(double newSaldiriGucu)
      {
            this.saldiriGucu = newSaldiriGucu ;
      }
      public double getSaldiriGucu()
      {
            return this.saldiriGucu ;
      }
      public String getIsim()
      {
            return this.isim ;
      }
      public void setIsim(String newIsim)
      {
            this.isim = newIsim ;
      }
      public double getDeneyimPuani()
      {
            return this.deneyimPuani ;
      }
      public void setDeneyimPuani(double newDeneyimPuani)
      {
            this.deneyimPuani = newDeneyimPuani ;
      }

}
