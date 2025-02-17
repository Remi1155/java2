package algebre;

public class Vecteur 
{
    private double[] coordonnees;

    public Vecteur(double[] coordonnees) 
    {
        this.coordonnees = coordonnees;
    }

    public double[] getCoordonnees() 
    {
        return coordonnees;
    }

    public void setCoordonnees(double[] coordonnees) 
    {
        this.coordonnees = coordonnees;
    }

    public void show() 
    {
        int i = 0;
        System.out.print("(");
        for (i = 0; i < coordonnees.length; i++) 
        {
            System.out.print(coordonnees[i] + "  ");
        }
        System.out.print(")");
        System.out.println();
    }
}
