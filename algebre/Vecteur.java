package algebre;

import nombre.Complexe;
import nombre.Rationnel;

public class Vecteur 
{
    private Object[] coordonnees;

    public Vecteur(Object[] coordonnees) 
    {
        for (Object obj : coordonnees) 
        {
            if (!(obj instanceof Number || obj instanceof Rationnel || obj instanceof Complexe)) 
            {
                throw new IllegalArgumentException("Les éléments du vecteur doivent être de type Number, Rationnel ou Complexe");
            }
        }
        this.coordonnees = coordonnees;
    }

    public Object[] getCoordonnees() 
    {
        return coordonnees;
    }

    public void setCoordonnees(Object[] coordonnees) 
    {
        for (Object obj : coordonnees) 
        {
            if (!(obj instanceof Number || obj instanceof Rationnel || obj instanceof Complexe)) 
            {
                throw new IllegalArgumentException("Les éléments du vecteur doivent être de type Number, Rationnel ou Complexe");
            }
        }
        this.coordonnees = coordonnees;
    }

    public String toString() 
    {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < coordonnees.length; i++) 
        {
            sb.append(coordonnees[i]);
            if (i < coordonnees.length - 1) 
            {
                sb.append("  ");
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
