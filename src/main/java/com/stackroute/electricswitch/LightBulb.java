package com.stackroute.electricswitch;

public class LightBulb {


   boolean bulbState=false;

   public String displayBulb(){
      if(bulbState==true){
          return "the bulb is Off";
      }
      else
          return "the bulb is Onn";
   }
}
