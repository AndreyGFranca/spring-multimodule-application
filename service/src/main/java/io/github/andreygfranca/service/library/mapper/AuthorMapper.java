package io.github.andreygfranca.service.library.mapper;

import io.github.andreygfranca.domain.library.Author;
import io.github.andreygfranca.service.library.dto.AuthorDTO;
import org.modelmapper.ModelMapper;

public final class AuthorMapper {

    private static final ModelMapper modelMapper = new ModelMapper();

    public static AuthorDTO toDTO(Author author) {
        return modelMapper.map(author, AuthorDTO.class);
    }
}
