public class Savasci extends Oyuncu {
      private double savasBonusu;

      public Savasci(String newIsim, double newSaldiriGucu, double newDeneyimPuani) {
            super(newIsim, newSaldiriGucu, newDeneyimPuani);
            this.savasBonusu = 1.3 ; 
      }

      @Override
      public int compareTo(Object o) {
            
            if(o instanceof Buyucu){
                  return 0 ;
            }

            else if(o instanceof Savasci){
                  if(this.getSaldiriGucu()> ((Savasci) o).getSaldiriGucu()) {
                        return 1 ;
                  }
                  else if(this.getSaldiriGucu() < ((Savasci) o).getSaldiriGucu()) {
                        return -1 ;
                  }
                  else 
                        return 0 ;
                  
            }
            System.out.println("ERROR...");
            return 0 ;
      }

      @Override
      public void bilgi() {
            System.out.println("[SAVASCI]");
            System.out.println("Isim: " + this.getIsim());
            System.out.println("Saldiri Gucu: " + this.getSaldiriGucu());
            System.out.println("Toplam Hamle Gucu: " + this.getToplamHamleGucu());
            System.out.println("Deneyim Puani: " + this.getDeneyimPuani());
            
      }

      @Override
      public String ozet() {
            
            return "[SAVASCI]\t" + this.getIsim() + "\tToplam Hamle Gucu:\t" + this.getToplamHamleGucu() + "\tDeneyim Puani:\t" + this.getDeneyimPuani();
      }

      @Override
      public double getToplamHamleGucu() {
            
            return this.getSaldiriGucu() * savasBonusu ;
      }
      
}
