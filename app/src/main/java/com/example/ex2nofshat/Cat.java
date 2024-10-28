package com.example.ex2nofshat;

public class Cat extends Animal implements Runnable{

    @Override
    public void makeSound() {
        System.out.println("the cat howls");
    }
    @Override
    public void eat(){
        System.out.println("the cat drink milk");
    }

    @Override
    public void Run() {
        System.out.println("the cat can run");
    }
}
