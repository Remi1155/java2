package nombre;

public class Rationnel 
{
    private int num;
    private int den;

    public Rationnel(int num, int den) 
    {
        if (den == 0) 
        {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être 0");
        }
        this.num = num;
        this.den = den;
    }

    public int getNum() 
    {
        return num;
    }

    public int getDen() 
    {
        return den;
    }

    public void show() 
    {
        System.out.println(num + "/" + den);
    }
}