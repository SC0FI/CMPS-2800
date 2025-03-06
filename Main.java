abstract class Animal {
    private int a;
    private String name;
    Animal(int a) {
        this.a = a;
    }
    Animal(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    abstract void eat();

    void feedAnimal(Animal a){
        if(a instanceof Quaga qq) {
            qq.eat();

        } else if(a instanceof Chicken cc) {
            cc.eat();

        }
    }

}

class Chicken extends Animal {
    Chicken() {super(0);}
    Chicken(String input) {super(input);}

    @Override
    void eat() {
        System.out.println("the chicken eats");
    }
}

class Quaga extends Animal {

    Quaga(String input) {super(input);}
    @Override
    void eat() {
        System.out.println("yum");
    }
}



public class Main{
    public static void main(String[] args) {
        Animal an = new Chicken("Hello");
        System.out.println(an.getName());
        Animal am = new Quaga("hi");
        System.out.println(am.getName());
        am.eat();
        an.feedAnimal(an);
    }

}