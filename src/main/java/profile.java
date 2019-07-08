import java.util.Comparator;
import java.util.Date;

public class profile implements Cloneable{
    private int a;
    private String b;
    private Date c;

    public profile(int a, String b, Date c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "profile{" +
                "a=" + a +
                ", b='" + b + '\'' +
                ", c=" + c +
                '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Date getC() {
        return c;
    }

    public void setC(Date c) {
        this.c = c;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        profile e=(profile)super.clone();
        e.setC((Date)this.c.clone());
        return e;
    }




}
