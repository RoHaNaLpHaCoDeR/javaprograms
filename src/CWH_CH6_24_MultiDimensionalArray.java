public class CWH_CH6_24_MultiDimensionalArray {
    public static void main(String[] args) {
        // Multidimensional arrays
        int [] marks; // 1-d array
        int [][] flats; // 2-d array
        flats = new int[2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        for(int i=0;i< flats.length;i++){
            for(int j=0;j< flats[i].length;j++){
                System.out.print(flats[i][j] + " ");
            }
            System.out.println("");
        }
//        int [][][] cars = new int [3][4][5]; // 3-d array
    }
}
