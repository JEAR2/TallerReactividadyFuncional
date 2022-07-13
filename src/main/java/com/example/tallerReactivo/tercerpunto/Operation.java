package com.example.tallerReactivo.tercerpunto;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Operation {
    public static void main(String[] args) {
        System.out.println(calculateDerivada(2.0,3.0));
        System.out.println(calculateIntegral(10.0,4.0));
    }

    //Función Derivada
    public static String calculateDerivada(double coeficiente, double exponente){
       return "Derivada: "+coeficiente+"X^"+exponente+" -> resultado:"+calclulateCoeficiente().apply(coeficiente,exponente)+"X^"+calclulateExponente().apply(exponente,1.0);
    }


    private static BiFunction calclulateCoeficiente(){
        BiFunction<Double, Double, Double> result = (coeficiente,exponente) -> coeficiente*exponente;
        return result;
    }
    private static BiFunction calclulateExponente(){
        BiFunction<Double, Double, Double> result = (coeficiente,unidad) -> coeficiente-unidad;
        return result;
    }

    //Función Integral
    public static String calculateIntegral(double coeficiente, double exponente){
        return "Integral: ∫"+coeficiente+"x^"+exponente+"dx -> resultado:"+calclulateCoeficienteIntegral().apply(coeficiente,exponente)+"X^"+calclulateExponenteIntegral().apply(exponente,1.0)+" + C";
    }
    private static BiFunction calclulateCoeficienteIntegral(){
        BiFunction<Double, Double, Double> result = (coeficiente,exponente) -> coeficiente/(exponente+1.0);
        return result;
    }
    private static BiFunction calclulateExponenteIntegral(){
        BiFunction<Double, Double, Double> result = (coeficiente,unidad) -> coeficiente+unidad;
        return result;
    }





}
