public class ProxyTest {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("mountains.jpg");

        img1.display();
        System.out.println();

        img1.display();
    }
}
