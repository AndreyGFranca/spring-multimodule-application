package io.github.andreygfranca.service.library;

import io.github.andreygfranca.repository.library.AuthorRepository;
import io.github.andreygfranca.service.library.dto.AuthorDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AuthorServiceTest {

    @InjectMocks
    private AuthorService authorService;

    @Mock
    private AuthorRepository authorRepository;

    @Test
    public void givenAuthorWhenCreateThenVerify() {
        AuthorDTO dto = new AuthorDTO();
        dto.setName("Simple Author");
        dto.setBirthDate(new Date());
        dto.setBibliography("Simple bib");

        authorService.create(dto);

        verify(authorRepository).save(any());
    }
}