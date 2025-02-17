package algebre;

public class Matrice 
{
    private double[][] elements;
    private int lignes;
    private int colonnes;

    public Matrice(double[][] elements) 
    {
        this.lignes = elements.length;
        this.colonnes = elements[0].length;
        this.elements = new double[lignes][colonnes];

        for (int i = 0; i < lignes; i++) 
        {
            for (int j = 0; j < colonnes; j++) 
            {
                this.elements[i][j] = elements[i][j];
            }
        }
    }

    public double[][] getElements() 
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

    public void show() 
    {
        int i = 0;
        int j = 0;
        for (i = 0; i < lignes; i++) 
        {
            System.out.print("(");
            for (j = 0; j < colonnes; j++) 
            {
                System.out.print(elements[i][j] + "  ");
            }
            System.out.println(")");
        }
    }
}
