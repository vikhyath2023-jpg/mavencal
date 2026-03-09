package com.example;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
public class AppTest {
    @Test
    public void testGradeA() {
        App app = new App();
        assertEquals("A", app.getGrade(85));
    }
}

