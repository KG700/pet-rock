import org.junit.jupiter.api.Disabled;
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

    @Disabled("Exception throwing not yet defined")
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

    @Test
    void testFavNum() {
        assertEquals(42, rocky.getFavNumber());
    }

    @Test
    void emptyNameFail() {
        assertThrows(IllegalStateException.class, () -> {
            new PetRock("");
        });
    };
}