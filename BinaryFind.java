package algorithem;

public class BinaryFind {
    public static void main(String[]args){
        int[]num={3,4,5,6,7,8,9,10,23,33,45};
        BinaryFind find=new BinaryFind();
        System.out.println(find.find(num, 23, 0, num.length - 1));
    }
    public int find(int[]num,int find_num,int lo,int hi){
        int mid=(lo+hi)/2;
        if (lo>hi)
            return -1;
        if (num[mid]==find_num){
            return mid;
        }else if (num[mid]>find_num){
            return find(num,find_num,lo,mid-1);
        }else {
            return find(num,find_num,mid+1,hi);
        }
    }
}
