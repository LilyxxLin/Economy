package worldEconomy;
public interface Transactionable{
  public String getName();
  public double getCash();
  public void changeCash(double amount);
}
