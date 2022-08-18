package test;

import model.FizzBuzz;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FizzBuzzTest {
    @Test
    @DisplayName("case Chia hết cho 3")
    void testDivisibleBy3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case Chia hết cho 5")
    void testDivisibleBy5() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case Chia hết cho 3 và 5")
    void testDivisibleBy3And5() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("case Không chia hết số nào")
    void testDivisibleBy1() {
        int number = 1;
        String expected = "1";
        String result = FizzBuzz.checkFizzBuzz(number);
        assertEquals(expected, result);
    }
}
