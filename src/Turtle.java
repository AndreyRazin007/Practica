public class Turtle extends Animal { // extends - расширять
    Food food = Food.GRASS;
    Enviroment env = Enviroment.GROUND;

    public Turtle(String name, Enviroment env, Food food) {
        super (name, env, food);
    }

    @Override
    public void move() {
        System.out.println(this.name + " поползла");
    }

    @Override
    public void eat() {
        System.out.println(this.name + " поела");
    }
}
