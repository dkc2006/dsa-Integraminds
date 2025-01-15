package day_2.oops;

// interface is 100% abstract class & abstract Function.
//We can't Create Object For interface
interface Switch
{
    abstract void on();
    void off();
}
class Fan implements Switch
{
    @Override
    public void on()
    {
        System.out.println("Fan is On");
    }
    @Override
    public void off()
    {
        System.out.println("Fan is Off");
    }
}
class Light implements Switch
{
    @Override
    public void on()
    {
        System.out.println("Light is On");
    }
    @Override
    public void off()
    {
        System.out.println("Light is Off");
    }
}
class Both implements Switch
{
    @Override
    public void on()
    {
        System.out.println("Both is On");
    }
    @Override
    public void off()
    {
        System.out.println("Both is Off");
    }
}
public class AbstractnExa_2
{
    Switch press(char op)
    {
        if(op=='F')
        {
            return new Fan();
        }
        else
        if(op=='L')
        {
            return new Light();
        }
        else
        {
            return new Both();
        }
    }
    public static void main(String[] args)
    {
        AbstractnExa_2 ab=new AbstractnExa_2();
        Switch ss=ab.press('B');
        ss.on();
        ss.off();
    }
}