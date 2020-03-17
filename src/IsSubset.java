public class IsSubset {
    public static void main(String[] args) {
        int[] array2={1,6,5,8};
        int[] array1= {1,4,7,3,5,6};
        isSubst(array1,array2);

    }

    public static boolean isSubst(int [] array1, int[] array2){
        int i=0;
        int j=0;
        int count=0;
        boolean isSub=false;
        for(i=0;i<array1.length;i++){
            for(j=0; j<array2.length;j++){
                if(array1[i]==array2[j])count++;
            }
        }
        if(count==array2.length){
            isSub=true;
            System.out.println("Yes, Array1 is subset of array2");
        }
        count=0;
        for(i=0;i<array2.length;i++){
            for(j=0; j<array1.length;j++){
                if(array2[i]==array1[j])count++;
            }
        }
        if(count==array1.length){
            isSub=true;
            System.out.println("Yes, Array2 is subset of array1");
        }
        if(isSub==false) System.out.println("None of the arrays are the other one's subset");
        return isSub;
    }
}
