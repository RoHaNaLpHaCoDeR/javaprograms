public class CHW_CH6_23_Arrays {
    public static void main(String[] args) {
        int [] marks = {100,98,78,88,99};
        float [] marks_float = {95.5f, 45.5f,88.4f , 94.4f};
        String [] students = {"Harry" , "Rohan" , "Shubham" , "Piyush"};
        System.out.println(students.length);
        System.out.println(marks_float.length);
        System.out.println(marks.length);
        System.out.println(marks[4]);
        System.out.println(marks_float[2]);
        System.out.println(students[1]);
        //Displaying the array (Using for loop)
        for(int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        // Reverse order array
        for(int i= marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        // For each loop
        for(int element : marks){
            System.out.println(element);
        }
    }
}
