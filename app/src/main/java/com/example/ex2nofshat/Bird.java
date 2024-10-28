package com.example.ex2nofshat;

public class Bird extends Animal implements FlyAble{

    @Override
    public void makeSound() {
        System.out.println("the bird tweets");
    }
    @Override
    public void eat(){
        System.out.println("the bird eat kernels");
    }

    @Override
    public void fly() {
        System.out.println("the bird can fly");
    }
}