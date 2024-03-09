package lqb;

public class Shape {
//    第一个矩形的A点
    private int xA;
    private int yA;
//    第一个矩形的B点
    private int xB;
    private int yB;

    public int getxA() {
        return xA;
    }

    public void setxA(int xA) {
        this.xA = xA;
    }

    public int getyA() {
        return yA;
    }

    public void setyA(int yA) {
        this.yA = yA;
    }

    public int getxB() {
        return xB;
    }

    public void setxB(int xB) {
        this.xB = xB;
    }

    public int getyB() {
        return yB;
    }

    public void setyB(int yB) {
        this.yB = yB;
    }

    public Shape() {
    }

    public Shape(int xA, int yA, int xB, int yB) {
        this.xA = xA;
        this.yA = yA;
        this.xB = xB;
        this.yB = yB;
    }

    public int zheng() {
        int a = this.getxB() - this.getxA();
        int b = this.getyB() - this.getyA();
        return a * b;
    }

    public int zhong(int a,int b) {
        int z = 0;
        z = a + b;
        return z;
    }

}
