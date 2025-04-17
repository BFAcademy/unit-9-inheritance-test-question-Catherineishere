public class Money
{
    private double value;

    public Money (double v)
    {
        value = v;
    }

    public double getAmount()
    {
        return value;

    }
  
}
class Coin extends Money
{
    private String samount;
    public Coin (String a, double cv)
    {
        super(cv);
        samount = a;

    }
    
    public String toString()
    {
        return  samount;
    }

    public boolean equals( Money obj1 )
    {
        if( obj1 == null)
        {
            return false;
        }
        Money temp = (Money )obj1;
        return ((temp.getAmount() == super.getAmount()) && temp == obj1  );

    }
}
class Quarter extends Coin
{
    public Quarter()
    {
        super( "Quarter" ,0.25);
    }
    public String toString()
    {
        return "Quarter";
    }


}
class Nickel extends Coin
{
    public Nickel()
    {
        super("Nickel" ,0.1);
    }
    public String toString()
    {
        return "Nickel";
    }

}
class Dime extends Coin
{
    public Dime()
    {
        super("Dime", 0.05);
    }
    public String toString()
    {
        return "Dime";
    }

}

class Bill extends Money
{
    
    public Bill (int bv)
    {
        super(bv);
        
    }
    public String toString()
    {
        return "$" + super.getAmount() ;
    }

}
