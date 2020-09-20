import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    @Test
    void getName() {
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    void testHappy() {
        PetRock rocky = new PetRock("Rocky");
        assertFalse(rocky.isHappy());
    }
}