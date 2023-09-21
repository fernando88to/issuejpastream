package com.fernando;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @Column(name = "language_id")
    public Integer languageId;

    @Column(name = "country")
    public String country;
}