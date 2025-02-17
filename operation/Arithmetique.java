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

    public static <Re1, Im1, Re2, Im2> 
    Complexe<?, ?> add2Complexe(Complexe<Re1, Im1> c1, Complexe<Re2, Im2> c2) 
    {
        Object re = sum(c1.getRe(), c2.getRe());
        Object im = sum(c1.getIm(), c2.getIm());

        return new Complexe<>(re, im);
    }

    public static Complexe<?, ?> addComplexeAndRationnel(Complexe<?, ?> c, Rationnel r) 
    {
        Object re = sum(c.getRe(), r);
        Object im = c.getIm();

        return new Complexe<>(re, im);
    }

    public static Complexe<?, ?> addRationnelAndComplexe(Rationnel r, Complexe<?, ?> c) 
    {
        Object re = sum(r, c.getRe());
        Object im = c.getIm();

        return new Complexe<>(re, im);
    }

    public static Complexe<?, ?> addComplexeAndNumber(Complexe<?, ?> c, Number n) 
    {
        Object re = sum(c.getRe(), n);
        Object im = c.getIm();

        return new Complexe<>(re, im);
    }

    

    private static Object sum(Object a, Object b) 
    {
        if (a instanceof Rationnel && b instanceof Rationnel) 
        {
            return add2rationnels((Rationnel) a, (Rationnel) b);
        } 
        else if (a instanceof Integer && b instanceof Rationnel) 
        {
            return add2rationnels(new Rationnel((Integer) a, 1), (Rationnel) b);
        }
        else if (a instanceof Rationnel && b instanceof Integer) 
        {
            return add2rationnels((Rationnel) a, new Rationnel((Integer) b, 1));
        }
        else if (a instanceof Double && b instanceof Rationnel)
        {
            return add2rationnels(new Rationnel((int) ((Double) a).doubleValue(), 1), (Rationnel) b);
        }
        else if (a instanceof Rationnel && b instanceof Double)
        {
            return add2rationnels((Rationnel) a, new Rationnel((int) ((Double) b).doubleValue(), 1));
        }
        else if (a instanceof Float && b instanceof Rationnel)
        {
            return add2rationnels(new Rationnel((int) ((Float) a).floatValue(), 1), (Rationnel) b);
        }
        else if (a instanceof Rationnel && b instanceof Float)
        {
            return add2rationnels((Rationnel) a, new Rationnel((int) ((Float) b).floatValue(), 1));     
        }
        else if (a instanceof Number && b instanceof Number) 
        {
            return sumNumbers((Number) a, (Number) b);
        } 
        else 
        {
            throw new IllegalArgumentException("Types non pris en charge pour l'addition");
        }
    }

    private static Number sumNumbers(Number a, Number b) 
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
