package calculadora;

/**
 * Esta classe fornece teste de diversas situações matemáticas, como soma, subtração, multiplicação e divisão.
 */
public class Calculadora_Test {
    
    /**
     * Realiza a adição de dois números inteiros positivos.
     *
     * @param a O primeiro número inteiro positivo.
     * @param b O segundo número inteiro positivo.
     * @return A soma dos dois números.
     */
    public int somarDoispositivos(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a adição de um número inteiro positivo e um número inteiro negativo.
     *
     * @param a O número inteiro positivo.
     * @param b O número inteiro negativo.
     * @return A soma dos dois números.
     */
    public int somarUmpositivoNegativo(int a, int b) {
        return a + (-b);
    }
    
    /**
     * Realiza a adição de um número inteiro negativo e um número inteiro positivo.
     *
     * @param a O número inteiro negativo.
     * @param b O número inteiro positivo.
     * @return A soma dos dois números.
     */
    public int somarUmnegativoPositivo(int a, int b) {
        return (-a) + b;
    }
    
    /**
     * Realiza a adição de dois números inteiros negativos.
     *
     * @param a O primeiro número inteiro negativo.
     * @param b O segundo número inteiro negativo.
     * @return A soma dos dois números.
     */
    public int somarDoisnegativos(int a, int b) {
        return (-a) + (-b);
    }
    
    /**
     * Realiza a adição de um número inteiro positivo e zero.
     *
     * @param a O número inteiro positivo.
     * @param b O número zero.
     * @return O próprio número positivo.
     */
    public int somarUmpositivoZero(int a, int b) {
        return a;
    }
    
    /**
     * Realiza a adição de um número inteiro negativo e zero.
     *
     * @param a O número inteiro negativo.
     * @param b O número zero.
     * @return O próprio número negativo.
     */
    public int somarUmnegativoZero(int a, int b) {
        return (-a);
    }
    
    /**
     * Realiza a adição de um número inteiro positivo e zero.
     *
     * @param a O número zero.
     * @param b O número inteiro negativo.
     * @return O próprio número negativo.
     */
    public int somarUmzeroNegativo(int a, int b) {
        return (-b);
    }
    
    /**
     * Realiza a adição de um número inteiro positivo e zero.
     *
     * @param a O número zero.
     * @param b O número inteiro positivo.
     * @return O próprio número positivo.
     */
    public int somarUmzeroPositivo(int a, int b) {
        return b;
    }
    
    /**
     * Realiza a adição de dois números inteiros iguais a zero.
     *
     * @param a O número zero.
     * @param b O número zero.
     * @return Zero.
     */
    public int somarDoiszero(int a, int b) {
        return 0;
    }
    
    //Subtração 
    
    /**
     * Realiza a subtração de dois números inteiros positivos.
     *
     * @param a O primeiro número inteiro positivo.
     * @param b O segundo número inteiro positivo.
     * @return A diferença entre os dois números.
     */
    public int subDoispositivos(int a, int b) {
        return a - b;
    }

    /**
     * Realiza a subtração de um número inteiro positivo e um número inteiro negativo.
     *
     * @param a O número inteiro positivo.
     * @param b O número inteiro negativo.
     * @return A diferença entre os dois números.
     */
    public int subUmpositivoNegativo(int a, int b) {
        return a - (-b);
    }

    /**
     * Realiza a subtração de um número inteiro negativo e um número inteiro positivo.
     *
     * @param a O número inteiro negativo.
     * @param b O número inteiro positivo.
     * @return A diferença entre os dois números.
     */
    public int subUmnegativoPositivo(int a, int b) {
        return (-a) - b;
    }

    /**
     * Realiza a subtração de dois números inteiros negativos.
     *
     * @param a O primeiro número inteiro negativo.
     * @param b O segundo número inteiro negativo.
     * @return A diferença entre os dois números.
     */
    public int subDoisnegativos(int a, int b) {
        return (-a) - (-b);
    }

    /**
     * Realiza a subtração de um número inteiro positivo e zero.
     *
     * @param a O número inteiro positivo.
     * @param b O número zero.
     * @return O próprio número positivo.
     */
    public int subUmpositivoZero(int a, int b) {
        return a;
    }

    /**
     * Realiza a subtração de um número inteiro negativo e zero.
     *
     * @param a O número inteiro negativo.
     * @param b O número zero.
     * @return O próprio número negativo.
     */
    public int subUmnegativoZero(int a, int b) {
        return (-a);
    }

    /**
     * Realiza a subtração de dois números iguais a zero.
     *
     * @param a O número zero.
     * @param b O número zero.
     * @return Zero.
     */
    public int subDoiszero(int a, int b) {
        return 0;
    }

    // Multiplicação

    
    /**
     * Realiza a multiplicação de dois números inteiros positivos.
     *
     * @param a O primeiro número inteiro positivo.
     * @param b O segundo número inteiro positivo.
     * @return O produto dos dois números.
     */
    public int multDoispositivos(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a multiplicação de um número inteiro positivo e um número inteiro negativo.
     *
     * @param a O número inteiro positivo.
     * @param b O número inteiro negativo.
     * @return O produto dos dois números, que é negativo.
     */
    public int multUmpositivoNegativo(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a multiplicação de um número inteiro negativo e um número inteiro positivo.
     *
     * @param a O número inteiro negativo.
     * @param b O número inteiro positivo.
     * @return O produto dos dois números, que é negativo.
     */
    public int multUmnegativoPositivo(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a multiplicação de dois números inteiros negativos.
     *
     * @param a O primeiro número inteiro negativo.
     * @param b O segundo número inteiro negativo.
     * @return O produto dos dois números, que é positivo.
     */
    public int multDoisnegativos(int a, int b) {
        return a * b;
    }

    /**
     * Realiza a multiplicação de um número inteiro positivo e zero.
     *
     * @param a O número inteiro positivo.
     * @param b O número zero.
     * @return Zero.
     */
    public int multUmpositivoZero(int a, int b) {
        return 0;
    }

    /**
     * Realiza a multiplicação de um número inteiro negativo e zero.
     *
     * @param a O número inteiro negativo.
     * @param b O número zero.
     * @return Zero.
     */
    public int multUmnegativoZero(int a, int b) {
        return 0;
    }

    /**
     * Realiza a multiplicação de dois números iguais a zero.
     *
     * @param a O número zero.
     * @param b O número zero.
     * @return Zero.
     */
    public int multDoiszero(int a, int b) {
        return 0;
    }
    
    // Divisão

    /**
     * Realiza a divisão de dois números inteiros positivos.
     *
     * @param a O numerador (dividendo).
     * @param b O denominador (divisor).
     * @return O resultado da divisão.
     * @throws ArithmeticException se o denominador for zero.
     */
    public int divDoispositivos(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Realiza a divisão de um número inteiro positivo por um número inteiro negativo.
     *
     * @param a O numerador (dividendo).
     * @param b O denominador (divisor) negativo.
     * @return O resultado da divisão, que é negativo.
     * @throws ArithmeticException se o denominador for zero.
     */
    public int divUmpositivoNegativo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Realiza a divisão de um número inteiro negativo por um número inteiro positivo.
     *
     * @param a O numerador (dividendo) negativo.
     * @param b O denominador (divisor) positivo.
     * @return O resultado da divisão, que é negativo.
     * @throws ArithmeticException se o denominador for zero.
     */
    public int divUmnegativoPositivo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Realiza a divisão de dois números inteiros negativos.
     *
     * @param a O numerador (dividendo) negativo.
     * @param b O denominador (divisor) negativo.
     * @return O resultado da divisão, que é positivo.
     * @throws ArithmeticException se o denominador for zero.
     */
    public int divDoisnegativos(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Realiza a divisão de um número inteiro positivo por zero.
     *
     * @param a O numerador (dividendo).
     * @param b O denominador (divisor) igual a zero.
     * @return Infinity (representando um resultado indefinido).
     */
    public int divUmpositivoZero(int a, int b) {
        if (b == 0) {
            return Integer.MAX_VALUE; // Você pode escolher como deseja representar esse resultado indefinido.
        }
        return a / b;
    }

    /**
     * Realiza a divisão de um número inteiro negativo por zero.
     *
     * @param a O numerador (dividendo) negativo.
     * @param b O denominador (divisor) igual a zero.
     * @return Negativo Infinity (representando um resultado indefinido).
     */
    public int divUmnegativoZero(int a, int b) {
        if (b == 0) {
            return Integer.MIN_VALUE; // Você pode escolher como deseja representar esse resultado indefinido.
        }
        return a / b;
    }

    /**
     * Realiza a divisão de dois números iguais a zero.
     *
     * @param a O numerador (dividendo) igual a zero.
     * @param b O denominador (divisor) igual a zero.
     * @return NaN (representando um resultado indefinido).
     */
    public int divDoiszero(int a, int b) {
        if (a == 0 && b == 0) {
            return Integer.MIN_VALUE; // Você pode escolher como deseja representar esse resultado indefinido.
        } else {
            return 0; // Qualquer outro resultado com pelo menos um zero no numerador ou no denominador será zero.
        }
    }
}
