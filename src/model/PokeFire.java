public class PokeFire extends Pokemon{

  private int firePower;
  private int flareIntensity;

  public PokeFire (String name, int health, int number, int level, int evolutionLv, String basicAttack, int victories, String enemy, int firePower, int flareIntensity){
    super (name, health, number, level, evolutionLv, basicAttack, victories, enemy);
    this.firePower = firePower;
    this.flareIntensity = flareIntensity;
  }

  public int calcPower(int ev){
    potencia = (ev * firePower)/super.getEvolutionLevel();
    return power;
  }

//  @Override
  public String toString(){
    return super.toString() +
    "\n Fire power: " + firePower +
    "\n Flare intensity: " + flareIntensity +
    "\n";
  }
}
