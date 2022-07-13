package com.example.tallerReactivo.segundopunto;


import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Operation {
    public static void main(String[] args) {
       chat(listProfanity());
    }

    public static void chat(List<String> lista){
        Scanner L = new Scanner(System.in);
        System.out.println("Escriba una frase:  ");
        String palabraIngresada = L.nextLine();
        List<String> listaDePalabrasIngresadas = Arrays.stream(palabraIngresada.split(" ")).toList();
        Flux.fromIterable(listaDePalabrasIngresadas)
                .map(palabra -> {
                    if (lista.toString().contains(palabra.toLowerCase())) {
                        palabra = "****";
                    }
                    return palabra;
                }).subscribe(System.out::println);
    }
    public static List<String> listProfanity(){
        return  List.of("hp","malparido","loco","bobo","tarado","malo","ñero");
    }
}
