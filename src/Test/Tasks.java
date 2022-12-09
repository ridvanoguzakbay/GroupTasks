package Test;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, which item would you like?");
        String item = input.nextLine().toLowerCase();
        input.close();

        int amount = 100;
        int price = 0;

        String str = "Thank you for your purchase!\nYour current balance is: " + "";

        switch(item){
            case "blanket":
                price += 60;
                break;
            case "charger":
            case "socks":
                price += 5;
                break;
            case "hat":
                price += 25;
                break;
            case "headphones":
                price += 30;
                break;
            case "laptop":
                price += 200;
                break;
            case "pants":
                price += 50;
                break;
            case "pillow":
                price += 40;
                break;
            case "smartphone":
                price += 1000;
                break;
            case "usb cable":
                price += 10;
                break;

            default:
                System.err.println("Sorry, that is an invalid item!");
        }

        if (price > 0 && price <= 100){
            String result = str + (amount - price) + "$";
            System.out.println(result);
        }else if(price > 100){
            System.err.println("Sorry, not enough funds on your gift card!");
        }






    }
}
