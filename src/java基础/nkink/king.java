package java基础.nkink;

public class king {
    public static void main(String[] args) {
        int j;
        int i;
        for ( i = 0; i < 4; i++)
        {
            /* code */
            for ( j = 0; j < 4; j++)
            {
                /* code */
                System.out.println(i + "," +j);
            }
                if (i == j  || i - 1 == j || i + 1 == j ) {
                    System.out.println("打你吗，有问题了");
                }

        }
    }
}
