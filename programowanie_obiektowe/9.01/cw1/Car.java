public class Car{
    private String marka;
    private String model;
    private int rok_produkcji;
    private int moc_silnika;

    public Car(String marka, String model, int rok_produkcji, int moc_silnika){
        this.marka = marka;
        this.model = model;
        this.rok_produkcji = rok_produkcji;
        this.moc_silnika = moc_silnika;
    }

    public void wyswietl(){
        System.out.println("Dane pojazdu: \n" + this.marka + "\n" + this.model + "\n" + this.rok_produkcji + "\n" + this.moc_silnika + "KM");
    }

    
}



