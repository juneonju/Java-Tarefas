public class Numeros {
    public int[] arrayNumeros;

    public Numeros(int[] arrayNumeros) {
        this.arrayNumeros = arrayNumeros;
    }
    
    public int somarNumeros() {
        int soma = 0;
        for (int numero : arrayNumeros) {
            soma += numero;
        }
        return soma;
    }
}
