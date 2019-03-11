package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import java.util.Date;

public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    
    @Test
    public void speakTest(){
        Dog dog = new Dog("milo", new Date(), 10);
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals("should be bark", expected, actual);
    }
     @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog("milo", new Date(), 10);
        String givenName = "milo";
        String expected = "bolt";
         dog.setName("bolt");
        String actual = dog.name;
        

        // When (a dog's name is set to the given name)
        

        // Then (we expect to get the given name from the dog)
       Assert.assertEquals("milo.name should be equal to bolt", expected, actual);
    }
    
     @Test 
    public void eat(){
        Dog milo = new Dog("milo", new Date(), 10);
        int expected = 1;
        milo.eat();
        int actual = milo.numberOfMealsEaten;
        Assert.assertEquals("milo.eat should be 1", expected, actual);
    } 
    
    @Test
    public void checkInstanceOfDog(){
         Dog milo = new Dog("milo", new Date(), 10);
         boolean expected = true;
         boolean actual = milo instanceof Dog;
         Assert.assertEquals("check if instance of dog", expected, actual);
    }
}
    
    
   
