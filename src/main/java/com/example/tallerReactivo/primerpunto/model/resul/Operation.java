package com.example.tallerReactivo.primerpunto.model.resul;

import com.example.tallerReactivo.primerpunto.model.Email;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Operation {
    public static void main(String[] args) {
        List<Email> lista = distinct(getEmail());
        lista.stream().forEach(System.out::println);
    }

    public static  List<Email> distinct(List<Email> lista ){
        return lista.stream().distinct().collect(Collectors.toList());
    }

   



    public static List<Email> getEmail(){
        return  List.of(
                new Email("jhedacro@hotmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("dasdas@gmail.com",true),
                new Email("jhedsdasdasacro@gmail.com",false),
                new Email("asdasd@gmail.com",true),
                new Email("asdasd@gmail.com",true),
                new Email("jhedacro@gmail.com",false),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",false),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",false),
                new Email("jhedacro@gmail.com",false),
                new Email("jhedacro@gmail.com",false),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",false),
                new Email("jhedacro@gmail.com",false),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true),
                new Email("jhedacro@gmail.com",true)
        );
    }
}
