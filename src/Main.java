import CatAndPlate.Cat;
import CatAndPlate.Plate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cat[] cats = {
                new Cat("Барсик", 13),
                new Cat("Мурзик", 50),
                new Cat("Кузя", 19),
                new Cat("Сатана", 666)}; // кот который всегда голоден

        System.out.println("Сколько грамм еды положить в тарелку?");
        int placeFood = sc.nextInt();
        Plate plate = new Plate(placeFood);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
            plate.info();
        }
    }
}


