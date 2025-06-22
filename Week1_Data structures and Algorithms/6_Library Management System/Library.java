import java.util.Arrays;

public class Library {
    Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book linearSearchByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public Book binarySearchByTitle(String title) {
        Book[] sorted = Arrays.copyOf(books, books.length);
        Arrays.sort(sorted, (a, b) -> a.title.compareToIgnoreCase(b.title));

        int left = 0, right = sorted.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = sorted[mid].title.compareToIgnoreCase(title);
            if (cmp == 0) return sorted[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b);
        }
    }
}
