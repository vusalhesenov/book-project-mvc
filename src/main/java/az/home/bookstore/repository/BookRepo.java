package az.home.bookstore.repository;

import az.home.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {

    @Override
    List<Book> findAll();

    @Override
    Optional<Book> findById(Long aLong);

    @Override
    <S extends Book> S save(S entity);
}
