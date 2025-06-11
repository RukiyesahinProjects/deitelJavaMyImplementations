class CustomError extends Exception{
    public CustomError(String message){
        super(message);
    }
}
class FailingConstructor {
    public FailingConstructor(String name) throws CustomError {
        if (name == null){
            throw new CustomError("Name can not be null.");
        }
    }
}
public class ConstructorError {
    public static void main(String[] args){
        try {
            FailingConstructor obj = new FailingConstructor(null);
        }catch (CustomError e){
            System.out.println("Constructor failed: " + e.getMessage());
        }

    }
}
