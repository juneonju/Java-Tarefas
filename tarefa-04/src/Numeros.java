public class Numeros {
    public int[] arrayNumeros;

    public Numeros(int[] arrayNumeros) {
        this.arrayNumeros = arrayNumeros;
    }

    // Método para somar todos os números no array
    public int somarNumeros() {
        int soma = 0;
        for (int numero : arrayNumeros) {
            soma += numero;
        }
        return soma;
    }
}
