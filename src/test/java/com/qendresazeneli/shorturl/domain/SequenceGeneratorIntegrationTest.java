package com.qendresazeneli.shorturl.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SequenceGeneratorIntegrationTest {

    @Autowired
    private SequenceGenerator sequenceGenerator;

    @Test
    public void testGenerateId() {
        Long id = sequenceGenerator.nextId();
        System.out.println(id);
    }
}
