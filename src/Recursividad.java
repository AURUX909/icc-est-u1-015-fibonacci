public class Recursividad {
    public int factorial(int n){
        System.out.println("Calculando el factorial de: " + n);
        //Case Base: n sea 0! y 1! son iguales a 1
        if(n == 0 || n == 1){
            System.out.println("Caso base alcanzado el factorial de " + n + " es  1");
            return 1;
        }
        int result = n * factorial(n - 1);
        System.out.println("Resulatado para " + n + " * factorial("+ (n - 1) +") = " + result);
        return result;
        //return n * factorial(n-1)
    }
    //calcular la suma de los numeros consecutivos
    // n = 5 resultado = 5 + 4 + 3 + 2 + 1 = 15
    public int sumaConsecutuvas(int n){
        //case base
        if(n == 1){
            return 1;
        }
        return n + sumaConsecutuvas(n - 1);
    }
    //calcular la potencia de numeros
    public int potencia(int base, int exponente){
        if(exponente == 0){
            return 1;
        }
        return base  * potencia(base, exponente - 1);
    }
    ///CREAR UN METODO QUE SUME LOS DIGITOD DE UN NUMERO
    ///SI MANDO 456 SEA IGUAL A 15
    ///4 + 5 + 6 = 15
    ///PISTA SE USA %MOD
    public int digital(int digitos){
        if(digitos < 10){
            return digitos;
        }
        return (digitos % 10) + digital(digitos / 10); 
    }
    public int fibonacci(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        if (i == 3) return 2;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }  
    //RECURSIVIDAD - EJERCICIOS
    //Renombrar 
}