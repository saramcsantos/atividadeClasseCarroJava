public class Car {
    String modeloDoCarro;
    int anoDoCarro;
    String corDoCarro;

    void exibeFichaTecnicaDoCarro(){
        System.out.println("Modelo do carro: " + modeloDoCarro);
        System.out.println("Ano: " + anoDoCarro);
        System.out.println("Cor: " + corDoCarro);
    }

    int calculaAIdadeDoCarro(int anoAtual){
        return anoAtual - anoDoCarro;
    }
}
