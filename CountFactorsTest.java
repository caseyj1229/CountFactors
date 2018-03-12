import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountFactorsTest {
    @Test
    void solution() {
        //Simple Tests to verify correctness
        assertEquals(8,CountFactors.solution(24));

        assertEquals(1,CountFactors.solution(1));

        assertEquals(3,CountFactors.solution(4));

        assertEquals(3,CountFactors.solution(9));

        assertEquals(6,CountFactors.solution(12));

        assertEquals(2,CountFactors.solution(13));

        assertEquals(2,CountFactors.solution(2147483647));
    }
}