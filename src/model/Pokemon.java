public class Pokemon{

  public final int MAX_EVOLUTION = 3;
  public final int MIN_EVOLUTION = 1;

  private String name;

  private int health;
  private int number;
  private int level;

  private int evolutionLv;
  private String basicAttack;
  private int victories;
  private String enemy;

  public Pokemon (String name, int health, int number, int level, int evolutionLv, String basicAttack, int victories, String enemy){

    this.name = name;

    this.health = health;
    this.number = number;
    this.level = level;

    this.evolutionLv = evolutionLv;
    this.basicAttack = basicAttack;
    this.victories = victories;
    this.enemy = enemy;
  }

  public void generateHealth(){
    health = level * evolutionLv * 10;
  }

  public String toString(){
    return "\n    " + name +
    "\nHealth: " + health +
    "\nNumber: " + number +
    "\nLevel: " + level +
    "\nEvolution: " + evolutionLv +
    "\nBasicAttack: " + basicAttack +
    "\nVictories: " + victories +
    "\nEnemy: " + enemy +
    "\n";
  }
}
