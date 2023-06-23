package com.oclock.tutojava.zoo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SuperMesangeTest {

    @Test
    void test_superMesange() {
        SuperMesange superMesange = new SuperMesange("Dori");
        assertEquals("Dori", superMesange.getName());
    }

}
