class Polymorphism{

    public void AnimalSound(){

       System.out.println("Animal is making a sound");   
    }

    public void sound() {
    }
 }

 class Horse extends Polymorphism{
    
    public void sound(){

        System.out.println("Neigh");
    }
 }

 class Cat extends Polymorphism{
  
    public void sound(){
        System.out.println("Meow");
    }
 }

 class Dog extends Polymorphism{
  
    public void sound(){
        System.out.println("Meow");
    }
 }

 class Sound extends Polymorphism{
    public static void main(String args[]){
        Polymorphism horse = new Horse();
    	Polymorphism cat = new Cat();
        Polymorphism dog = new Dog();
    	Polymorphism horse2 = horse;
        horse2.sound();
        Polymorphism cat2 = cat;
        cat2.sound();
        Polymorphism dog2 = dog;
        dog2.sound();
 }
}