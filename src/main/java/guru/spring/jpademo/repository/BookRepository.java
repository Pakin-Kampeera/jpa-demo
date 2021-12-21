package guru.spring.jpademo.repository;

import guru.spring.jpademo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
