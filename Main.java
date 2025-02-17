import algebre.Matrice;
import algebre.Vecteur;
import nombre.Complexe;
import nombre.Rationnel;
import operation.Arithmetique;
import operation_algebrique.Calcul;

public class Main {
    public static void main(String[] args) {
        Complexe<Integer, Integer> c1 = new Complexe<>(3, 4);
        Complexe<Double, Integer> c2 = new Complexe<>(2.5, 1);
        Complexe<Rationnel, Rationnel> c3 = new Complexe<>(new Rationnel(1, 2), new Rationnel(3, 4));

        System.out.println(Arithmetique.add2Complexe(c1, c2)); // 5.5 + 5.5i
        System.out.println(Arithmetique.add2Complexe(c3, c3));
        // System.out.print("On a c1 = " + c1);
        // System.out.print("et c2 = " + c2);

        System.out.println();

        Rationnel r1 = new Rationnel(1, 2);
        Rationnel r2 = new Rationnel(3, 1);
        Rationnel sumR1andR2 = Arithmetique.add2rationnels(r1, r2);
        System.out.print("On a r1 = " + r1);
        System.out.print("et r2 = " + r2);
        System.out.print("Alors r1 + r2 = " + sumR1andR2);

        System.out.println();

        // Irationnel i1 = new Irationnel(1.5);
        // Irationnel i2 = new Irationnel(3.5);
        // Irationnel i3 = Arithmetique.add2Irationnels(i1, i2);
        // System.out.print("On a i1 = ");
        // i1.show();
        // System.out.print("et i2 = ");
        // i2.show();
        // System.out.print("Alors i1 + i2 = ");
        // i3.show();

        // System.out.println();

        /******************************************/ 
        double[] coordsV1 = {1., 2., 3.};
        double[] coordsV2 = {3., 2., 1.};
        Vecteur v1 = new Vecteur(coordsV1);
        Vecteur v2 = new Vecteur(coordsV2);
        Vecteur v3 = Calcul.add2Vecteur(v1, v2);
        Vecteur v4 = Calcul.soustraire2Vecteur(v1, v2);
        System.out.print("On a v1 = ");
        v1.show();
        System.out.print("et v2 = ");
        v2.show();
        System.out.print("Alors v1 + v2 = ");
        v3.show();
        System.out.print("Et v1 - v2 = ");
        v4.show();
        
        System.out.println();

        double[][] coef1 = 
        {
            {1, 2, 3},
            {4, 5, 6}
        };

        double[][] coef2 = 
        {
            {7, 8, 9},
            {10, 11, 12}
        };

        Matrice m1 = new Matrice(coef1);
        Matrice m2 = new Matrice(coef2);
        Matrice m3 = Calcul.add2Matrice(m1, m2);
        Matrice m4 = Calcul.soustraire2Matrice(m1, m2);

        System.out.println("On a la matrice ");
        m1.show();
        System.out.println("et la matrice ");
        m2.show();
        System.out.println("Alors la somme de ces deux matrices vaut ");
        m3.show();
        System.out.println("et la différence est ");
        m4.show();
    }
}
