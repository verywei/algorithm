package algorithem;

public class SelectSort {
    public static void main(String[]args){
        int []num={5,15,9,7,6,1,8,10,20,4,13};
        SelectSort selectSort=new SelectSort();
        selectSort.sort(num);
        for (int i : num) {
            System.out.print(i+" ");
        }
    }
    public void sort(int[]num){
        int []tansit=new int[num.length];
        for (int i=0;i<num.length;i++){
            int max=0;
            for (int j=i;j<num.length;j++){
                if (max<num[j]){
                    max=num[j];
                    swap(num,j,i);
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
