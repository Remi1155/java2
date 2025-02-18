package operation;

import nombre.Complexe;
import nombre.Rationnel;

public class Arithmetique 
{
    
    public static Object sum(Object a, Object b) 
    {
        if (a instanceof Rationnel && b instanceof Rationnel) 
        {
            return addRationnels((Rationnel) a, (Rationnel) b);
        } 
        else if (a instanceof Rationnel && b instanceof Number) 
        {
            return addRationnels((Rationnel) a, new Rationnel(((Number) b).intValue(), 1));
        } 
        else if (a instanceof Number && b instanceof Rationnel) 
        {
            return addRationnels(new Rationnel(((Number) a).intValue(), 1), (Rationnel) b);
        } 
        else if (a instanceof Number && b instanceof Number) 
        {
            return sumNumbers((Number) a, (Number) b);
        } 
        else if (a instanceof Complexe && b instanceof Complexe) 
        {
            return addComplexes((Complexe<?, ?>) a, (Complexe<?, ?>) b);
        } 
        else if (a instanceof Complexe && b instanceof Number) 
        {
            return addComplexAndNumber((Complexe<?, ?>) a, (Number) b);
        } 
        else if (a instanceof Number && b instanceof Complexe) 
        {
            return addComplexAndNumber((Complexe<?, ?>) b, (Number) a);
        } 
       
        else if (a instanceof Complexe && b instanceof Rationnel) 
        {
            return addComplexAndRationnel((Complexe<?, ?>) a, (Rationnel) b);
        } 
        else if (a instanceof Rationnel && b instanceof Complexe) 
        {
            return addComplexAndRationnel((Complexe<?, ?>) b, (Rationnel) a);
        } 
        throw new IllegalArgumentException("Types non pris en charge pour l'addition");
    }

    private static Rationnel addRationnels(Rationnel r1, Rationnel r2) 
    {
        int num = r1.getNum() * r2.getDen() + r2.getNum() * r1.getDen();
        int den = r1.getDen() * r2.getDen();
        return new Rationnel(num, den);
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

    private static Complexe<?, ?> addComplexes(Complexe<?, ?> c1, Complexe<?, ?> c2) 
    {
        Object re = sum(c1.getRe(), c2.getRe());
        Object im = sum(c1.getIm(), c2.getIm());
        return new Complexe<>(re, im);
    }

    private static Complexe<?, ?> addComplexAndNumber(Complexe<?, ?> c, Number n) 
    {
        Object re = sum(c.getRe(), n);
        return new Complexe<>(re, c.getIm());
    }

    private static Complexe<?, ?> addComplexAndRationnel(Complexe<?, ?> c, Rationnel r) 
    {
        Object re = sum(c.getRe(), r);
        return new Complexe<>(re, c.getIm());
    }
}
