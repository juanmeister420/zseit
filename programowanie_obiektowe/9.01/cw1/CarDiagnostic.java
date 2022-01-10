public class CarDiagnostic {
    public static void main(String[] args) {
        Car car = new Car("Ford", "Focus", 2010, 200);
        car.wyswietl();
        System.out.println("\n");
        Car car2 = new Car("Audi", "A4", 2010, 200);
        car2.wyswietl();
    }
}