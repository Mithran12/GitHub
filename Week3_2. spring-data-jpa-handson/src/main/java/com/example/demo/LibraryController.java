package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LibraryController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

        @PostMapping("/authors")
    public Author saveAuthor(@RequestBody Author author) {
        return authorRepository.save(author);
    }

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/authors/search")
    public List<Author> searchAuthors(@RequestParam String q) {
        return authorRepository.findByNameContaining(q);
    }

    @PostMapping("/books")
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/books/search")
    public List<Book> searchBooks(@RequestParam String q) {
        return bookRepository.findByTitleContaining(q);
    }
}
