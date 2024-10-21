package javaloops;

public class JavaLoops {
    public String tablaMultiplicar (int n) {
        String tabla = "";
        for (int i = 0; i <= 10; i++) {
            tabla += n + " x " + i + " = " + (n * i) + "\n";
        }
        return tabla;
    } 
}
