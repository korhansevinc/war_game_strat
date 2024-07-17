public class Takim {
      private Oyuncu[] takim ;

      public Takim(Oyuncu[] anArray)
      {
            this.takim = anArray ;
      }

      public void siralaVeBas()
      {
            Oyuncu temp ;
            Oyuncu min ;
            int minIndex = 0 ;
            boolean isTrue = false ;
            for(int i=0 ; i< takim.length; i++)
            {
                  min = takim[i];
                  for(int j = i+1; j<takim.length;j++) 
                  {
                        if(min.compareTo(takim[j]) == 1){
                              // 1 se min daha buyuk
                              // -1 se icerdeki buyuk
                              // o sa esit
                              min = takim[j];
                              minIndex = j ;
                              isTrue = true ;
                        }


                  }
                  if(isTrue){
                        temp = takim[i] ;
                        takim[i] = min ;
                        takim[minIndex] = temp ;
                  }
                 
            } 
          
            for(int i = 0 ; i<takim.length;i++)
            {
                  System.out.println(takim[i].ozet()); 
            }
            
            
            //s1 b1  b2 s2  b3    1 0 -1  this.takim[i].compareTo(takim[i+1])
      }

}
