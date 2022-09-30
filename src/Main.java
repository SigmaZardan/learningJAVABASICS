public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Learning git ");
        // learning new things

        //for loop in the context
        for(int i = 0;i< 5;i++){

            System.out.println(i);
            System.out.println("Hello World!");
        }

        // learning about functions

        //invoking functions

      int result1 =   sum(23,234);
        System.out.println(result1);
        int result2 = sum(23,34,235);
        System.out.println(result2);


    }

    static int sum(int a, int b){
        return a + b;

    }
    // let's override this function
    static int sum(int a , int b, int c){
        return a + b + c;
    }
}