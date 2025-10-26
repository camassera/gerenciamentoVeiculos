// Classe abstrata base
public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    // Método abstrato que será implementado nas subclasses
    public abstract String informacoesVeiculo();

    // Getter do atributo ano
    public int getAno() {
        return ano;
    }

    // Setter do atributo ano
    public void setAno(int ano) {
        this.ano = ano;
    }
}
