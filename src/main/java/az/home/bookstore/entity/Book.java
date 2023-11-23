package az.home.bookstore.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String bookName;
    @Column(name = "book_author")
    private String bookAuthor;
    @Column(name = "price")
    private Double price;
    @Column(name = "division")
    private String division;
    @Column(name = "book_count")
    private int bookCount;


}
