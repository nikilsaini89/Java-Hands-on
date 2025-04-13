/*  
 * System.out.println();
 * Println is a method in the printstream class
 * out is the object of the printstream class which is declared inside the System class as a static variable
 * As it is static, we can declare it directly using System (class name)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ah_UserInput {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); //nextLine() is used to take string input from the user
        System.out.println("Your name is " + name);
        sc.close(); 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //BufferedReader is used to read input from the user
        System.out.println("Enter your name: ");
        String name1 = br.readLine(); //readLine() is used to take string input from the user
        System.out.println("Your name is " + name1);
        br.close(); 


        int num = System.in.read(); //System.in is used to read input from the user, It converts the input taken into
        // ASCII format and prints the ascii value.It reads only 1 val at a time
        System.out.println(num);    
    }
}
