public class RemoveDublicate32 {
    public static void main(String[]args){
        int[] a={1,2,2,3,4,5,5,6,6,7,7,8,8,8,9};
        int[] temp=new int[a.length];
        int j=0;
        for(int i=0; i<a.length-1;i++){
            if(a[i]!=a[i+1]){
                temp[j]=a[i];
                j++;
            }
        }
        temp[j]=a[a.length-1];
        for(int i=0; i<j+1;i++){
            System.out.print(temp[i]+" ");        }
    }
}
