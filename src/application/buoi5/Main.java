package application.buoi5;

import application.model.*;

public class Main {

    public static void main(String[] args) {
//        Human human = new Human();
//        human.say();
//        human = new VietNamese();
//        human.say();
//        human = new English(); //up casting
        // down casting
//        VietNamese vn = (VietNamese) new Human();
//        vn.say();
//        human.say();

//        Bike bike = new Honda();
//        bike.run();
//        bike.doSmt();

        IHuman iHuman = new VietNamese();
        iHuman.say();
        iHuman = new English();
        iHuman.say();
        
    }
}
