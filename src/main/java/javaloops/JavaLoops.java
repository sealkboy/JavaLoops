package javaloops;

public class JavaLoops {
    public String[] tablaMultiplicar (int n) {
        String[] tabla = new String[10]; 
        for (int i = 0; i < 10; i++) {
            tabla[i] = n + " x " + (i+1) + " = " + (n * (i+1));
        }
        return tabla;
    } 
}