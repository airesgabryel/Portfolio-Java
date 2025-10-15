void main() {
    Producao joji = new Producao();
    joji.id = 442;
    joji.nome = "Joji";
    joji.classificacao = "Adulto";
    joji.diretor = "Joji";
    joji.estudio = "Spotify";
    //joji.dataLancamento = "14102025";
    System.out.println(joji.exibirDados());

    //musicClip theWeeknd = new musicClip();
    //theWeeknd.temporadas = 5;
}

public class Producao {
    public int id;
    public String nome;
    public String classificacao;
    public String diretor;
    public String estudio;
    //public Date dataLancamento;

    public String exibirDados(){
        return "Nome: " + this.nome + "\n" +
                "Classificação: " + this.classificacao + "\n" +
                "Diretor: " + this.diretor + "\n" +
                "Estudio: " + this.estudio;
    }
}

public class MusicClip extends Producao {
    public int temporadas;
    //public Date dataEncerramento;
}


