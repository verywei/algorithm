package algorithem;

public class BubbleSort {
    public static void  main(String []args){
        int []num={5,15,9,7,6,1,8,10,20,4,13};
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.sort(num);
        for (int i : num) {
            System.out.print(i+" ");
        }
    }
    public void sort(int []num){
        for (int i=0;i<num.length;i++){
            for (int j=i;j<num.length;j++){
                if (num[i]<num[j]){
                    swap(num,i,j);
                }
            }
        }
    }
    public void swap(int[] num,int lo,int hi){
        int flag=num[lo];
        num[lo]=num[hi];
        num[hi]=flag;
    }
}
