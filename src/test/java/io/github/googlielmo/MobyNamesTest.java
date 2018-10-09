package io.github.googlielmo;

import static org.junit.Assert.*;

/**
 *
 */
public class MobyNamesTest {

    @org.junit.Test
    public void getRandomName() {
        final String name = MobyNames.getRandomName(0);
        assertNotNull(name);
        assertTrue(name.length() >= 3);
        assertTrue(name.contains("_"));
    }
}