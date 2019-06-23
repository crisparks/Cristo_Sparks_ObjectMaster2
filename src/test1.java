package src;



public class test1 extends Human
{
   public static void main(String[] args){
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();
        Wizard wizard = new Wizard();
        Ninja ninja = new Ninja();

        wizard.fireball(samurai2);
        wizard.heal(wizard);
        ninja.steal(wizard);
        ninja.runAway();
        wizard.fireball(samurai1);
        wizard.fireball(samurai1);
        ninja.steal(samurai1);
        samurai1.meditate();
        samurai2.howMany();
        samurai1.dealthBlow(samurai2);
        ninja.returnHealth();
        samurai1.returnHealth();
        samurai2.returnHealth();
        wizard.returnHealth();
    }
}
