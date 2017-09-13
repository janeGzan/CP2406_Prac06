public class DebugCustomer
{
    private int idNumber;
    private String name;
    double creditLimit;
    public DebugCustomer(int id, String name, double credit)
    {

        this.idNumber = id;
       this.name = name;
       this.creditLimit = credit;
    }

    DebugCustomer() {
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
