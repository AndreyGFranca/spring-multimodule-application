package io.github.andreygfranca.repository.library;

import io.github.andreygfranca.domain.library.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
