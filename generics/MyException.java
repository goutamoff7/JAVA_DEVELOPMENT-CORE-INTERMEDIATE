/*Java does not support generic type exceptions because:
Type erasure removes generic type parameters at runtime.
Ambiguous exception handling would occur due to erased types.
        Java’s exception model relies on precise type matching.
Catching generic exceptions is unsafe and could lead to runtime errors. */

// we can use generic type constructor
public class MyException extends Exception  {
    public <T> MyException(T value){
        super("Exception related to value : "+
                value.toString()+
                " of type : "+
                value.getClass().getName());
    }

    public static void main(String[] args) {
        try{
            throw new MyException(123);
        }catch(MyException e){
            System.out.println("Caught Exception : "+e.getMessage());
        }

        try{
            throw new MyException("Hello");
        }catch(MyException e){
            System.out.println("Caught Exception : "+e.getMessage());
        }
    }
}
