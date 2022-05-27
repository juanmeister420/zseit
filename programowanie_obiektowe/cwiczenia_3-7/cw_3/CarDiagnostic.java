public class CarDiagnostic {
    public static void main(String[] args) {
        Car mercedes = new Car("mercedes","maybach",2021,58);
        Car tesla = new Car("tesla","S Plaid",2011,750);

        System.out.println("\n");

        System.out.printf(mercedes.marka+" "+mercedes.moc_silnik+"KM "+mercedes.model+" "+mercedes.rok_prod+"\n");
        System.out.printf(tesla.marka+" "+tesla.moc_silnik+"KM "+tesla.model+" "+tesla.rok_prod+"\n");

        System.out.println("\n");

        System.out.printf(mercedes.getCarDetails());
        System.out.printf(tesla.getCarDetails());

        tesla.upgrade(5);

        System.out.printf("Po upgrade(): " +tesla.moc_silnik + "\n");

        Car g_wagon = new Car("mercedes","G530", 2019, 120);

        System.out.printf(g_wagon.marka+" "+g_wagon.moc_silnik+"KM "+g_wagon.model+" "+g_wagon.rok_prod+"\n");}}
