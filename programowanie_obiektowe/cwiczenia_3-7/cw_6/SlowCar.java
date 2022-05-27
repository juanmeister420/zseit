class SlowCar extends Car {
    int  maxSpeed;

    SlowCar(String marka,String model,int maxSpeed){
        super(marka,model,speed);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String getCarDetails(){
       return super.getCarDetails() + 'v-Max: '+this.maxSpeed;
    }
}