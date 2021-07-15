package CatAndPlate;

public class Plate {

    public int food;

    public Plate(int food) {
        this.food = food;
    }


    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    // создал неактивный метод в рамках задания

    public void addFood(int increaseFood) {
        this.food += increaseFood;
    }

    public void info() {
        System.out.printf("В тарелке осталось %d грамм еды.\n", food);
    }
}