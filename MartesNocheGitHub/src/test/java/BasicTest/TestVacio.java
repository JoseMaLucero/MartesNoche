/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package BasicTest;

import com.jml.martesnochegithub.Perro;
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
public class TestVacio {
    
    public TestVacio() {
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
      public void nuevoTestVacioTest() {
          String name = "Cachito";
          Perro perro = new Perro(name);
          String expectedOutput = "Hello i am a "+perro.getClass().getSimpleName()+" y me llamo "+name;
         assertFalse(expectedOutput,perro.toString()); // casdfssdasdsadjgukjhsdssdsdfsdffsdfdvsdasdasdasaddfjy dasdfas465454cac464

      }
}
