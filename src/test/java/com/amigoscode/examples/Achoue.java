package com.amigoscode.examples;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Achoue {

    List<String> initialList = List.of("Armel", "Loic", "Sonia", "Tata Rosine", "Tata Aurelie", "Kyky");

    @Test
    public void itShoulDisplayThreeName(){

        List<String> threeList = initialList.stream()
                        .filter(p-> p.contains("n"))
                        .filter(p->p.contains("e"))
                        .map(p-> p.toUpperCase())
                        .collect(Collectors.toList());
                        threeList.forEach(p -> showAllName(p));
        //System.out.println(threeList);
    }

    public String showAllName(String name){
        if(name.contains("I")){
            System.out.println("c\' Loic Sonia ou Rosine");
            return name.concat("SANOU");
        }else{
            System.out.println("C\'est le reste");
        }
        return null;
    }
}
