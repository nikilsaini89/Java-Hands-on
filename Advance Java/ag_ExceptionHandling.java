/*
 * Exceptions are Run-Time Errors, But even in case we get such kind of exceptions, our program should not break, it should 
 * continue executing
 * We ensure this by using catch block, the try block tries to do some operation and the catch block catches the exception if 
 * it founds a exception.
 * One try block can have multiple cathc blocks and we can catch different types of exceptions(NullPointerExc, 
 * ArrayIndOutofbound ex.). Every type of exception (like RunTimeException) extends the Exception class. 
 * 
 * There are two types of exceptions, checked and unchecked.
 * Checked needs to be handled using try catch block(like ClassNotFoundException) but the unchecked exception need not to be
 * handeled.
 * 
 * If we want to make our own exception then we need to make a class of it and then needs to call the super() method inside
 * the constructor to make sure that the message is set correctly by the Exception class.
 * Ex- 
 * class myExc{
 *      myExc(String ErrorMsg){
 *          super(ErrorMsg) //passes to Exception class which sets the message
 *      }
 * }
 * Example usage - 
 *      throw new MyExc(message);
 * 
 * Throw keyword is used to throw a certain type of exception, which should be handled by a try catch block.
 * Throws keyword use - 
 * public void demo() throws xyz_Exception
 * 
 * it is done in the case when a method does not want to handle a exception, but it wants the method that called it to handle
 * the same. (this is called as ducking the exception)
 * We generally do not use throws keyword with the main method because main is called by JVM and we are asking JVM to handle
 * the exception using try catch block but it will simply stop the execution. 
 *  
 */



public class ag_ExceptionHandling extends RuntimeException{
    public static void main(String[] args) {
        
    }
}
