
class ExceptionHandling {
    public static void main(String[] args) {
        int n = 0;
        // An example for try catch block
        try {
            System.out.println(25 / n);
            System.out.println("Great No Exception");
        } catch (ArithmeticException e) {
            System.out.println("throws an arithmetic exception1");

        }
        // a function can handle exception in two ways 1)using try catch block inside
        // 2)thrwing the excep to the called func
        // 1)
        print(n);
        // 2)
        try {
            print2(n);
            // 3)create own exception
            print3(n);
        } catch (ArithmeticException e) {
            System.out.println("this exception is handled by the callled function ");
        }

    }

    public static void print(int n) {
        // this is handling the exception inside a function
        try {
            System.out.println(25 / n);
            System.out.println("Great No Exception");
        } catch (ArithmeticException e) {
            System.out.println("throws an arithmetic exception2");

        }

    }

    public static void print2(int n) throws ArithmeticException {
        // this is handling the exception inside a function

        System.out.println(25 / n);

    }

    public static void print3(int n) {
        // this exception now can be handled inside or thrown to called function
        // handling inside is using a try catch
        // concept of rethrowing
        try {
            if (n == 0)
                throw new ArithmeticException();
        }

        catch (ArithmeticException e) {
            throw e;
        }

    }
}