package viki.secret;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecretCodeTest {

    // TODO verify this with the product
    @Test
    void getInfo_shouldReturnA0B3() {
        var sc = new SecretCode();
        var secret = "1222";
        var guess = "0111";

        var result = sc.getInfo(secret, guess);

        assertEquals("A0B3", result);
    }

    @Test
    void getInfo_shouldReturnZeros_whenThereIsNoMatch() {
        var sc = new SecretCode();
        var secret = "1234";
        var guess = "5678";

        var result = sc.getInfo(secret, guess);

        assertEquals("A0B0", result);
    }

    @Test
    void getInfo_shouldReturnA1_whenThereIsOneMatch() {
        var sc = new SecretCode();
        var secret = "1234";
        var guess = "5278";

        var result = sc.getInfo(secret, guess);

        assertEquals("A1B0", result);
    }

    @Test
    void getInfo_shouldReturnA4_whenAllIsMatching() {
        var sc = new SecretCode();
        var secret = "1234";
        var guess = "1234";

        var result = sc.getInfo(secret, guess);

        assertEquals("A4B0", result);
    }

    @Test
    void getInfo_shouldReturnB1_whenOneMatchingButThePositionIsWrong() {
        var sc = new SecretCode();
        var secret = "1234";
        var guess = "0100";

        var result = sc.getInfo(secret, guess);

        assertEquals("A0B1", result);
    }

    @Test
    void getInfo_shouldReturnB4_whenAllMatchingButThePositionIsWrong() {
        var sc = new SecretCode();
        var secret = "1234";
        var guess = "4321";

        var result = sc.getInfo(secret, guess);

        assertEquals("A0B4", result);
    }
}