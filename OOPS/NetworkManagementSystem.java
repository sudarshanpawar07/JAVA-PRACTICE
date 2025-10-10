
class NetworkDevice {
    String manufacturer;
    String model;
    String ipAddress;
    String macAddress;

    public NetworkDevice(String manufacturer, String model, String ipAddress, String macAddress) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.ipAddress = ipAddress;
        this.macAddress = macAddress;
    }


    public void displayStatus() {
        System.out.println("--- Device Status ---");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Model: " + model);
        System.out.println("IP Address: " + ipAddress);
        System.out.println("MAC Address: " + macAddress);
    }
    
    // Another common method
    public void ping() {
        System.out.println("Pinging " + ipAddress + "... Responding!");
    }
}

class Router extends NetworkDevice {
    int numberOfPorts;
    String firmwareVersion;

    public Router(String manufacturer, String model, String ipAddress, String macAddress, int numberOfPorts, String firmwareVersion) {
        // Calling the parent class constructor using super()
        super(manufacturer, model, ipAddress, macAddress);
        this.numberOfPorts = numberOfPorts;
        this.firmwareVersion = firmwareVersion;
    }

    
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the parent's method first
        System.out.println("Number of Ports: " + numberOfPorts);
        System.out.println("Firmware Version: " + firmwareVersion);
    }

    public void forwardPacket(String destinationIp) {
        System.out.println("Router is forwarding a packet to " + destinationIp);
    }
}

class Switch extends NetworkDevice {
    int portCapacity;
    String vlanId;

    public Switch(String manufacturer, String model, String ipAddress, String macAddress, int portCapacity, String vlanId) {
        super(manufacturer, model, ipAddress, macAddress);
        this.portCapacity = portCapacity;
        this.vlanId = vlanId;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Port Capacity: " + portCapacity);
        System.out.println("VLAN ID: " + vlanId);
    }

  
    public void learnMacAddress(String mac) {
        System.out.println("Switch is learning the MAC address: " + mac);
    }
}

class Server extends NetworkDevice {
    String operatingSystem;
    int processorCount;

    public Server(String manufacturer, String model, String ipAddress, String macAddress, String operatingSystem, int processorCount) {
        super(manufacturer, model, ipAddress, macAddress);
        this.operatingSystem = operatingSystem;
        this.processorCount = processorCount;
    }


    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Processor Count: " + processorCount);
    }


    public void runService(String serviceName) {
        System.out.println("Server is running the service: " + serviceName);
    }
}


 class NetworkManagementSystem {
    public static void main(String[] args) {
        // Create an instance of a Router
        Router ciscoRouter = new Router("Cisco", "ISR 4331", "192.168.1.1", "00:1A:2B:3C:4D:5E", 8, "IOS-XE 16.6");

        // Create an instance of a Switch
        Switch dellSwitch = new Switch("Dell", "PowerConnect 5548P", "192.168.1.2", "01:AB:CD:EF:01:23", 48, "VLAN10");

        // Create an instance of a Server
        Server hpServer = new Server("HP", "ProLiant DL380 Gen10", "192.168.1.10", "02:A0:C5:F0:3B:4C", "Ubuntu Server 22.04", 2);

        System.out.println("--- Router Details ---");
        ciscoRouter.displayStatus();
        ciscoRouter.forwardPacket("10.0.0.5");
        ciscoRouter.ping();
        System.out.println();

        System.out.println("--- Switch Details ---");
        dellSwitch.displayStatus();
        dellSwitch.learnMacAddress("AA:BB:CC:DD:EE:FF");
        System.out.println();

        System.out.println("--- Server Details ---");
        hpServer.displayStatus();
        hpServer.runService("Web Server");
    }
}