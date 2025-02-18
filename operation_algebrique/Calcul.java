package operation_algebrique;

import algebre.Matrice;
import algebre.Vecteur;
import nombre.Complexe;
import nombre.Rationnel;
import operation.Arithmetique;

public class Calcul 
{
    public static Vecteur add2Vecteur(Vecteur v1, Vecteur v2) 
    {
        Object[] coords_v1 = v1.getCoordonnees();
        Object[] coords_v2 = v2.getCoordonnees();
        if (coords_v1.length != coords_v2.length) 
        {
            throw new IllegalArgumentException("Les deux vecteurs n'ont pas la même taille");
        }
        Object[] result = new Object[coords_v1.length];
        for (int i = 0; i < coords_v1.length; i++) 
        {
            if (!(coords_v1[i] instanceof Number || coords_v1[i] instanceof Rationnel
                    || coords_v1[i] instanceof Complexe) ||
                    !(coords_v2[i] instanceof Number || coords_v2[i] instanceof Rationnel
                            || coords_v2[i] instanceof Complexe)) 
                            {
                throw new IllegalArgumentException("Les éléments doivent être de type Number, Rationnel ou Complexe");
            }
            result[i] = Arithmetique.sum(coords_v1[i], coords_v2[i]);
        }
        return new Vecteur(result);
    }

    // public static Vecteur soustraire2Vecteur(Vecteur v1, Vecteur v2)
    // {
    // Object[] coords_v1 = v1.getCoordonnees();
    // Object[] coords_v2 = v2.getCoordonnees();
    // if (coords_v1.length != coords_v2.length)
    // {
    // throw new IllegalArgumentException("Les deux vecteurs n'ont pas la même
    // taille");
    // }
    // Object[] result = new Object[coords_v1.length];
    // for (int i = 0; i < coords_v1.length; i++)
    // {
    // if (!(coords_v1[i] instanceof Number || coords_v1[i] instanceof Rationnel ||
    // coords_v1[i] instanceof Complexe) ||
    // !(coords_v2[i] instanceof Number || coords_v2[i] instanceof Rationnel ||
    // coords_v2[i] instanceof Complexe))
    // {
    // throw new IllegalArgumentException("Les éléments doivent être de type Number,
    // Rationnel ou Complexe");
    // }
    // if (coords_v1[i] instanceof Number && coords_v2[i] instanceof Number)
    // {
    // result[i] = ((Number) coords_v1[i]).doubleValue() - ((Number)
    // coords_v2[i]).doubleValue();
    // }
    // else
    // {
    // throw new UnsupportedOperationException("Soustraction non prise en charge
    // pour ces types");
    // }
    // }
    // return new Vecteur(result);
    // }

    public static Matrice add2Matrice(Matrice m1, Matrice m2) 
    {
        if (m1.getLignes() != m2.getLignes() || m1.getColonnes() != m2.getColonnes()) 
        {
            throw new IllegalArgumentException("Les deux matrices doivent avoir la même taille.");
        }

        int lignes = m1.getLignes();
        int colonnes = m1.getColonnes();
        Object[][] result = new Object[lignes][colonnes];

        for (int i = 0; i < lignes; i++) 
        {
            for (int j = 0; j < colonnes; j++) 
            {
                if (!(m1.getElements()[i][j] instanceof Number || m1.getElements()[i][j] instanceof Rationnel
                        || m1.getElements()[i][j] instanceof Complexe) ||
                        !(m2.getElements()[i][j] instanceof Number || m2.getElements()[i][j] instanceof Rationnel
                                || m2.getElements()[i][j] instanceof Complexe)) 
                                {
                    throw new IllegalArgumentException(
                            "Les éléments doivent être de type Number, Rationnel ou Complexe");
                }
                result[i][j] = Arithmetique.sum(m1.getElements()[i][j], m2.getElements()[i][j]);
            }
        }
        return new Matrice(result);
    }

    // public static Matrice soustraire2Matrice(Matrice m1, Matrice m2)
    // {
    // if (m1.getLignes() != m2.getLignes() || m1.getColonnes() != m2.getColonnes())
    // {
    // throw new IllegalArgumentException("Les deux matrices doivent avoir la même
    // taille.");
    // }

    // int lignes = m1.getLignes();
    // int colonnes = m1.getColonnes();
    // Object[][] result = new Object[lignes][colonnes];

    // for (int i = 0; i < lignes; i++)
    // {
    // for (int j = 0; j < colonnes; j++)
    // {
    // if (!(m1.getElements()[i][j] instanceof Number || m1.getElements()[i][j]
    // instanceof Rationnel || m1.getElements()[i][j] instanceof Complexe) ||
    // !(m2.getElements()[i][j] instanceof Number || m2.getElements()[i][j]
    // instanceof Rationnel || m2.getElements()[i][j] instanceof Complexe))
    // {
    // throw new IllegalArgumentException("Les éléments doivent être de type Number,
    // Rationnel ou Complexe");
    // }
    // if (m1.getElements()[i][j] instanceof Number && m2.getElements()[i][j]
    // instanceof Number)
    // {
    // result[i][j] = ((Number) m1.getElements()[i][j]).doubleValue() - ((Number)
    // m2.getElements()[i][j]).doubleValue();
    // }
    // else
    // {
    // throw new UnsupportedOperationException("Soustraction non prise en charge
    // pour ces types");
    // }
    // }
    // }
    // return new Matrice(result);
    // }
}
