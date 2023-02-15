package com.amigoscode.examples;

import java.util.Optional;

public class Runner {

    public static void main (String[] args){
        Calculation calculation = new Calculation() {
            @Override
            public void add() {
                System.out.println("addition is called...");
            }

            @Override
            public void mult() {
                System.out.println("multiplication is called...");
            }

            @Override
            public void div() {
                System.out.println("division is called...");
            }
        };

        calculation.add();
        calculation.mult();
        calculation.div();

        FunctionalInterface functionalInterface = () ->{
            System.out.println("First lambda expression");
        };

        functionalInterface.calculate();

        String str = "Teste de optional";
        Optional<String> s = Optional.ofNullable(str);
        s.ifPresent((x) -> System.out.println(x));
        s.orElse("String is defined with null value");
    }
}
