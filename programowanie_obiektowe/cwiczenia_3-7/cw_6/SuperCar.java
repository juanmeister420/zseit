class SuperCar extends Car  {
    boolean boost;

    SuperCar(boolean boost,String marka,String model) {
        super(marka,model);
        this.boost = boost;
    }

    @Override
    public String getCarDetails(){
        return super.getCarDetails() + 'with boost' + this.boost
    }
}