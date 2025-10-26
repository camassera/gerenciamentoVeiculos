// Classe Carro herda de Veiculo
public class Carro extends Veiculo {
    public int numeroPortas;

    // Implementação do método abstrato
        public String informacoesVeiculo() {
        return "Carro: " + marca + " " + modelo +
                ", Ano: " + getAno() +
                ", Portas: " + numeroPortas;
    }
}
