package WorldEconomy;

public class Entity 
{  // do we want to make this class abstract
  private String name;
  private double totalAsset;
  
  public Entity(String name, double totalAsset)
  {
      this.name = name;
      this.totalAsset = totalAsset;
  }
  
  public void transactMoney(double amount)
  {
      this.totalAsset += amount;
  }
  
  public String getName()
    return this.name;
  
  public double getTotalAsset()
    return this.totalAsset

}
