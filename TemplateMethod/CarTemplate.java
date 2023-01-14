package com.packages.design.template;

public abstract class CarTemplate {
    public String Suspension;
    public String Foundation;
    public String Body;
    public String Interior;

    public final void createCar() {
        buildFoundation();
        buildSuspension();
        buildBody();
        buildInterior();
        System.out.println("Car is created.");
    }

    public abstract void buildBody();
    public abstract void buildSuspension();
    public abstract void buildInterior();
    public abstract void buildFoundation();

    public String getBody() {
        return Body;
    }
    public String getSuspension() {
        return Suspension;
    }
    public String getInterior() {
        return Interior;
    }
    public String getFoundation() {
        return Foundation;
    }
    public String toString() {
        return "Suspension: " + getSuspension() + ", body: " + getBody() + ", interior: " + getInterior() + ", foundation: " + getFoundation();
    }
}