
package Modelo;

/**
 *
 * @author Marc
 */
public final class Calculadora {
    private float display;
    private float acumulador;
    private int operador; 
    private boolean reescriure = true;

    public static final int RES = 0;
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICA = 3;
    public static final int DIVIDEIX = 4;
    private static final int IGUAL = 5;

    public Calculadora() {
        reset();
    }

    public float getDisplay() {
        return display;
    }

    public void reset() {
        display = 0;
        acumulador = 0;
        operador = Calculadora.RES;
    }

    public void pitjarNumero(int n) {
        if (reescriure) { 
            display = 0; 
            reescriure = false; 
        }
        display = display * 10 + n;
    }

    public void pitjarOperacio(int op) {
        actualitzarValor(op);
        operador = op;
        reescriure = true;
    }

    public void resultat() {
        actualitzarValor(Calculadora.IGUAL);
        operador = Calculadora.RES;
        reescriure = true;
    }

    private void actualitzarValor(int op) {
        switch (operador){
            case Calculadora.RES: 
                acumulador = display; 
                break;
            case Calculadora.SUMA: 
                acumulador = acumulador + display; 
                break;
            case Calculadora.RESTA: 
                acumulador = acumulador - display; 
                break;
            case Calculadora.MULTIPLICA: 
                acumulador = acumulador * display; 
                break;
            case Calculadora.DIVIDEIX: 
                acumulador = acumulador / display; 
                break;
            default: 
        }
        display = acumulador;     
    }
}
