public class Main {
    public static void main(String[] args) {
        Car carro = new Car();
        carro.modeloDoCarro = "Fusca";
        carro.anoDoCarro = 1965;
        carro.corDoCarro = "Preto";

        carro.exibeFichaTecnicaDoCarro();

        System.out.println("O carro tem " + carro.calculaAIdadeDoCarro(2024) + " anos");
    }
}
