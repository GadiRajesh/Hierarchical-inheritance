public class Driver {
    public static void main(String[] args) {
        Device d=new Device("hp", 50000.00);
        d.printDevicedet();
        System.out.println("----------------");
        Laptop l=new Laptop("dell", 70000.00, 512);
        l.printLaptopdet();
        System.out.println("--------------------");
        Mobile m=new Mobile("asus", 90000.00, 1024);
        m.printMobiledet();
    }
}
