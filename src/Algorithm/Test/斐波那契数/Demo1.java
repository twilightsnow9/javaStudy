package Algorithm.Test.斐波那契数;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.Fn(7));
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(demo1.Fn(10));
//        System.out.println(list);
    }
    public int Fn(int i) {
        int a;
        if (i > 2) {
            a = Fn(i - 1) + Fn(i - 2);
        } else {
            return 1;
        }
        return a;
    }
}
