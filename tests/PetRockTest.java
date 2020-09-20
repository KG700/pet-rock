import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {
    private PetRock rocky = new PetRock("Rocky");

    @Test
    void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    void testUnhappyToStart() {
        assertFalse(rocky.isHappy());
    }

    @Test
    void testHappyAfterPlay() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Test
    void nameFail() {
        assertThrows(IllegalStateException.class, () -> {
            rocky.getHappyMessage();
        });
    }

    @Test
    void name() {
        rocky.playWithRock();
        assertEquals("I'm happy!", rocky.getHappyMessage());
    }
}