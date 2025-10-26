// Classe que herda de Veiculo
public class Moto extends Veiculo {
    private int cilindrada;

    // Setter para cilindrada (getter removido por não ser usado)
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String informacoesVeiculo() {
        return "Moto: " + marca + " " + modelo +
                ", Ano: " + getAno() +
                ", Cilindrada: " + cilindrada + "cc";
    }
}
