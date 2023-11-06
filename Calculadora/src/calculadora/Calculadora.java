/*
 * The MIT License
 *
 * Copyright 2023 Gabriel Massayuki Otaki.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package calculadora;

/**
 * Esta classe representa uma calculadora simples que realiza operações matemáticas
 * básicas, incluindo adição, subtração, multiplicação e divisão, com diferentes tipos
 * de números.
 * 
 *@author Gabriel Massayuki Otaki
 *data 05/11/2023
 *@version 1.2
 */

public class Calculadora {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        
        // Cria uma instância da classe Calculadora_Test para realizar operações matemáticas.
        
        Calculadora_Test calc = new Calculadora_Test();
        
        // Operações de Soma

        // Soma de dois números inteiros positivos.
        int somaDoispositivos = calc.somarDoispositivos(10, 5);
        System.out.println("Soma de dois números inteiros positivos:" + somaDoispositivos);

        // Soma de um número inteiro positivo e um número inteiro negativo.
        int somaUmpositivoNegativo = calc.somarUmpositivoNegativo(10, -5);
        System.out.println("Soma de um número inteiro positivo e um número inteiro negativo:" + somaUmpositivoNegativo);

        // Soma de um número inteiro negativo e um número inteiro positivo.
        int somaNegativopositivo = calc.somarUmnegativoPositivo(-10, 5);
        System.out.println("Soma de um número inteiro negativo e um número inteiro positivo:" + somaNegativopositivo);

        // Soma de dois números inteiros negativos.
        int somaDoisnegativos = calc.somarDoisnegativos(-10, -5);
        System.out.println("Soma de dois números inteiros negativos:" + somaDoisnegativos);

        // Soma de um número inteiro positivo e zero.
        int somaUmpositivoZero = calc.somarUmpositivoZero(10, 0);
        System.out.println("Soma de um número inteiro positivo e zero:" + somaUmpositivoZero);

        // Soma de um número inteiro negativo e zero.
        int somaUmnegativoZero = calc.somarUmnegativoZero(-10, 0);
        System.out.println("Soma de um número inteiro negativo e zero:" + somaUmnegativoZero);

        // Soma de zero e um número inteiro positivo.
        int somaUmzeroPositivo = calc.somarUmzeroPositivo(0, 5);
        System.out.println("Soma de zero e um número inteiro positivo:" + somaUmzeroPositivo);

        // Soma de zero e um número inteiro negativo.
        int somaUmzeroNegativo = calc.somarUmzeroNegativo(0, -5);
        System.out.println("Soma de zero e um número inteiro negativo:" + somaUmzeroNegativo);

        // Soma de dois zeros.
        int somaDoiszero = calc.somarDoiszero(0, 0);
        System.out.println("Soma de dois zeros:" + somaDoiszero);
        
         // Operações de Subtração

        // Subtração de dois números inteiros positivos.
        int subtDoisPositivos = calc.subDoispositivos(10, 5);
        System.out.println("Subtração de dois números inteiros positivos:" + subtDoisPositivos);

        // Subtração de um número inteiro positivo e um número inteiro negativo.
        int subtUmpositivoNegativo = calc.subUmpositivoNegativo(10, -5);
        System.out.println("Subtração de um número inteiro positivo e um número inteiro negativo:" + subtUmpositivoNegativo);

        // Subtração de um número inteiro negativo e um número inteiro positivo.
        int subtNegativoPositivo = calc.subUmnegativoPositivo(-10, 5);
        System.out.println("Subtração de um número inteiro negativo e um número inteiro positivo:" + subtNegativoPositivo);

        // Subtração de dois números inteiros negativos.
        int subtDoisnegativos = calc.subDoisnegativos(-10, -5);
        System.out.println("Subtração de dois números inteiros negativos:" + subtDoisnegativos);

        // Subtração de um número inteiro positivo e zero.
        int subtUmpositivoZero = calc.subUmpositivoZero(10, 0);
        System.out.println("Subtração de um número inteiro positivo e zero:" + subtUmpositivoZero);

        // Subtração de um número inteiro negativo e zero.
        int subtUmnegativoZero = calc.subUmnegativoZero(-10, 0);
        System.out.println("Subtração de um número inteiro negativo e zero:" + subtUmnegativoZero);

        // Subtração de dois zeros.
        int subtDoiszero = calc.subDoiszero(0, 0);
        System.out.println("Subtração de dois zeros:" + subtDoiszero);
        
        // Operações de Multiplicação

        // Multiplicação de dois números inteiros positivos.
        int multiDoisPositivos = calc.multDoispositivos(10, 5);
        System.out.println("Multiplicação de dois números inteiros positivos:" + multiDoisPositivos);

        // Multiplicação de um número inteiro positivo e um número inteiro negativo.
        int multiUmpositivoNegativo = calc.multUmpositivoNegativo(10, -5);
        System.out.println("Multiplicação de um número inteiro positivo e um número inteiro negativo:" + multiUmpositivoNegativo);

        // Multiplicação de um número inteiro negativo e um número inteiro positivo.
        int multiNegativoPositivo = calc.multUmnegativoPositivo(-10, 5);
        System.out.println("Multiplicação de um número inteiro negativo e um número inteiro positivo:" + multiNegativoPositivo);

        // Multiplicação de dois números inteiros negativos.
        int multiDoisnegativos = calc.multDoisnegativos(-10, -5);
        System.out.println("Multiplicação de dois números inteiros negativos:" + multiDoisnegativos);

        // Multiplicação de um número inteiro positivo e zero.
        int multiUmpositivoZero = calc.multUmpositivoZero(10, 0);
        System.out.println("Multiplicação de um número inteiro positivo e zero:" + multiUmpositivoZero);

        // Multiplicação de um número inteiro negativo e zero.
        int multiUmnegativoZero = calc.multUmnegativoZero(-10, 0);
        System.out.println("Multiplicação de um número inteiro negativo e zero:" + multiUmnegativoZero);
        
        // Operações de Divisão

        // Divisão de dois números inteiros positivos.
        int diviDoisPositivos = calc.divDoispositivos(10, 5);
        System.out.println("Divisão de dois números inteiros positivos:" + diviDoisPositivos);

        // Divisão de um número inteiro positivo por um número inteiro negativo.
        int diviUmpositivoNegativo = calc.divUmpositivoNegativo(10, -5);
        System.out.println("Divisão de um número inteiro positivo por um número inteiro negativo:" + diviUmpositivoNegativo);

        // Divisão de um número inteiro negativo por um número inteiro positivo.
        int diviNegativoPositivo = calc.divUmnegativoPositivo(-10, 5);
        System.out.println("Divisão de um número inteiro negativo por um número inteiro positivo:" + diviNegativoPositivo);

        // Divisão de dois números inteiros negativos.
        int diviDoisnegativos = calc.divDoisnegativos(-10, -5);
        System.out.println("Divisão de dois números inteiros negativos:" + diviDoisnegativos);

        // Divisão de um número inteiro positivo por zero.
        int diviUmpositivoZero = calc.divUmpositivoZero(10, 0);
        System.out.println("Divisão de um número inteiro positivo por zero:" + diviUmpositivoZero);

        // Divisão de um número inteiro negativo por zero.
        int diviUmnegativoZero = calc.divUmnegativoZero(-10, 0);
        System.out.println("Divisão de um número inteiro negativo por zero:" + diviUmnegativoZero);

        // Divisão de dois zeros.
        int diviDoiszero = calc.divDoiszero(0, 0);
        System.out.println("Divisão de dois zeros:" + diviDoiszero);
        
    }
    
}
