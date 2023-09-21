package com.fernando;

import jakarta.persistence.*;

@Entity
@Table(name = "film")
public class Film {

    @Id
    @Column(name = "film_id")
    public Integer filmId;

    @Column(name = "film_name")
    public String name;

    @ManyToOne
    @JoinColumn(name="language_id", nullable = false)
    public Language language;

}