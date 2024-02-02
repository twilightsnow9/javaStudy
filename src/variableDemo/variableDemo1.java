package variableDemo;

public class variableDemo1 {
    public static void main(String[] args) {
        int peoples = 0;
        System.out.println("第一站");
        peoples += 1;
        System.out.println("第二站");
        peoples += 2;
        peoples -= 1;
        System.out.println("第三站");
        peoples += 2;
        peoples -= 1;
        System.out.println("第四站");
        peoples -= 1;
        System.out.println("第五站");
        peoples += 1;
        System.out.println(peoples);
    }

}
