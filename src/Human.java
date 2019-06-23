package src;


public class Human {
    public int strength;
    public int stealth;
    public int intelligence;
    public int health;
    
    public Human() {
        this.strength = 3;
        this.stealth = 3;
        this.intelligence = 3;
        this.health = 100;        
    }

    public Human attack(Human target) {
        target.health -= this.strength;
        return this;
    }

    public void returnHealth() {
        System.out.println(this.health);
    }
}
 
