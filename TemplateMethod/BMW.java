package com.packages.design.template;

public class BMW extends CarTemplate {

    @Override
    public void buildBody() {
        Body = "Awesome";
        System.out.println("Creating awesome body.");
    }

    @Override
    public void buildSuspension() {
        Suspension = "Multi-Link";
        System.out.println("Creating multi-link suspension.");
    }

    @Override
    public void buildInterior() {
        Interior = "Comfortable";
        System.out.println("Creating comfortable interior.");
    }

    @Override
    public void buildFoundation() {
        Foundation = "Strong";
        System.out.println("Creating strong foundation.");
    }
}