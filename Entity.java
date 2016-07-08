package WorldEconomy;

public class Entity 
{  // do we want to make this class abstract
  private String name;
  //private double totalAsset;
  private double cash;
  public static final String[] DICTIONARY = {"car", "book", "carrot"};
  
  
  public Entity()
  {
    this.name = "";
    this.cash = 0.0;
  }
  
  public Entity(String name, double cash)
  {
      this.name = name;
      this.cash = cash;
  }
  
  public int getItemIndex (String s) //returns index that corresponds to the string, and -1 if not found
  {
    for (int i = 0; i < DICTIONARY.length; i++)
      if(s[i].toLowerCase().equals(s))
        return i;
    return -1;
  }
  
  public String getName()
    return this.name;
  
  public double getCash()
    return this.cash;

}
