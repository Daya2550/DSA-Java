package javadsa.MainHelper;

public class MyExceptionHandling  extends Exception {
    public MyExceptionHandling(String message) {
        super(message);
        MainHelper mainHelper = new MainHelper();
        mainHelper.ErrorMessage();
    }
    
}
