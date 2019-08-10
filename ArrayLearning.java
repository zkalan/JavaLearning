public class ArrayLearning{

    private static int sum = 0;

    public static void main(String[] args){
        Animal[] anim = new Animal[5];
        anim[0] = new Dog();
        anim[1] = new Cat();
        if (anim[0] instanceof Dog){
            ((Dog)anim[0]).eat();
        }
        if (anim[1] instanceof Cat){
            ((Cat)anim[1]).move();
        }
    }
}

class Animal{

}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog eat");
    }
}

class Cat extends Animal{
    public void move(){
        System.out.println("Cat move");
    }
}