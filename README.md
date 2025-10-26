Descrição das Classes
1) Classe Veiculo (abstrata)
Contém os seguintes atributos e métodos:
Atributos:
    • marca (público) Tipo: String Descrição: Marca do veículo.
    • modelo (público) Tipo: String Descrição: Modelo do veículo.
    • ano (privado) Tipo: int Descrição: Ano de fabricação.

Métodos:
    • getAno()  // Retorna o ano do veículo.
    • setAno(int ano)  // Define o ano do veículo.
    • informacoesVeiculo()  // Método abstrato, que deve ser implementado nas subclasses.
2) Classe Carro
Herda de Veiculo e adiciona o atributo:
Atributo:
    • numeroPortas(público) Tipo: int Descrição: Quantidade de portas do carro.

Implementação do método abstrato:
    • informacoesVeiculo()  //Retorna uma string com marca, modelo, ano e número de portas.

3) Classe Moto
Herda de Veiculo e adiciona o atributo:
Atributo:
cilindrada(privado) Tipo: int Descrição: Cilindrada do motor da moto.

Métodos:
    • getCilindrada() e setCilindrada(int cilindrada)
    • informacoesVeiculo()  // Retorna marca, modelo, ano e cilindrada.

4)  Arquivo Main.java
Nele são criadas instâncias de Carro e Moto, definidos os atributos e exibidas as informações.



Como Executar o Projeto:
Instruções de Execução do projeto no IntelliJ IDEA
Abra o IntelliJ IDEA.
 Crie um projeto Java:
 Vá em File -> New -> Project.
    A) Escolha Language: Java.
    B) Em Build System, selecione IntelliJ.
    C) Clique em Create.
Crie o pacote e as classes:
    A) Na pasta src, clique com o botão direito -> New -> Java Class.
    B) Crie as seguintes classes abaixo e copie o código de cada arquivo correspondente nas classes:
Veiculo.java
Carro.java
Moto.java
Main.java
Compile e execute:
Selecione Main como classe de execução e clique no botão  Run no canto superior direito do IntelliJ.
Deverá aparecer a seguinte Saída do programa na tela:

Marca: Toyota, Modelo: Corolla, Ano: 2022, Portas: 4
Marca: Honda, Modelo: CB500, Ano: 2021, Cilindrada: 500cc
