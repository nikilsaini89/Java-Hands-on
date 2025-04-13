enum Status{
    NOT_FOUND(404), OK(200), CREATED(201), DONE(303),
    NO_CODE;


    private int code;
    private Status(){
        // For NO_CODE, this constructor needs to be there, if there is no parameterised constructor, then this constructor is there by default, 
        // else it is not, we can set the code here, if not set, it is zero.
        code = 1000;
    }
    private Status(int code){
        this.code = code;
    }
    public int getCode(){
        return this.code;
    }
}
public class ae_Enum {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Status s = Status.valueOf("NOT_FOUND"); 
        Status ok = Status.OK;
        // System.out.println(s);
        // System.out.println(ok);

        for(Status st: Status.values()){ //.values is the method that we got because Status is also a class
            System.out.println(st.ordinal() + " : " + st ); //ordinal prints the index starting 0
            System.out.println("Status Code is " + st.getCode() + "\n");
        }
    }
}
