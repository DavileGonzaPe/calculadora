package com.maven.calculadora;

public class Operacion {
    private double operando1;
    private double operando2;
    private double resultado;

    public Operacion() {
    }

    public Operacion(double operando1, double operando2, double resultado) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.resultado = resultado;
    }

    public double getOperando1() {
        return operando1;
    }

    public void setOperando1(double operando1) {
        this.operando1 = operando1;
    }

    public double getOperando2() {
        return operando2;
    }

    public void setOperando2(double operando2) {
        this.operando2 = operando2;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public String operacionToString(String operacion){
        switch (operacion) {
            case "suma":
                return "El resultado de SUMAR " + this.operando1 + " + " + this.operando2 + " es " + this.resultado; 
            case "resta":
                return "El resultado de RESTAR " + this.operando1 + " - " + this.operando2 + " es " + this.resultado;
        
            default:
                return "No se ha especificado operación";
        }
    }
}
