
public class BuilderTest {
    public static void main(String[] args) {

        Computer basicPC = new Computer.Builder("Intel i5", "8GB")
                .build();
        basicPC.showSpecs();

        Computer gamingPC = new Computer.Builder("AMD Ryzen 7", "16GB")
                .storage("1TB SSD")
                .graphicsCard("NVIDIA RTX 4060")
                .wifiCard("Intel WiFi 6")
                .build();
        gamingPC.showSpecs();

        Computer workstation = new Computer.Builder("Intel Xeon", "32GB")
                .storage("2TB HDD")
                .wifiCard("Realtek WiFi 5")
                .build();
        workstation.showSpecs();
    }
}
