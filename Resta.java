public class Resta{
    private int a, b, resultado; // Variables para almacenar los dos números y el resultado de la resta.

    // Método para realizar la resta.
    public int restar(){
        resultado = this.a - this.b; // Calcular la resta y almacenar el resultado.
        return resultado; // Devolver el resultado de la resta.
    }

    // Métodos getter y setter para el primer número.
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }

    // Métodos getter y setter para el segundo número.
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }

    // Métodos getter y setter para el resultado.
    public int getResultado() {
        return resultado;
    }
    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    // Método toString para representar el objeto Resta como una cadena de texto.
    @Override
    public String toString() {
        return "Resta [a=" + a + ", b=" + b + ", resultado=" + resultado + "]";
    }
}
