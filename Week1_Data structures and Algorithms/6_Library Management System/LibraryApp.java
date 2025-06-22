public class LibraryApp {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "The Alchemist", "Paulo Coelho"),
            new Book(2, "1984", "George Orwell"),
            new Book(3, "To Kill a Mockingbird", "Harper Lee"),
            new Book(4, "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book(5, "Moby Dick", "Herman Melville")
        };

        Library library = new Library(books);

        System.out.println("📚 Library Collection:");
        library.displayBooks();

        System.out.println("\n🔍 Linear Search for '1984':");
        Book foundLinear = library.linearSearchByTitle("1984");
        System.out.println(foundLinear != null ? "Found: " + foundLinear : "Book not found");

        System.out.println("\n⚡ Binary Search for 'The Great Gatsby':");
        Book foundBinary = library.binarySearchByTitle("The Great Gatsby");
        System.out.println(foundBinary != null ? "Found: " + foundBinary : "Book not found");
    }
}
