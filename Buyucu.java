public class Buyucu extends Oyuncu {
      
      private double buyuBonusu ;

      public Buyucu(String isim , double saldiriGucu , double deneyimPuani ){
            super(isim,saldiriGucu,deneyimPuani);
            this.buyuBonusu = 1.5 ;
      }

      @Override
      public int compareTo(Object o) {
            if(o instanceof Savasci)
            {
                  return 1 ;
            }
            else if(o instanceof Buyucu){
                  if(this.getDeneyimPuani() > ((Buyucu) o).getDeneyimPuani())
                        return 1 ;
            
                  else if(this.getDeneyimPuani() < ((Buyucu) o).getDeneyimPuani())
                        return -1 ;
            
                  else 
                        return 0 ;
            }
            System.out.println("ERROR...");
            return 0 ;
            
      }
     

      @Override
      public void bilgi() {
            System.out.println("[BUYUCU]");
            System.out.println("Isim: " + this.getIsim());
            System.out.println("Saldiri Gucu: " + this.getSaldiriGucu());
            System.out.println("Toplam Hamle Gucu: " + this.getToplamHamleGucu());
            System.out.println("Deneyim Puani: " + this.getDeneyimPuani());

      }

      @Override
      public String ozet() {
            return "[BUYUCU]\t" + this.getIsim() + "\tToplam Hamle Gucu:\t" + this.getToplamHamleGucu() + "\tDeneyim Puani:\t" + this.getDeneyimPuani();
      }

      @Override
      public double getToplamHamleGucu() {
            return this.getSaldiriGucu() * buyuBonusu;
      }

}
