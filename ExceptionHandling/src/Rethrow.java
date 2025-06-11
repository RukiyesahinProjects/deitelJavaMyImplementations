public class Rethrow {
    public  static void method() throws Exception {
        try {
            throw new Exception("Something went wrong");
        }catch (Exception e){
            System.out.println("Handling and rethrowing: " + e.getMessage());
            throw e;
        }
    }
    public static void main(String[] args){
        try {
            method();
        }catch (Exception e){
            System.out.println("Caught in main: " + e.getMessage());
        }
    }
}
