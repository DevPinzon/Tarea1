public class Main {
    public static void main(String[] args) {
        // suma
        int resultado;
        resultado = suma(20,20,30);
        System.out.println("La suma es: "+resultado);
        // objeto carro
        Carro miCarro = new Carro();
        miCarro.ponerPuerta();
        System.out.println("El carro tiene: "+miCarro.puertas+" puerta(s).");
    }

    public static int suma(int a, int b, int c){
        return (a+b+c);
    }
}

class Carro{
    public int puertas = 0;
    public void ponerPuerta(){
        puertas ++;
    }
}
