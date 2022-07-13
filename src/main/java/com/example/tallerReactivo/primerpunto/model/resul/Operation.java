package com.example.tallerReactivo.primerpunto.model.resul;

import com.example.tallerReactivo.primerpunto.model.Email;

import java.util.List;
import java.util.stream.Collectors;

public class Operation {
    public static void main(String[] args) {
        Operations operations = new Operations();

        //Parte A
        System.out.println("A");
        List<Email> lista =  Operations.distinct(Operations.getEmail());
         lista.stream().forEach(System.out::println);

        //Parte B
        System.out.println("B");
        List<Email> lista1 = Operations.filter(Operations.getEmail());
        lista.stream().forEach(System.out::println);

        //Parte C
        System.out.println("C");
        List<Email> lista2 = Operations.validEmail(Operations.getEmail());
        lista2.stream().forEach(System.out::println);

        //Parte D
        System.out.println("D");
        Long listaCantidad = Operations.countEmails(Operations.getEmail());
        System.out.println("La cantidad de correos es: "+listaCantidad);


        //Parte E
        System.out.println("E");
        Operations.viewEmailType(Operations.getEmail());

        //Parte F
        System.out.println("F");
        List<Email> lista3 = Operations.verifyEmail(Operations.getEmail());
        lista3.stream().forEach(System.out::println);
    }

}
