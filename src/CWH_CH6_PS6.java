public class CWH_CH6_PS6 {
    public static void main(String[] args) {
        //Problem 1
//        float [] marks = {45.7f,66.7f,88.5f,99.2f,100.0f};
//        float sum =0;
//        for(float elements: marks){
//            sum = sum + elements;
//        }
//        System.out.println(sum);

        //Problem 2
//        float [] marks = {45.7f,66.7f,88.5f,99.2f,100.0f};
//        float num = 45.7f;
//        boolean isinarray =false;
//        for(float elements: marks){
//            if(num == elements){
//                isinarray =true;
//                break;
//            }
//        }
//        if(isinarray ==true){
//            System.out.println("Element is present in the array");
//        }
//        else{
//            System.out.println("Element is not present in the array");
//        }

        //Problem 3
//        float [] marks = {45.7f,66.7f,88.5f,99.2f,100.0f};
//        float sum =0;
//        for(float elements: marks){
//            sum = sum + elements;
//        }
//        System.out.println("The value of average marks is : " + sum/ marks.length);
//
        // Problem 4
//        int [][] matrix_1 = {{1,2,3},
//                            {4,5,6}};
//        int [][] matrix_2 = {{2,3,4},
//                            {5,6,7}};
//        int [][] result = {{0,0,0},
//                            {0,0,0}};
//        for (int i=0;i< matrix_1.length;i++){
//            for (int j=0;j< matrix_1[i].length;j++){
//                System.out.format("Setting value for i = %d and j =%d \n",i,j);
//                result[i][j] = matrix_1[i][j] + matrix_2[i][j];
//            }
//        }
//        for (int i=0;i< matrix_1.length;i++){
//            for (int j=0;j< matrix_1[i].length;j++){
//                System.out.print(result[i][j] + " ");
//                result[i][j] = matrix_1[i][j] + matrix_2[i][j];
//            }
//            System.out.println("");
//        }
        //Problem 5

//        int [] arr = {1,2,3,4,5,6};
//        int l = arr.length;
//        int n = Math.floorDiv(l,2);
//        int temp;
//        for(int i =0;i<n;i++){
//            temp = arr[i];
//            arr[i] = arr[l-i-1];
//            arr[l-i-1] = temp;
//        }
//        for(int element:arr){
//            System.out.print(element+" ");
//        }
        // Problem 6
//        int [] arr = {1,2,3,4,5,6};
//        int max = 0;
//        for(int e:arr){
//            if(e>max){
//                max=e;
//            }
//        }
//        System.out.println("The value of the maximum element in the array is "+max);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        // Problem 7
        boolean issorted = true;
        int [] arr = {1,54,63,2,7,43};
        for(int i =0;i< arr.length-1;i++){
            if(arr[i]> arr[i+1]){
                issorted = false;
                break;
            }
        }
        if(issorted = true){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
    }
}
