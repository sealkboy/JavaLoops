package javaloops;

public class JavaLoopsTest {

    @Test
    public void testTablaMultiplicar() {
        JavaLoops javaLoops = new JavaLoops();
        String expected = "5 x 0 = 0\n" +
                          "5 x 1 = 5\n" +
                          "5 x 2 = 10\n" +
                          "5 x 3 = 15\n" +
                          "5 x 4 = 20\n" +
                          "5 x 5 = 25\n" +
                          "5 x 6 = 30\n" +
                          "5 x 7 = 35\n" +
                          "5 x 8 = 40\n" +
                          "5 x 9 = 45\n" +
                          "5 x 10 = 50\n";
        String result = javaLoops.tablaMultiplicar(5);
        
        assertEquals(expected, result);
        
    }
}
