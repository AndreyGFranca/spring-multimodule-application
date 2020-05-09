package io.github.andreygfranca.service.library.dto;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class AuthorDTO {

    private Long id;

    private String name;

    private String bibliography;

    private Date birthDate;

    private List<BookDTO> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBibliography() {
        return bibliography;
    }

    public void setBibliography(String bibliography) {
        this.bibliography = bibliography;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<BookDTO> getBooks() {
        return books;
    }

    public void setBooks(List<BookDTO> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthorDTO)) return false;
        AuthorDTO authorDTO = (AuthorDTO) o;
        return Objects.equals(getId(), authorDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
