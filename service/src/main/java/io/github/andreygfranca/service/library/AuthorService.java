package io.github.andreygfranca.service.library;

import io.github.andreygfranca.domain.library.Author;
import io.github.andreygfranca.domain.library.builder.AuthorBuilder;
import io.github.andreygfranca.repository.library.AuthorRepository;
import io.github.andreygfranca.service.library.dto.AuthorDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorService {

    private AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Transactional(propagation = Propagation.SUPPORTS)
    public Author create(AuthorDTO authorDTO) {
        Author author = AuthorBuilder.anAuthor()
                .withBibliography(authorDTO.getBibliography())
                .withBirthDate(authorDTO.getBirthDate())
                .withName(authorDTO.getName())
                .build();

        return authorRepository.save(author);
    }
}
