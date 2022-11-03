public class linearserchingstring14 {
    public static void main(String[]args){
        String[] arr={"saroj","kumar","roy","aman","rahul","mohan"};
        String item="aman";
        int temp=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i].equals(item)){
             System.out.print("item present in "+i+"index position");
             temp=temp+1;
            }
        }
    if(temp==0){
        System.out.print("item are not avaleble in array");
    }
    
    
    }
    }

