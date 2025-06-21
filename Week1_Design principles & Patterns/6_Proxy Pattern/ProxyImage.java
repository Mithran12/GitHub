public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);  // Load only once
        } else {
            System.out.println("(Cache Hit) No need to load again.");
        }
        realImage.display();
    }
}
