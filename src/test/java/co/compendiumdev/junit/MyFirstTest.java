package co.compendiumdev.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstTest {

    @Test
    public void checkThatJavaMavenAndJUnitAreInstalled(){
        Assertions.
            assertTrue(true,
                "this test should pass if Java, JUnit and Maven are installed");
    }

    @Test
    public void checkThatCodeCoverageReportWorks(){
        Assertions.
            assertEquals(5, MyFirstClass.add(1, 3),
                "this test should generate code coverage");
    }
}
