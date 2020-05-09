package io.github.andreygfranca.domain.library.builder;

import io.github.andreygfranca.domain.library.Author;
import io.github.andreygfranca.domain.library.Book;

import java.util.Date;

public final class BookBuilder {
    private Book book;

    private BookBuilder() {
        book = new Book();
    }

    public static BookBuilder aBook() {
        return new BookBuilder();
    }

    public BookBuilder withId(Long id) {
        book.setId(id);
        return this;
    }

    public BookBuilder withName(String name) {
        book.setName(name);
        return this;
    }

    public BookBuilder withSubject(String subject) {
        book.setSubject(subject);
        return this;
    }

    public BookBuilder withOverview(String overview) {
        book.setOverview(overview);
        return this;
    }

    public BookBuilder withPublisher(String publisher) {
        book.setPublisher(publisher);
        return this;
    }

    public BookBuilder withPublicationDate(Date publicationDate) {
        book.setPublicationDate(publicationDate);
        return this;
    }

    public BookBuilder withLanguage(String language) {
        book.setLanguage(language);
        return this;
    }

    public BookBuilder withAuthor(Author author) {
        book.setAuthor(author);
        return this;
    }

    public Book build() {
        return book;
    }
}
