package com.example.tallerReactivo.primerpunto.model.resul;

import com.example.tallerReactivo.primerpunto.model.Email;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Operation {
    public static void main(String[] args) {
        //List<Email> lista = distinct(getEmail());
        List<Email> lista = filter(getEmail());
        lista.stream().forEach(System.out::println);
    }

    public static  List<Email> distinct(List<Email> lista ){
        return lista.stream().distinct().collect(Collectors.toList());
    }

    public static  List<Email> filter(List<Email> lista ){
        return lista.stream().filter(email -> email.getEmail().toLowerCase().contains("gmail") || email.getEmail().toLowerCase().contains("hotmail") || email.getEmail().toLowerCase().contains("outlook"))
               .collect(Collectors.toList());
    }







    public static List<Email> getEmail(){
        return  List.of(
                new Email("jhedacro@hotmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("dasdas@gmail.com",true),
                new Email("jhedsdasdasacro@gmail.com",false),
                new Email("asdasd@gmail.com",true),
                new Email("asdasd@gmail.com",true),
                new Email("maria@gmail.com",false),
                new Email("sandra@gmail.com",true),
                new Email("felipe@sofka.com",true),
                new Email("daniel@gmail.com",false),
                new Email("ricardo@gmail.com",true),
                new Email("pedro@dutty.com",true),
                new Email("santioago@gmail.com",true),
                new Email("julian@gmail.com",false),
                new Email("camila@gmail.com",false),
                new Email("sancocho@unipamplona.com",false),
                new Email("teresa@gmail.com",true),
                new Email("coraxon12@gmail.com",true),
                new Email("oscar@gmail.com",true),
                new Email("sebastian@gmail.com",true),
                new Email("gato@gmail.com",true),
                new Email("tony@gmail.com",true),
                new Email("perla@outlook.com",true),
                new Email("paco@gmail.com",true),
                new Email("luis@gmail.com",true),
                new Email("juan@gmail.com",false),
                new Email("esperanza@gmail.com",false),
                new Email("juana@gmail.com",true),
                new Email("valentina@gmail.com",true),
                new Email("persona@gmail.com",true)
        );
    }
}
