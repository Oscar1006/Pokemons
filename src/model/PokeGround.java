package model;

public class PokeGround{

  private double depth;

  public PokeGround (String name, int health, int number, int level, int evolutionLv, String basicAttack, int victories, String enemy, double depth){

    super(name, health, number, level, evolutionLv, basicAttack, victories, enemy)

    this.depth = depth;

  }

  public void toString(){
    return super.toString() +
    "\n Digging depth:" + depth +
    "\n";
  }
}
