package nombre;

public class Complexe<Re extends Number, Im extends Number> 
{
    private Re re;
    private Im im;

    public Complexe(Re re, Im im) 
    {
        this.re = re;
        this.im = im;
    }

    public Re getRe() 
    {
        return re;
    }

    public Im getIm() 
    {
        return im;
    }

    public void show() 
    {
        System.out.println(re + " + " + im + "i");
    }
}
