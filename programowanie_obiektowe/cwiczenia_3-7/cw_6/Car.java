

class Car{
    String marka;
    String model;
    int rok_prod = 2022;
    double moc_silnik = 879;

    public Car(String marka,String model,int rok,int moc){
        this.marka = marka;
        this.model = model;
        this.rok_prod = rok;
        this.moc_silnik = moc;
    }

    public Car(String marka,String model){
        this.marka = marka;
        this.model = model;
    }

    public String getCarDetails(){
        return this.marka+" "+this.moc_silnik+"KM "+this.model+" "+this.rok_prod+"\n";
    }

    public void upgrade(int power){
        this.moc_silnik += power;
    }
}