package com.qendresazeneli.shorturl.domain;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class ShortUrl {

    @Id
    @GeneratedValue(generator = RandomIdGenerator.uniqueIdGenerator)
    @GenericGenerator(name = RandomIdGenerator.uniqueIdGenerator, strategy = "com.qendresazeneli.shorturl.domain.RandomIdGenerator")
    private Long id;

    private String shortUrl;

    private String longUrl;
}
