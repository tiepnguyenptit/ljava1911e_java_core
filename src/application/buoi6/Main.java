package application.buoi6;

import application.model.English;
import application.model.IHuman;
import application.model.VietNamese;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.code(new VietNamese());
        main.code(new English());
    }

    public void code(IHuman iHuman){
        iHuman.say();
    }


}
