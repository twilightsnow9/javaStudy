package lqb;

public class ShapeTest {
    public static void main(String[] args) {
//        前提条件 x2 > x1 ; y2 > y1
        Shape R1 = new Shape(1, 1,3,3);
        Shape R2 = new Shape(2, 2,4,4);
//        如果R1 和R2没有交集
        if (R2.getxA() >= R1.getxB() || R2.getyA() >= R1.getyB()) {
            System.out.println(R1.zhong(R1.zheng() ,R2.zheng()));
        }
//        如果x3 < s2
        else if (R2.getxA() < R1.getxB() || R2.getyA() < R1.getyB()) {
            int ze = (R1.zheng() + R2.zheng()) - (R1.getxB() - R2.getxA()) * (R1.getyB() - R2.getyA());
            System.out.println(ze);
        }
//        s1.zhong(s1.zheng() ,s2.zheng());
    }
}
