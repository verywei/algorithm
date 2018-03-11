package algorithem;

public class QuickSort {
    public static void main(String []args){
        int []num={5,15,9,7,6,1,8,10,20,4,13};
        QuickSort sort=new QuickSort();
        sort.quicksort(num,0,num.length-1);
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
     public void quicksort(int[] num,int left,int right){
        if (left<right){
            int dp=partition(num,left,right);
            quicksort(num,left,dp-1);
            quicksort(num,dp+1,right);
        }
     }
     public int partition(int[] num,int left,int right){
         int pivot=num[left];
         while (left<right){
             while (left<right&&num[right]>pivot)
                 right--;
             if (left<right)
                 num[left++]=num[right];
             while (left<right&&num[left]<pivot)
                 left++;
             if (left<right)
                 num[right--]=num[left];
         }
         num[left]=pivot;
         return left;
     }
}
