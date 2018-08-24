package com.kg.librarySpringBoot.repository;
import java.io.Serializable;
import com.kg.librarySpringBoot.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Serializable>
 {


}