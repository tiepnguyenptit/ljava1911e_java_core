package application.buoi7;

import java.io.FileReader;

public class Main {

    public void test(){
        try {
            System.out.println(7/0);
        }
        catch (ArithmeticException ae){
            throw new CustomException("This is a error message: " + ae.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        try {
            main.test();
        } catch (CustomException c){
            System.out.println(c.getMessage());
            return;
        } finally {
            System.out.println("this is finally");
        }
//        FileReader fileReader = new FileReader("aa");
    }
}
