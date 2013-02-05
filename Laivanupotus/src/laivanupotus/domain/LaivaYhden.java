
package laivanupotus.domain;


public class LaivaYhden extends Koordinaatti{
   
   public LaivaYhden(int x, int y){
      super(x,y);
   }
   public boolean osuu(Koordinaatti k){
      boolean osuu = false;
      if(this.osuu(k)){
         osuu = true;
      }
      return osuu;
   }
}
