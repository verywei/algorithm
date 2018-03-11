package algorithem;

public class ShellSort {
    public static void main(String[] args) {
        int[] num = {5, 15, 9, 7, 6, 1, 8, 10, 20, 4, 3, 12, 34};
        ShellSort bubbleSort = new ShellSort();
        bubbleSort.sort(num);
        for (int i : num) {
            System.out.print(i + " ");
        }
    }
    public void sort(int[] num) {
        shell(num, 5);
    }
    public void shell(int[] num, int increment) {
        for (int i = 0; i < increment; i++) {
            for (int j = 0; j < num.length; j++) {
                for (int k = j; k < num.length; k += increment)
                    if (num[j] > num[k]) {
                        swap(num, j, k);
                    }
            }
        }
        if (increment / 2 > 0)
            shell(num, increment / 2);
    }

    public void swap(int[] num, int lo, int hi) {
        int flag = num[lo];
        num[lo] = num[hi];
        num[hi] = flag;
    }
}
