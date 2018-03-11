package algorithem;

public class HeapSort {
    public static void main(String []args){
        int []num={5,15,9,7,6,1,8,10,20,4,13};
        HeapSort heapSort=new HeapSort();
        heapSort.sort(num);
    }
    public void sort(int []num){
        for (int i=0;i<num.length;i++){
            int lastIndex=num.length-i-1;
            adjustHeap(num,lastIndex);
            System.out.print(num[0]+" ");
            swap(num,0,lastIndex);
        }
    }
    public void adjustHeap(int[]num,int length){
        for (int i=length;i>=0;i--){
            if (num[i]>num[i/2]){
                swap(num,i,i/2);
            }
        }
    }
    public void swap(int[] num,int lo,int hi){
        int flag=num[lo];
        num[lo]=num[hi];
        num[hi]=flag;
    }
}
