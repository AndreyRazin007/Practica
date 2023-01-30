public class Honeybadger extends Animal {
    String name = "Сережа";
    Enviroment env = Enviroment.GROUND;
    Food food = Food.MEAT;

    public Honeybadger(String name, Enviroment env, Food food) {
        name = this.name;
        env = this.env;
        food = this.food;
    }

    @Override
    public void move() {
        System.out.print(this.name + " ползет");
    }

    @Override
    public void eat() {
        System.out.print(this.name + " ест мясо");
    }

    public void Hunting() {
        System.out.print("Я на охоте!");
    }
}
