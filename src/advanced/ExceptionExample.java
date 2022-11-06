package advanced;

public class ExceptionExample
{
    public static void main(String[] args)
    {
        try
        {
            int [] num = {1,2,3,4};
            System.out.println(num[2]);
        }
        catch (Exception e)
        {
            System.out.println("Something was wrong ! ");
        }
        System.out.println("Hello world !");
        try
        {
            //int num1 = 5/0;
            int [] num = {1,2,3,4};
            System.out.println(num[4]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException found. " );
            System.out.println("Exception : " + e);

        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Nothing was wrong with Array's Index.");
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong !");
        }
        finally
        {
            System.out.println("Finally for finally block !");
        }
    }
}

/*
public class ExceptionExample {
    public static void main(String[] args) {

       try{
           //int num1 = 5/0;
           int[] num = {1,2,3,4};
           System.out.println(num[4]);
       }catch(ArithmeticException | OutOfMemoryError e){
           System.out.println("There was a problem withe Math OP.");
           System.out.println("Exception : " + e);
       }catch (ArrayIndexOutOfBoundsException e ){
           System.out.println("Something went wrong with Array's index. ");
       }catch (Exception e){
           System.out.println("Something went wrong ! ");
       }finally {
           System.out.println("Finally Block.");
       }

    }
}
*/