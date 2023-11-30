package Exceptions;

public class AplicacaoException extends Exception {
    public AplicacaoException(String mensagem) {
        super(mensagem);
    }
}
//Foi usado o Exception em vez de Error, por conta da hierarquia e tratamentdo de dados em Java
// em TS eError gunciona perfeitamente, ao contrário de java
//Todas as questoes de criação e extensão de Excecões, estao dentro da pasta Exceptions
// Questoes 6,7,8, 10, 12, 