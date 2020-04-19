package application.buoi3;

import application.buoi4.A;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String[] tmp = name.toLowerCase().trim().split("\\s++");
        String result = "";
        for(int i=0; i<tmp.length; i++){
            result = result.concat(tmp[i].substring(0,1).toUpperCase())
                    .concat(tmp[i].substring(1));
            if(i!=tmp.length-1){
                result = result.concat(" ");
            }
        }
        System.out.println(result);

    }
}
