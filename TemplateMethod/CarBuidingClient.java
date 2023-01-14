package com.packages.design.template;

public class CarBuidingClient {

    public static void main(String[] args) {

        CarTemplate houseType = new BMW();
        houseType.createCar();

        System.out.println("************");

        houseType = new Vaz();
        houseType.createCar();
    }
}
