package data_types;


//DataTypes are the containers to separate the different type of data
/*DataTypes--->
int, double, float, short, long, byte, boolean, char*/
public class JavaDataTypes {
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getDub() {
        return dub;
    }

    public void setDub(double dub) {
        this.dub = dub;
    }

    public float getFl() {
        return fl;
    }

    public void setFl(float fl) {
        this.fl = fl;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    int num = 1;
    double dub = 10;
    float fl = 1.0f;
    short s = 0;
    long l = 0;
    byte b = 0;
    boolean t = true;
    char c = 'M';

    public static void main(String[] args) {
        JavaDataTypes j = new JavaDataTypes();
        System.out.println(j.getB());
        System.out.println(j.getC());

    }

}
