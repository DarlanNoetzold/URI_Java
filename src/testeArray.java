import java.util.Arrays;

public class testeArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 58, 12, 34, 75};
        int[] b = {3, 5, 7, 9, 11, 5, 7, 9, 84, 6};
        int[] c = new int[a.length + b.length];

        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0, j = 0, it = 0; i < a.length || j < b.length; it++) {
            if (i >= a.length) {
                c[it] = b[j];
                j++;
            } else if (j >= b.length) {
                c[it] = a[i];
                i++;
            } else {
                if (a[i] <= b[j]) {
                    c[it] = a[i];
                    i++;
                } else {
                    c[it] = b[j];
                    j++;
                }        
            }
        }

        for (int jt = 0; jt < c.length; jt++) {
            System.out.println(c[jt]);
        }
    }
}