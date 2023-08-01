package com.example.librarydemo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class LibraryService {

    private List<Book> bookList;

    LibraryService() {
        bookList = getBookList();
    }

    public List<Book> getBookList() {
        return Arrays.asList(
                new Book(1L, "To Kill a Mockingbird", "Harper Lee"),
                new Book(2L, "Pride and Prejudice", "Jane Austen"),
                new Book(3L, "Harry Potter", "J K Rowling"),
                new Book(4L, "Brave New World", "Aldous Huxley"),
                new Book(5L, "Wuthering Heights", "Emily Bronte"),
                new Book(6L, "Lord of the Flies", "William Golding")
        );
    }

    public Optional<Book> getBookById(Long id) {
        return getBookList()
                .stream()
                .filter(book -> book.getId() == id)
                .findFirst();
    }

}
