package com.qendresazeneli.shorturl.domain;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

public class RandomIdGenerator implements IdentifierGenerator {

    public static final String uniqueIdGenerator = "randomIdGenerator";

    @Autowired
    private final SequenceGenerator sequenceGenerator;

    public RandomIdGenerator(SequenceGenerator sequenceGenerator) {
        this.sequenceGenerator = sequenceGenerator;
    }

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        return sequenceGenerator.nextId();
    }
}
