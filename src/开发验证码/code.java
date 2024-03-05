package 开发验证码;

public class code {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int m = 0;
        int[] word = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N',
                        'O','P','Q','R','S','T','U','V','W','X','Y','Z',
                    'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                        'o','p','q','r','s','t','u','v','w','x','y','z'
                    };
        for (int i = 0; i < arr.length; i++) {
            int a  = ((int)(Math.random() * 100) + 1);
            arr[i] = word[a];
            m++;
        }
    }
}
