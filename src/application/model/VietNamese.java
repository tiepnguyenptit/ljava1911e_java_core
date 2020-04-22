package application.model;

public class VietNamese implements IHuman{

    public void sayVN(){
        System.out.println("say VN");
    }

    @Override
    public void say() {
        System.out.println("Xin chào");
    }
}
