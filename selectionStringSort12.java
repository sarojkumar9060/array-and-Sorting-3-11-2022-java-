public class selectionStringSort12 {
    public static void main(String[]args){
        String[] a={"saroj","kumar","roy","laxminiya","aman","good","morning"};
        int main;
        String temp;
        for(int i=0; i<a.length;i++){
            main=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j].compareTo(a[main])<0){
                    main=j;
                }
            }
            temp=a[i];
            a[i]=a[main];
            a[main]=temp;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }

    }
}
