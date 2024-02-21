package org.example.Baptizm;

import org.example.Baptizm.Baptizm;
import org.example.Baptizm.ClergyMember;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaptizmTest {

    @Test
    public void testPriestCanBaptize() {
        ClergyMember priest = new ClergyMember();
        priest.setPriest(true);
        Baptizm baptizm = new Baptizm(priest);
        assertTrue(baptizm.CanBeBaptizedBy(priest));
    }

    @Test
    public void testPopeCanBaptize() {
        ClergyMember pope = new ClergyMember();
        pope.setPop(true);
        Baptizm baptizm = new Baptizm(pope);
        assertTrue(baptizm.CanBeBaptizedBy(pope));
    }

    @Test
    public void testOtherClergyMemberCannotBaptize() {
        ClergyMember clergyMember = new ClergyMember();
        Baptizm baptizm = new Baptizm(clergyMember);
        assertFalse(baptizm.CanBeBaptizedBy(clergyMember));
    }

    @Test
    public void testNullClergyMember() {
        try {
            Baptizm baptizm = new Baptizm(null);
            baptizm.CanBeBaptizedBy(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    @Test
    public void testUninitializedClergyMemberCannotBaptize() {
        ClergyMember clergyMember = new ClergyMember();
        Baptizm baptizm = new Baptizm(clergyMember);
        assertFalse(baptizm.CanBeBaptizedBy(clergyMember));
    }
}