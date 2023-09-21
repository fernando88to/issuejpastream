package com.fernando;

import com.speedment.jpastreamer.application.JPAStreamer;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static com.speedment.jpastreamer.streamconfiguration.StreamConfiguration.*;


@QuarkusTest
public class AppTest {

    @Inject
    JPAStreamer jpaStreamer;


    @Test
    void test() {
        jpaStreamer.stream(of(Film.class).joining(Film$.language))
                .filter(Film$.name.containsIgnoreCase("test"))
                .filter(film -> film.language.country.equals("BR"))
                .forEach(System.out::println);

    }
}
