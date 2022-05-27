public class CarDiagnostic {
    public static void main(String[] args) {
        Car tesla = new Car("tesla","S plaid",2022,789);
        Car mercedes = new Car("mercedes","Maybach",2021,750);

        System.out.println("\n");

        System.out.printf(tesla.marka+" "+tesla.moc_silnik+"KM "+tesla.model+" "+tesla.rok_prod+"\n");
        System.out.printf(mercedes.marka+" "+mercedes.moc_silnik+"KM "+mercedes.model+" "+mercedes.rok_prod+"\n");

        System.out.println("\n");

        System.out.printf(tesla.getCarDetails());
        System.out.printf(mercedes.getCarDetails());

        mercedes.upgrade(5);

        System.out.printf("Po wywołaniu upgrade(): " +mercedes.moc_silnik + "\n");

        Car golf = new Car("VW","golf");

        System.out.printf(golf.marka+" "+golf.moc_silnik+"KM "+golf.model+" "+golf.rok_prod+"\n");

        SuperCar someSuperCar = new SuperCar(true,'some super car','super car');

        System.out.printf(someSuperCar.getCarDetails());

        SlowCar someSlowCar = new SlowCar('slow car','very slow',2137);

        System.out.printf(someSlowCar.getCarDetails());

    }
}
