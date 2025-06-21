public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading image from remote server: " + filename);
        try {
            Thread.sleep(2000); // Simulate network delay
        } catch (InterruptedException e) {
            System.out.println("Interrupted while loading image.");
        }
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}
