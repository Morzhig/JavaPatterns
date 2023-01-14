package com.packages.design.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarBuildingClientTest {
    @Test
    public void TestBMWCreation() {
        CarTemplate test1 = new BMW();
        test1.createCar();
        String cmp = test1.toString();
        assertEquals("Suspension: Multi-Link, body: Awesome, interior: Comfortable, foundation: Strong", cmp);
    }
    @Test
    public void TestVazCreation() {
        CarTemplate test1 = new Vaz();
        test1.createCar();
        String cmp = test1.toString();
        assertEquals("Suspension: Spring, body: Poor, interior: Uncomfortable, foundation: Strong", cmp);
    }
    @Test
    public void TestBMWCreation_Failed() {
        CarTemplate test1 = new BMW();
        test1.createCar();
        String cmp = test1.toString();
        assertNotEquals("Suspension: Spring, body: Poor, interior: Comfortable, foundation: Strong", cmp);
    }
    @Test
    public void TestVazCreation_Failed() {
        CarTemplate test1 = new Vaz();
        test1.createCar();
        String cmp = test1.toString();
        assertNotEquals("Suspension: Multi-Link, body: Awesome, interior: Uncomfortable, foundation: Strong", cmp);
    }
}