public class saudacao {
    public static void main(String[] args) {
        Saudacao saud1 = new Saudacao("olá", "Ryan");
        String mensagem = saud1.obterSaldacao();
        System.out.println(mensagem);
    }
}

class Saudacao {
    String texto;
    String destinatario;

        public Saudacao(String texto, String destinatario) {
            this.texto = texto;
            this.destinatario = destinatario;
        }

        public String obterSaldacao() {
            return texto + "," + destinatario;
        }

}
