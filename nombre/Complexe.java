package nombre;

public class Complexe<Re, Im> 
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

    public String toString() 
    {
        return (re + " + (" + im + ")i");
    }
}
