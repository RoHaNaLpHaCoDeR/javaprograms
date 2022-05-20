public class CWH_CH7_PS7 {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d * %d = %d\n",n,i,n*i );
        }
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static int sumRec(int n){
        // Base Condition
        if(n==1){
            return 1;
        }
        return n+sumRec(n-1);
    }
    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) +fib(n-2);
        }
    }
    public static void main(String[] args) {
        // Problem 1
        multiplication(7);
        // Problem 2
        pattern(4);
        // Problem 3
        int c = sumRec(5);
        System.out.println(c);
        // Problem 4
//        reverse of problem 2
        // Problem 5
        int result = fib(5);
        System.out.println(result);
        // Problem 6
        // do it yourself
        // Problem 7

    }
}
