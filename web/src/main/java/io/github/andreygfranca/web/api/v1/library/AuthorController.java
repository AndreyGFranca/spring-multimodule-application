package io.github.andreygfranca.web.api.v1.library;

import io.github.andreygfranca.domain.library.Author;
import io.github.andreygfranca.service.library.AuthorService;
import io.github.andreygfranca.service.library.dto.AuthorDTO;
import io.github.andreygfranca.service.library.mapper.AuthorMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    private AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public ResponseEntity<AuthorDTO> create(@RequestBody AuthorDTO authorDTO) {
        Author author = authorService.create(authorDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(AuthorMapper.toDTO(author));
    }
}
