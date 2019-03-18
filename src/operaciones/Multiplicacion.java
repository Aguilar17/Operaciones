package operaciones;

public class Multiplicacion {
  
    public static int obtenerFactor(int cifras) {
        int factor = 0;
        switch(cifras){
            case 0: factor = (int)(Math.random()*9+1);
                    break;
            case 1: factor = (int)(Math.random()*90+10);
                    break;
            case 2: factor = (int)(Math.random()*900+100);
                    break;
            case 3: factor = (int)(Math.random()*999+1);
                    break;
            case 4: factor = (int)(Math.random()*10+1);
        }
        return factor;
    }
    
    public static int operador(int operacion, int f1, int f2){
        int solucion = 0;
        switch(operacion){
            case 0: solucion = f1 + f2;
                    break;
            case 1: solucion = f1 - f2;
                    break;
            case 2: solucion = f1 * f2;
                    break;
            case 3: solucion = (int)(f1 / f2);
                    break; 
        }
        return solucion;
    }
    
    public static String obtenerSigno(int operacion){
        String signo = "?";
        switch(operacion){
            case 0: signo = "+";
                    break;
            case 1: signo = "-";
                    break;
            case 2: signo = "x";
                    break;
            case 3: signo = "/";
                    break; 
        }
        return signo;
    }
}
