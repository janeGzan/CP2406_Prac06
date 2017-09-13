public class DebugCustomerMakingPurchase extends DebugCustomer
{
    private double amountOfPurchase;
    private boolean overLimit;

    DebugCustomerMakingPurchase(int id,
                                String name, double credit, double purchAmount) {
        super();
        amountOfPurchase = purchAmount;
        overLimit = amountOfPurchase > creditLimit;
    }
    @Override
    public void display()
    {
       System.out.println("Purchase amount $" + amountOfPurchase);
       if(overLimit)
          System.out.println("****Credit denied - customer over limit");
       else
          System.out.println("Purchase Okay");
    }
}
