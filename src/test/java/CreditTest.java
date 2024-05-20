import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CreditTest {

//    @DisplayName("isValid - Valid Credit Card Number")
//    @Test
//    void testIsValid_ValidCreditCardNumber() {
//        assertTrue(Credit.isValid(4532015112830366L));
//    }

//    @DisplayName("isValid - Invalid Credit Card Number")
//    @Test
//    void testIsValid_InvalidCreditCardNumber() {
//        assertFalse(Credit.isValid(4532015112830365L));
//    }

    @DisplayName("findDigits")
    @Test
    void testFindDigits() {
        assertEquals(4, Credit.findDigits(4532L));
    }
    @DisplayName("findDigits - Single Digit Number")
    @Test
    void testFindDigits_SingleDigitNumber() {
        assertEquals(1, Credit.findDigits(7L));
    }

    @DisplayName("findDigits - Zero")
    @Test
    void testFindDigits_Zero() {
        assertEquals(1, Credit.findDigits(0L));
    }

    @DisplayName("findDigits - Negative Number")
    @Test
    void testFindDigits_NegativeNumber() {
        assertEquals(4, Credit.findDigits(-1234L));
    }

    @DisplayName("findDigits - Large Number")
    @Test
    void testFindDigits_LargeNumber() {
        assertEquals(10, Credit.findDigits(1234567890L));
    }

    @DisplayName("findDigits - Maximum Long Value")
    @Test
    void testFindDigits_MaxLongValue() {
        assertEquals(19, Credit.findDigits(Long.MAX_VALUE));
    }

    @DisplayName("getDigits - Valid Index")
    @Test
    void testGetDigits_ValidIndex() {
        assertEquals(4, Credit.getDigits(4532015112830366L, 16));
        assertEquals(3, Credit.getDigits(4532015112830366L, 3));
        assertEquals(5, Credit.getDigits(4532015112830366L, 15));
    }

    @DisplayName("getDigits - Invalid Index")
    @Test
    void testGetDigits_InvalidIndex() {

            assertEquals(-1,Credit.getDigits(453201511230366L, 16));

    }
}
