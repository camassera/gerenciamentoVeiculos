void main() {
    // Instanciando um carro
    var carro = new Carro();
    carro.marca = "Toyota";
    carro.modelo = "Corolla";
    carro.setAno(2022);
    carro.numeroPortas = 4;

    // Instanciando uma moto
    var moto = new Moto();
    moto.marca = "Honda";
    moto.modelo = "CB500";
    moto.setAno(2021);
    moto.setCilindrada(500);

    // Imprimindo informações
    System.out.println(carro.informacoesVeiculo());
    System.out.println(moto.informacoesVeiculo());
}


