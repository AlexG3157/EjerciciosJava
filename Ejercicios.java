public class Ejercicios 
{
    public static void main(String[] args) 
    {

    }

    ///////////////////////   FUNCIONES /////////////////////////////////

    /**
     * Funcion que regresa el promedio de los tres números pasados en parámetro.
     */
    static double promedioDeTresNumeros(double a, double b, double c)
    {
        return (a+b+c)/3;
    }
    
    /**
     * Dado un precio sin impuestos y un porcentaje de IVA, calcular el precio
     * después de impuestos.
     */
    static double precioConIVA(double precioSinIVA, double porcentajeIVA)
    {
        return precioSinIVA + precioSinIVA*porcentajeIVA/100;
    }
    /*
     * Dado un precio con impuestos y un porcentaje de IVA, calcular el preio
     * antes de impuestos (sin el IVA).
     */
    static double precioSinIVA(double precioConIVA, double porcentajeIVA)
    {
        return 100*precioConIVA/(porcentajeIVA+100);
    }

    /*
     * Convertir grados celsius a grados farenheit. 
     */
    static double celsiusAFarenheit(double celsius)
    {
      double farenheit = celsius*1.8 +32;
      return farenheit;
    }
    /*
     * Convertir grados Farenheit a Celsius
     */
    static double farenheitACelsius(double farenheit)
    {
        return (farenheit-32)*5/9;
    }

    /*
     * Dado un número de lados y una longitud de lado, calcular el perímetro del
     * polígono regular correspondiente.
     */
    static double perimetroPoligono(int numeroDeLados, double longitudLado)
    {
        return numeroDeLados*longitudLado;
    }

    /*
     * Dada la base y la altura de un triángulo, calcular su área
     */
    static double areaTriangulo(double base, double altura)
    {
        return base*altura/2;
    }
    /*
     * Dada la base y la altura de un cuadrado, calcular su área.
     */
    static double areaCuadrado(double base, double altura)
    {
        return base*altura;
    }
    /*
     * Calcular el área de un polígono regular sabiendo su perímetro y su apotema.
     */
    static double areaPoligono(double perimetro, double apotema)
    {
        return perimetro*apotema/2;
    }
    /*
     * Usando las dos funciones anteriores, calcular el área de un polígono regular 
     * sabiendo el número de lados, la longitud de lado y su apotema.
     */
    static double areaPoligonoLados(int numeroDeLados, double longitudLado, double apotema)
    {
        return areaPoligono(perimetroPoligono(numeroDeLados, longitudLado), apotema);
    }
    /*
     * Calcular el semiperimetro de un triángulo, sabiendo la longitud de cada uno de sus 
     * lados.
     */
    static double semiperimetroTriangulo(double a, double b, double c)
    {
        return (a+b+c)/2;
    }
    /*
     * Usando la funcióno anterior, calcular el área de un triángulo
     * sabiendo la longitud de cada uno de sus lados (usando la fórmula de Herón).
     */
    static double areaTrianguloHeron(double a, double b, double c)
    {
        double s = semiperimetroTriangulo(a, b, c);
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    /*
     * Calcular el costo total de una excursión dado el número de alumnos sabiendo que:
     *      -Por cada 15 alumnos debe de ir un profesor 
     *          (para 16 alumnos ya se necesitarían 2 profesores).
     *      -Caben sólo 40 personas en cada camión 
     *          (para 39 alumnos, serían 3 profesores y por tanto 42 personas, 
     *          es decir, se necesitarían 2 camiones).
     *      -A cada profesor se le debe de pagar $2100
     *      -La renta de cada camión cuesta $5000
     * 
     * Hint: Math.ceil(x) redondea x hacia arriba. 
     */
    static double costoExcursion(int numAlumnos)
    {
        int numProfesores = (int) Math.ceil(numAlumnos/15.0);
        int numCamiones = (int) Math.ceil( (numAlumnos+numProfesores) /40.0);

        return numProfesores*2100 + numCamiones*5000;
    }

    /*
     * Calcula el precio de un menú que cuenta con las siguientes opciones:
     *  Entrada: Ensalada 25$ o Sopa 35$
     *  Plato fuerte: Pollo 50$ o carne 100$
     *  Postre: Pastel $20 o flan $25
     * 
     * La función deberá recibir 3 números como parámetros, uno por cada tiempo de la comida.
     * El número será 1 si se eligió la primera opción o 2 si fue la segunda.
     * Por ejemplo, menú(1,2,1) corresponde a ensalada, carne y pastel, en ese caso, la función
     * debe regresar 145.
     * 
     * La única regla es que no se pueden usar condicionales. 
     */
    static double menu(int entrada, int platoFuerte, int postre)
    {
        double costoEntrada = (entrada-1)*10+25;
        double costoPlatoFuerte = (platoFuerte-1)*50+50;
        double costoPostre = (platoFuerte-1)*5+20;

        return costoEntrada+costoPlatoFuerte+costoPostre;
    }

    /**
     * Recibe un ángulo en grados entre -180° y 180°, y regresa su ángulo
     * opuesto entre -180° y 180°
     */
    static double anguloOpuesto(double angulo)
    {
        if(angulo>0)
        {
            return angulo - 180;
        }
        return angulo +180;
    }

    /**
     * Recibe un ángulo en grados entre -180° y 180°, y un porcentaje,
     * donde -180° equivale a 0 y 180° a 1
     */
    static double anguloAPorcentaje(double angulo)
    {
        return (angulo+180)/360;
    }

    /*
     * Un sensor da valores de entre 1500 y 3200, convertir esa escala a 10-20, 
     * donde 3200 es 20 y 1500 es 10.
     */
    static double mapeoSensor(double value)
    {
        return (value-1500)/1700 + 10;
    }


    //////////////////////////// CONDICIONALES ///////////////////////////////////


    /*
     * La función debe imprimir "par" o "impar" según la paridad de x (no regresa nada).
     */
    static void parOImpar(int x)
    {
        double residuo = Math.abs(x)/2.0;
        residuo = residuo - Math.floor(residuo);

        if(residuo > 0.001)
        {
            System.out.println("impar");
        }
        else
        {
            System.out.println("Par");
        }
    }
    /*
     * Solución del problema anterior, pero usando módulos.
     */
    static void parOImparSol2(int x)
    {
        if(x%2 == 0)
        {
            System.out.println("par");
        }
        else
        {
            System.out.println("impar");
        }
    }

    /*
     * Dados tres longitudes que representan los lados de un triángulo, determinar 
     * si es un triángulo válido e imprimir qué tipo de triángulo es.
     */
    static void tipoTriangulo(double a, double b, double c)
    {
        if( a+b < c || a+c < b || b+c < a)
        {
            System.out.println("Triangulo no valido");
        }
        else if(a==b && a==c)
        {
            System.out.println("Equilatero");
        }
        else if(a == b || b == c)
        {
            System.out.println("Isosceles");
        }
        else 
        {
            System.out.println("Escaleno");
        }
    }

    /*
     * La función debe imprimir "positivo", "negativo" o "cero" dependiendo de si 
     * el número pasado en parámetro es positivo, negativo o cero. (no regresa nada)
     */
    static void positivoNegativo(double x)
    {
        if(x>0)
        {
            System.out.println("positivo");
        }
        else if(x<0)
        {
            System.out.println("negativo");
        }
        else
        {
            System.out.println("cero");
        }
    }

    /*
     * La funcion debe regresar -1 si el número es negativo, 0 si es cero o 1 si es positivo.
     * 
     * Bonus points: hazlo con un sólo if.
     */
    static int signo(double x)
    {
        if(x == 0)
        {
            return 0;
        }
        return (int)(x/Math.abs(x));
    }

    /*
     * Usando la función anterior, esta función, sin calcular la suma, tiene que determinar el 
     * signo de la suma. Si la suma es positiva, regresa 1, si es 0, regresa 0 y si es negativa, 
     * regresa -1.
     */
    static int signoSuma(double a, double b)
    {
        if(a == -b)
        {
            return 0;
        }
        if(a>b)
        {
            return signo(a);
        }
        return signo(b);
    }

    /*
     * Sin usar la función signo y sin calcular la multiplicación, regresar -1 si 
     * el producto de dos números pasados en parámetro es negativo, 1 si es positivo, 0
     * si es cero.
     */
    static int signoMultiplicación(double a, double b)
    {
        if(a == 0 || b == 0)
        {
            return 0;
        }
        if( ( a>0 && b>0 ) || ( a<0 && b<0 ) )
        {
            return 1;
        }
        return -1;
    }

    /*
     * Dados tres números dados como parámetros, regresar el menor de los tres.
     * 
     * Bonus points: usar máximo dos ifs.
     */
    static double menorDeTres(double a, double b, double c)
    {
        double menorAB;
        if(a<b)
        {
            menorAB = a;
        }else
        {
            menorAB = b;
        }

        if(menorAB < c)
        {
            return menorAB;
        }
        return c;
    }

    /*
     * Crear una función que reciba 3 números como parámetros, a, b y c, 
     * que corresponden al polinómio cuadrático ax^2+bx+c. La función 
     * deberá determinar cuántas raíces tiene el polinomio (una, dos o ninguna),
     * e imprimir un mensaje en el que se mueestren las raíces, 
     * el mensaje será distinto según el número de raíces que tenga. 
     */
    static void raicesPolinomio(double a, double b, double c)
    {
        double discriminante = b*b-4*a*c;

        if(discriminante < 0)
        {
            System.out.println("El polinomio no tiene raíces.");
        }
        else if (discriminante == 0)
        {
            double x = -b/(2*a);
            System.out.println("El polinomio tiene una uníca raíz, " + x);
        }else
        {
            double x1 = (-b+Math.sqrt(discriminante))/(2*a);
            double x2 = (-b-Math.sqrt(discriminante))/(2*a);
            System.out.println("El polinomio tiene dos raíces, que son: " + x1 + " y " + x2);
        }
    }


}
