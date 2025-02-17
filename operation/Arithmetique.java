package operation;

import nombre.Complexe;
import nombre.Rationnel;

public class Arithmetique {
    public static Rationnel add2rationnels(Rationnel r1, Rationnel r2) 
    {
        int num = r1.getNum() * r2.getDen() + r2.getNum() * r1.getDen();
        int den = r1.getDen() * r2.getDen();
        return new Rationnel(num, den);
    }

    public static <Re1 extends Number, Im1 extends Number, Re2 extends Number, Im2 extends Number> Complexe<?, ?> add2Complexe(
    Complexe<Re1, Im1> c1, Complexe<Re2, Im2> c2) 
    {
        Number re = sum(c1.getRe(), c2.getRe());
        Number im = sum(c1.getIm(), c2.getIm());
        return new Complexe<>(re, im);
    }

    private static Number sum(Number a, Number b) 
    {
        if (a instanceof Integer && b instanceof Integer) 
        {
            return a.intValue() + b.intValue();
        } 
        else if (a instanceof Long && b instanceof Long) 
        {
            return a.longValue() + b.longValue();
        } 
        else if (a instanceof Float && b instanceof Float) 
        {
            return a.floatValue() + b.floatValue();
        } 
        else 
        {
            return a.doubleValue() + b.doubleValue();
        }
    }

    // public static Irationnel add2Irationnels(Irationnel i1, Irationnel i2)
    // {
    // double irrational = i1.getIrrational() + i2.getIrrational();
    // return new Irationnel(irrational);
    // }

}
