package game.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerDataTest {

    @Test
    void isvalidName() {
        PlayerData playerData = new PlayerData();
        assertEquals(true, playerData.isvalidName("abcd"));
        assertEquals(true, playerData.isvalidName("qwerty"));
        assertEquals(false, playerData.isvalidName("1qwerty"));
        assertEquals(false, playerData.isvalidName("$qwerty"));
    }

    @Test
    void isvalidAge() {
        PlayerData playerData = new PlayerData();
        assertEquals(true, playerData.isvalidAge("42345"));
        assertEquals(true, playerData.isvalidAge("000456"));
        assertEquals(false, playerData.isvalidAge("1qwerty"));
        assertEquals(false, playerData.isvalidAge("$qwerty"));
    }

    @Test
    void isvalidGender() {
        PlayerData playerData = new PlayerData();
        assertEquals(true, playerData.isvalidGender("abcd"));
        assertEquals(true, playerData.isvalidGender("qwerty"));
        assertEquals(false, playerData.isvalidGender("1qwerty"));
        assertEquals(false, playerData.isvalidGender("$qwerty"));
    }
}