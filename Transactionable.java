public interface Transactionable{
  public int getThingIndex(String thing);
  public String getName();
  public double getCash();
  public void changeCash(double amount);
  public void changeThingQuantity(String thing, double quantityChanged);
}
