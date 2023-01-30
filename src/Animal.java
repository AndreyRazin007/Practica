import java.util.Date;

public class Animal {
    String name;
    Enviroment env;
    Food food;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.length() >= 3) {
            this.name = name;
        }
    }

    public Enviroment getEnv() {
        return this.env;
    }

    public void setEnv(Enviroment env) {
        this.env = env;
    }

    public Food getFood() {
        return this.food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Animal() {
        this.name = "SomeAnimal";
        this.env = Enviroment.GROUND;
        this.food = Food.MEAT;
    }

    public Animal(String name, Enviroment env, Food food) {
        this.name = name;
        this.env = env;
        this.food = food;
    }

    public void move() {}

    public void eat() {}
}
