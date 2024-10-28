package com.example.ex2nofshat;

public class Dog extends Animal implements Runnable{

    @Override
    public void makeSound() {
        System.out.println("the dog barked");
    }
    @Override
    public void eat(){
        System.out.println("the dog eat bonzo");
    }

    @Override
    public void Run() {
        System.out.println("the dog can run");
    }
}