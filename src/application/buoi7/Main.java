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
        } finally {
            System.out.println("this is finally");
        }
//        FileReader fileReader = new FileReader("aa");
//
//        Main main = new Main();
//        System.out.println(main.test1());
    }

    public String test1(){
        try {
            System.out.println(4/0);
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
            return "error";
        }
        catch(Exception e){
            System.out.println("Lỗi trong lúc thực thi");
        }
        finally {
            System.out.println("test");
        }
        return "";
    }
}
