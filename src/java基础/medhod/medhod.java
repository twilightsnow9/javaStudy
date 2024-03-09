package java基础.medhod;

    // medhod方法
    public class medhod {
        public static void main(String[] args) {
            an an = new an();
            System.out.println(an.cat());
            int arr[] = {1,2,3,4,5,6};
            int arrm[] = new int[5];
            arrm[2] = 100;
            System.out.println(arrm[2]);
            System.out.println(arr[2]);
        }
    }
    class an {
        public String cat() {
            return "cat";
        }
    }