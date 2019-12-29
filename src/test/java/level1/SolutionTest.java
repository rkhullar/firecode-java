package level1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static level1.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @ParameterizedTest(name = "hello test")
    @CsvSource({"0, 0", "1, 1", "2, 1", "3, 2", "4, 3", "5, 5", "6, 8", "7, 13", "8, 21"})
    void testRecursiveFibonacci(int x, long e) {
        long y = recursiveFibonacci(x);
        assertEquals(e, y);
    }
}
