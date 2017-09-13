public class DebugCustomer
{
    protected int idNumber;
    protected String name;
    protected double creditLimit;
    public DebugCustomer(int id, String name, double credit)
    {

        this.idNumber = id;
       this.name = name;
       this.creditLimit = credit;
    }

    public DebugCustomer() {
        this.idNumber = 0;
        this.name = "";
        this.creditLimit = 0;
    }

    public void display()
    {
       System.out.println("Customer #" + idNumber +
          " Name: " +  name + "\nCredit limit $" + creditLimit);
    }
}
