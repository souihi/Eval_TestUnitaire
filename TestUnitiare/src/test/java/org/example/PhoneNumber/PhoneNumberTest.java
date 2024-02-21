package org.example.PhoneNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberTest {

    @Test
    void testParseValidPhoneNumber() {
        String number = "0123456789";
        PhoneNumber phoneNumber = PhoneNumber.parse(number);
        assertEquals("(012)345-6789", phoneNumber.toString());
    }


    @Test
    void testParseEmptyPhoneNumber() {
        try {
            PhoneNumber phoneNumber = PhoneNumber.parse("");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }
    @Test
    void testParseNullPhoneNumber() {
        try {
            PhoneNumber phoneNumber = PhoneNumber.parse(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
    @Test
    void testParseInvalidPhoneNumberLength() {
        try {
            PhoneNumber phoneNumber = PhoneNumber.parse("123456789");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    void testToString() {
        String number = "0123456789";
        PhoneNumber phoneNumber = PhoneNumber.parse(number);
        assertEquals("(012)345-6789", phoneNumber.toString());
    }
}