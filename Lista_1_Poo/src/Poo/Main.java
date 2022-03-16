package Poo;

import java.util.Scanner;
import java.lang.Math;

public class Main {

        public static void main(String[] args) {

                Scanner entrada = new Scanner(System.in);
                System.out.println("Digite o primeiro numero real");
                double NumReal1 = entrada.nextDouble();
                System.out.println("Digite o segundo numero real");
                double NumReal2 = entrada.nextDouble();
                // 1- Abs
                double resultAbs1 = Math.abs(NumReal1);
                System.out.println("Abs Primeiro Numero: " + resultAbs1);
                double resultAbs2 = Math.abs(NumReal2);
                System.out.println("Abs Segundo Numero: " + resultAbs2);

                // 2-Ceil
                double resultCeil1 = Math.ceil(NumReal1);
                System.out.println("Ceil Primeiro Numero: " + resultCeil1);
                double resultCeil2 = Math.ceil(NumReal2);
                System.out.println("Ceil Segundo Numero: " + resultCeil2);

                // 3-Cos
                double resultCos1 = Math.cos(NumReal1);
                System.out.println("Cos Primeiro Numero: " + resultCos1);
                double resultCos2 = Math.cos(NumReal2);
                System.out.println("Cos Segundo Numero: " + resultCos2);
                // 4-Exp
                double resultExp1 = Math.exp(NumReal1);
                System.out.println("Exp Primeiro Numero: " + resultExp1);
                double resultExp2 = Math.exp(NumReal2);
                System.out.println("Exp Segundo Numero: " + resultExp2);

                // 5-Floor
                double resultFloor1 = Math.floor(NumReal1);
                System.out.println("Floor Primeiro Numero: " + resultFloor1);
                double resultFloor2 = Math.floor(NumReal2);
                System.out.println("Floor Segundo Numero: " + resultFloor2);

                // 6-Log
                double resultLog1 = Math.log(NumReal1);
                System.out.println("Log Primeiro Numero: " + resultLog1);
                double resultLog2 = Math.log(NumReal2);
                System.out.println("Log Segundo Numero: " + resultLog2);

                // 7-Max
                double resultNumMax = Math.max(NumReal1, NumReal2);
                System.out.println("O numero maximo entre os dois é : " + resultNumMax);

                // 8-Min
                double resultNumMin = Math.min(NumReal1, NumReal2);
                System.out.println("O numero minimo entre os dois é : " + resultNumMin);
                // 9-Pow
                double resultPow = Math.pow(NumReal1, NumReal2);
                System.out.println("O primeiro numero elevado ao segundo " + resultPow);
                // 10-Sqrt
                double resultSqrt1 = Math.sqrt(NumReal1);
                System.out.println("Raiz quadrada do primeiro numero: " + resultSqrt1);
                double resultSqrt2 = Math.sqrt(NumReal2);
                System.out.println("Raiz quadrada do segundo numero: " + resultSqrt2);

        }

}
