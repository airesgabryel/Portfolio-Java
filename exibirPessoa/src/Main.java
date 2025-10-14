//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pessoa gabryel = new Pessoa();
    gabryel.nome = "Gabryel Aires";
    gabryel.email = "56gabryel@gmail.com";
    gabryel.cpf = "010101010-01";
    System.out.println(gabryel.exibirDados());

}

    public class Pessoa {
        public String nome;
        public String email;
        public String cpf;

        public String exibirDados(){
            return "=== Dados da Pessoa ===" + "\n" +
                    "Nome: " + this.nome + "\n" +
                    "Email: " + this.email + "\n" +
                    "CPF: " + this.cpf;
        }
}




