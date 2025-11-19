public class BakeryCake
{
  public static void main(String[] args)
  {
    Cake[][] fridge = new Cake[2][5];

    fridge[0][1] = new Cake("Vanilla", 3); 
    fridge[0][2] = new Cake("Chocolate", 2); 
    fridge[1][0] = new Cake("Chocolate", 1);
    fridge[1][2] = new Cake("Vanilla", 2);
    fridge[1][3] = new Cake("Vanilla", 1);
    fridge[1][4] = new Cake("Chocolate", 1);
  }
}
class Cake {
  private String flavor;
  private int tiers;

  public Cake(String flavor, int tiers)
  {
    this.flavor = flavor;
    this.tiers = tiers;

  }
}

  
