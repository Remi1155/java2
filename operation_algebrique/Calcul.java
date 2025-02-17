package operation_algebrique;
import algebre.Matrice;
import algebre.Vecteur;

public class Calcul 
{
    public static Vecteur add2Vecteur(Vecteur v1, Vecteur v2) 
    {
        double[] coords_v1 = v1.getCoordonnees();
        double[] coords_v2 = v2.getCoordonnees();
        if (coords_v1.length != coords_v2.length) 
        {
            throw new IllegalArgumentException("Les deux vecteurs n'ont pas de meme taille");
        }
        double[] result = new double[coords_v1.length];
        for (int i = 0; i < coords_v1.length; i++) 
        {
            result[i] = coords_v1[i] + coords_v2[i];    
        }
        return new Vecteur(result);
    }

    public static Vecteur soustraire2Vecteur(Vecteur v1, Vecteur v2) 
    {
        int i = 0;
        double[] coords_v1 = v1.getCoordonnees();
        double[] coords_v2 = v2.getCoordonnees();
        if (coords_v1.length != coords_v2.length) 
        {
            throw new IllegalArgumentException("Les deux vecteurs n'ont pas de meme taille");
        }
        double[] result = new double[coords_v1.length];
        for (i = 0; i < coords_v1.length; i++) 
        {
            result[i] = coords_v1[i] - coords_v2[i];    
        }
        return new Vecteur(result);
    }

    public static Matrice add2Matrice(Matrice m1, Matrice m2) 
    {
        int i = 0;
        int j = 0;
        if (m1.getLignes() != m2.getLignes() || m1.getColonnes() != m2.getColonnes()) 
        {
            throw new IllegalArgumentException("Les deux matrices doivent avoir la même taille.");
        }

        int lignes = m1.getLignes();
        int colonnes = m1.getColonnes();
        double[][] result = new double[lignes][colonnes];

        for (i = 0; i < lignes; i++) 
        {
            for (j = 0; j < colonnes; j++) 
            {
                result[i][j] = m1.getElements()[i][j] + m2.getElements()[i][j];
            }
        }
        return new Matrice(result);
    }

    public static Matrice soustraire2Matrice(Matrice m1, Matrice m2) 
    {
        if (m1.getLignes() != m2.getLignes() || m1.getColonnes() != m2.getColonnes()) 
        {
            throw new IllegalArgumentException("Les deux matrices doivent avoir la même taille.");
        }

        int lignes = m1.getLignes();
        int colonnes = m1.getColonnes();
        double[][] result = new double[lignes][colonnes];

        for (int i = 0; i < lignes; i++) 
        {
            for (int j = 0; j < colonnes; j++) {

                result[i][j] = m1.getElements()[i][j] - m2.getElements()[i][j];
            }
        }
        return new Matrice(result);
    }
}
