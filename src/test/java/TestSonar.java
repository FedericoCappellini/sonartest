package test.java;

import main.java.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestSonar {
    @Test
    public void testsonar(){
        int output = Main.dummy();

        Assertions.assertEquals(1, output,0);
    }
}
