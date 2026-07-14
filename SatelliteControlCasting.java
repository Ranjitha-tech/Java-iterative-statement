class SpaceDevice {
    void initialize() {
        System.out.println("Space Device Initialized");
    }
}

class Satellite extends SpaceDevice {
    void captureOrbitData() {
        System.out.println("Capturing Orbital Data");
    }
}

public class SatelliteControlCasting {

    public static void main(String[] args) {

        SpaceDevice device = new Satellite();

        device.initialize();

        Satellite satellite = (Satellite) device;

        satellite.captureOrbitData();
    }
}