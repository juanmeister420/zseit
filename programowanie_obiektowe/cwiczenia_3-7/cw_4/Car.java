

class Car{
    String marka;
    String model;
    int rok_produkcji = 1999;
    double moc_silnika = 120;

    public Car(String marka,String model,int rok,int moc){
        this.marka = marka;
        this.model = model;
        this.rok_produkcji = rok;
        this.moc_silnika = moc;
    }

    public Car(String marka,String model){
        this.marka = marka;
        this.model = model;
    }

    public String getCarDetails(){
        return this.marka+" "+this.moc_silnika+"KM "+this.model+" "+this.rok_produkcji+"\n";
    }

    public void upgrade(int power){
        this.moc_silnika += power;
    }
}