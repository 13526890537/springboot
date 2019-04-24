public class MaoPao {
    public static void main(String[] args) {
        int[] a  = {1,3,7,2,3,2,2,1,7,9,0,6};
        int b = 0;
        for (int i = 0; i <a.length-1 ; i++) {
            for (int j = 0; j <a.length-i-1; j++) {
                if (a[j] >a[j+1]) {
                    b = a[j+1];
                    a[j+1] = a[j];
                    a[j] = b;
                }
            }
        }
        for (int c:a) {
            System.out.println(c);
        }
    }
}
