import java.util.Date;

public class Honeybadger extends Animal {
    String name = "Сережа";
    Date date = new Date(2023, 01, 30);
    Env env = Env.GROUND;
    Food food = Food.MEAT;

    public Honeybadger(String name, Date date, Env env, Food food) {
        name = this.name;
        date = this.date;
        env = this.env;
        food = this.food;
    }

    @Override
    public void move() {
        System.out.println(this.name + " ползет");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " ест мясо");
    }

    public void Hunting() {
        System.out.print("Я на охоте!");
    }
}
