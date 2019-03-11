package rocks.zipcodewilmington.animals;

import java.util.Date;


public class Dog extends Mammal {
   
   
    public String name;
    public int id;
    public int numberOfMealsEaten=0;
    
    
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public String speak() {
        return "bark!";
    }
    
    public void setName(String name){
        this.name = name;
    }
    
     public void eat(){
        numberOfMealsEaten++;
        System.out.println(numberOfMealsEaten);
    }
    
    public Integer getId(){
        return this.id;
    }
}
