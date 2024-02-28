package bus;

public class VariableTest {
    public static void main(String[] args) {
//        一开始没有乘客
        int peoples = 0;
//        第一站
        peoples += 1;
        System.out.println("第一站乘客数：" + peoples);
//        第二站
        peoples += 2;
        peoples -= 1;
        System.out.println("第二站乘客数：" + peoples);
//        第三站
        peoples += 2;
        peoples -= 1;
        System.out.println("第三站乘客数：" + peoples);
//        第四站
        peoples -= 1;
        System.out.println("第四站乘客数：" + peoples);
//        第五站
        peoples += 1;
        System.out.println("第五站乘客数：" + peoples);
        System.out.println("终点站，一共" + peoples + "乘客");
    }
}
