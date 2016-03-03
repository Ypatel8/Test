public class Chameleon extends Lizard
{
    boolean tail;
    public Chameleon(String name,int length,boolean tail)
    {
        super(name);
        super.setLength(length);
        this.tail=tail;
    }
    
    public void setTail(boolean tail)
    {
        this.tail=tail;
    }
    
    public boolean getTail()
    {
        return tail;
    }
    
    public String toString()
    {
        if(tail=true)
            return super.toString()+"\nIs a Chameleon with a tail";
        else
        {
            return super.toString()+"\nIs a Chameleon without a tail";
        }
    }
    
    public String tongue()
    {
        return "Red";
    }
    
    public String color()
    {
        return "Many but mostly green";
    }
}