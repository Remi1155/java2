package algebre;

import nombre.Complexe;
import nombre.Rationnel;

public class Matrice 
{
    private Object[][] elements;
    private int lignes;
    private int colonnes;

    public Matrice(Object[][] elements) 
    {
        this.lignes = elements.length;
        this.colonnes = elements[0].length;
        this.elements = new Object[lignes][colonnes];

        for (int i = 0; i < lignes; i++) 
        {
            for (int j = 0; j < colonnes; j++) 
            {
                if (!(elements[i][j] instanceof Number || elements[i][j] instanceof Rationnel || elements[i][j] instanceof Complexe)) 
                {
                    throw new IllegalArgumentException("Les éléments doivent être de type Number, Rationnel ou Complexe");
                }
                this.elements[i][j] = elements[i][j];
            }
        }
    }

    public Object[][] getElements() 
    {
        return elements;
    }

    public int getLignes() 
    {
        return lignes;
    }

    public int getColonnes() 
    {
        return colonnes;
    }

    public String toString() 
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lignes; i++) 
        {
            sb.append("(");
            for (int j = 0; j < colonnes; j++) 
            {
                sb.append(elements[i][j]).append("  ");
            }
            sb.append(")\n");
        }
        return sb.toString();
    }
}
