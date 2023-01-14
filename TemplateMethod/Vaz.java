package com.packages.design.template;

public class Vaz extends CarTemplate {
    @Override
    public void buildBody() {
        Body = "Poor";
        System.out.println("Creating poor exterior.");
    }

    @Override
    public void buildFoundation() {
        Foundation = "Strong";
        System.out.println("Building strong foundation.");
    }

    @Override
    public void buildSuspension() {
        Suspension = "Spring";
        System.out.println("Creating spring suspension.");
    }

    @Override
    public void buildInterior() {
        Interior = "Uncomfortable";
        System.out.println("Creating uncomfortable interior.");
    }
}
