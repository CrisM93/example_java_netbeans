package aritmeticapoo;

/**
 *
 * @author crizt mtz
 */
public class Aritmetica {

    int a;
    int b;

    //metodo inician con minuscula
    public void suma() {
        int resultado = a + b;
        System.out.println("Resultado " + resultado);
    }

    public int sumarConRetorno() {
        return (a + b);
    }

    public int sumarConArgumentos(int valor1, int valor2) {
        this.a = valor1;
        this.b = valor2;
        return a+b;
    }

}
