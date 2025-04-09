public class Arryas {
    public static void main(String[] args) {
        /*
         * Static Initialisation of Array
         */
        int []num = {1,2,3,4};
        System.out.println(num[0]);

        /*
         * Array with new keyword
         */
        int num2[] = new int[4]; // need to specify the size here
        num2[0] = 1;
        System.out.println(num2[0]);

        /*
         * Multi Dimensional Array
         */
        int TwoDArray[][] = new int[4][4];
        System.out.println(TwoDArray[0][0]);

        System.out.println(Math.random()); // It generates a random number between 0 and 1 (double)
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                TwoDArray[i][j] = (int)(Math.random()*10);
            }
        }
        System.out.println();
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(TwoDArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        /*
         * Enhanced For Loop in Java
         */

        for(int a[]: TwoDArray){
            for(int b: a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
