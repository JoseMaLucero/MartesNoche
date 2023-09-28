/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package BasicTests;

import com.jml.martesnochegithub.Animal;
import com.jml.martesnochegithub.Gato;
import com.jml.martesnochegithub.Perro;
import java.util.logging.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.platform.commons.logging.LoggerFactory;

/**
 *
 * @author jmlucero
 */
public class BasicTestsJenkins {
    
    public BasicTestsJenkins() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
      @Test
      public void basicTest() {
          Perro perro = new Perro();
          assertTrue(perro instanceof Animal);
      }
      
      @Test
      public void perroTest() {eawfo.getClass().getName()+" y mi nombre es: "+name;
          assertEquals(null,perro.toString());
      }
      
      
      /* 
      // Enable this to pass the creational test 
      @Disabled
      @Test
      public void gatoTest() {
          Gato gato = new Gato();
          assertTrue(gato instanceof Animal);
      }
      
      // Enable this to pass the creational test
      @Test
      public void gatoToStringTest() {
          String name = "michi";
          Gato gato = new Gato(name);
          String expectedOutput = "Soy un objeto del tipo "+gato.getClass().getName()+" y mi nombre es: "+name;
      }
      
      */
}
