package io.github.andreygfranca.domain.library.builder;

import io.github.andreygfranca.domain.library.Author;
import io.github.andreygfranca.domain.library.Book;

import java.util.Date;
import java.util.List;

public final class AuthorBuilder {
    private Author author;

    private AuthorBuilder() {
        author = new Author();
    }

    public static AuthorBuilder anAuthor() {
        return new AuthorBuilder();
    }

    public AuthorBuilder withId(Long id) {
        author.setId(id);
        return this;
    }

    public AuthorBuilder withName(String name) {
        author.setName(name);
        return this;
    }

    public AuthorBuilder withBibliography(String bibliography) {
        author.setBibliography(bibliography);
        return this;
    }

    public AuthorBuilder withBirthDate(Date birthDate) {
        author.setBirthDate(birthDate);
        return this;
    }

    public AuthorBuilder withBook(List<Book> books) {
        author.setBooks(books);
        return this;
    }

    public Author build() {
        return author;
    }
}
