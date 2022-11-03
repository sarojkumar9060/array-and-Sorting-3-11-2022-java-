import javax.swing.text.AbstractDocument.LeafElement;

public class arryclass2 {
    public static void main(String args[]){

//    3D MATRIX 

        int[][][] arry={{ 
            {1,2,3,4},{5,6,7},{9,10,11,12},{14,15,16,17}
        }};
        // System.out.print(arry.length);
        // System.out.println(" ");
        for(int i=0; i<arry.length; i++){
            for(int j=0; j<arry[i].length; j++){

                for(int k=0; k<arry[i][j].length; k++)
                System.out.print(arry[i][j][k] +" ");
                System.out.println(" ");
            }
        }
        

//   2D arry print 


int[][] arr={
    {1,2,3,4},{5,6,7,8},{9,10,11,12},{14,15,16},
};
for(int i=0; i<arr.length; i++){
    for(int j=0; j<arr[i].length; j++){
        System.out.print(arr[i][j]);


    }
    System.out.println(" ");
}



int [][][][] a={{{
    {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
}}};

 for(int i=0; i<a.length; i++){
    for(int j=0; j<a[i].length; j++){
        for(int k=0; k<a[i][j].length; k++){
            for(int l=0; l<a[j][k].length; l++){
                System.out.print(a[i][j][k][l]);

            }
        }
    }
 }

    }
    
}
