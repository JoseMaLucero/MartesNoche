/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package BasicTest;

import com.jml.martesnochegithub.Animal;
import com.jml.martesnochegithub.Pajarito;
import com.jml.martesnochegithub.Perro;
import com.jml.martesnochegithub.Raza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jmlucero
 */
public class AnimalTest {
    
    public AnimalTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    
      @Test
      public void animalTest() {
          Animal animal = new Animal("Nombre", Raza.Collie){
          };
          assertTrue(animal.getRaza()==Raza.Collie);
      }

      
      // Juan necesito que hagas el enumerable de razas (por lo menos 3)
      
  
      
      
}
