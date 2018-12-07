package algorithm;

public class Hanoi {

    //汉诺塔问题 ： 递归求解
    void TowersOfHanoi(int n,char frompeg,char topeg, char auxpeg){
        if(n==1){
            System.out.println("Move disk 1 from peg" + frompeg);
            return;
        }


    }

    //递归判断数组是否有序

    public static int isArrayInSortedOrder(int[] A, int index){
        if(A.length == 1) return 1;
        return (A[index - 1] <= A[index - 2])?0:isArrayInSortedOrder(A,index -1 );

    }

    public static void main(String args[]){
        int a[] = {1,2,3,76,5,6,343};
        int a1= isArrayInSortedOrder(a,7);
        System.out.println(a1);

    }

}
