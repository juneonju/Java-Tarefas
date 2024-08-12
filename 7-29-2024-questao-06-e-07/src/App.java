public class App {
    public static void main(String[] args) throws Exception {
        // Carro carro = new Carro();

        // carro.ano = 2040;
        // carro.modelo = "hotweels";
        // carro.marca = "mcQueen";

        // System.out.println("O carro consultado é um " + carro.marca + " - " + carro.modelo + ", ano " + carro.ano);

        int[] numeros = {1, 2, 3, 4, 5};
        Numeros objNumeros = new Numeros(numeros);
        
        int soma = objNumeros.somarNumeros();
        System.out.println("A soma dos números no array é: " + soma);
    }
}
