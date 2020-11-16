public class Main {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Mouse sherryMouse = new Mouse("Sherry", 10, 7);
        Dog spiceDog = new Dog("Spike",55,25);
        Dog tykeDog = new Dog("Tyke",25,15);
        Cat tomCat = new Cat("Tom", 3,25);
        Cat toodlesCat = new Cat("Toodles",2,35);
        tomCat.getInfo();
    }
}
class Mouse {
    String name;
    int height;
    int tail;

    public Mouse(String name, int height, int tail) {
        this.name = name;
        this.height = height;
        this.tail = tail;
    }
}
 class Dog {
    String name;
    int height;
    int weight;

    public Dog(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
class Cat {
    String name;
    int age;
    int tail;

    public Cat(String name, int age, int tail ) {
        this.name = name;
       this.age = age;
        this.tail = tail;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void getInfo() {
        System.out.println("Кличка "+this.getName()+" "+"возраст "+this.getAge()+" года");
    }
}
