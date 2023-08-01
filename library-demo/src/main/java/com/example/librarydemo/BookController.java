package com.example.librarydemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("library")
public class BookController {

    private final LibraryService library;

    public BookController(LibraryService library) {
        this.library = library;
    }

    @GetMapping("/booklist")
    public List<Book> fetchBooks() {
        return library.getBookList();
    }

    @GetMapping("/booklist/{id}")
    public Optional<Book> fetchBookById(@PathVariable Long id) {
        return library.getBookById(id);
    }
}
