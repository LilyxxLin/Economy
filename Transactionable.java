public interface Transactionable
{
  public int getItemIndex (String s);
  public String getName();
  public double getCash();
  public void changeCash(double amount);
  public void exchangeItem(String thing, double quantity);
}
