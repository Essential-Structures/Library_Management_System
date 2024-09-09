package com.ITSchool.Library_Management.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Title")
    private String title;
    @Column(name = "Author")
    private String author;
    @Column(name = "ISBN")
    private String isbn;
    @Column(name = "Genre")
    private String genre;
    @Column(name = "Copies available")
    private int copiesAvailable;
}
