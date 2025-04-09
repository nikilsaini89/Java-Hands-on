class Calculator{
    int num = 5;
    public int add(int a, int b){
        return a+b;
    }
}
/*
 * Stack contains local variables like a, b in add, then a, b, data in main,
 * The obj1, obj2  will be stored in heap.
 * Num will also be stored in Heap as it is not local but a instantiated varible.
 * 
 * Stack  - 
 * 
 * main - 
 * data - stored the value in stack 
 * a
 * b
 * result
 * ob1 and ob2, but they point to address in the heap memory 
 */
public class af_StackAndHeap {
    public static void main(String[] args) {
        int data = 10;
        System.out.println(data);
        Calculator obj1 = new Calculator();
        Calculator obj2 = new Calculator();

        int a = 2, b = 5;
        int result = obj1.add(a,b);
        System.out.println(result); // prints 7


        obj2.num = 8;
        System.out.println(obj2.num); //print 8
        System.out.println(obj1.num); // print 5
    }
}
