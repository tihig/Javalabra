package laivanupotus.domain;


public class Koordinaatti {
   private int x;
   private int y;
 
   
   public Koordinaatti(int x, int y){
      this.x = x;
      this.y = y;
   }
      public int getX(){
      return x;
   }
   public int getY(){
      return y;
   }
   public boolean osuu(Koordinaatti toinen){
      if(toinen.x == this.x && toinen.y == this.y){
         return true;
      }
      return false;
   }
   public String toString(){
      return "("+x+","+y+")";
   }
   
}
