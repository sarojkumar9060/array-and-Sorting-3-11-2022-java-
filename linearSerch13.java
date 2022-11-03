public class linearSerch13 {
    public static void main(String[]args){
        int[] arr={5,3,6,1,4,2};
        int item=10;
        int temp=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==item){
                System.out.print("item is present at "+i+" "+"index position"+" ");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("item are not present is list");
        }
    }
}
