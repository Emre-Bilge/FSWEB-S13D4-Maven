package org.example;

public class Player {

   private String name;
   private int healthPercentage;
   private Weapon weapon;



   public Player(String name , int healthPercentage , Weapon weapon){
       this.name=name;

       if(healthPercentage > 0){
           this.healthPercentage=100;
       }else if(healthPercentage < 0){
           this.healthPercentage= 0 ;
       }else {
           this.healthPercentage = healthPercentage;
       }

       this.weapon=weapon;
   }

   public double healthRemaining(){
       return healthPercentage;
   }

   public void loseHealth(int damage){
    healthPercentage -= damage;
  if(healthPercentage <= 0){
      healthPercentage=0;
      System.out.println(name + " player has been knocked out of game");
  }


   }

   public void restoreHealth(int healthPotion){
       if(healthPercentage+healthPotion > 100){
           this.healthPercentage=100;
       }
       else {
           this.healthPercentage = this.healthPercentage+healthPotion;
       }

   }
}
