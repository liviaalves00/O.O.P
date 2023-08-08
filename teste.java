public class teste{
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Alice", 28);
        pessoa1.exibirInfo(); // Chama o método exibirInfo para mostrar informações sobre a pessoa
        
    }
}
class Pessoa {
    // Atributos
    String nome;
    int idade;

    // Método construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir informações da pessoa
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}


