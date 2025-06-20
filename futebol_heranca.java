// Tema escolhido: Esportes - Meu esporte favorito é o futebol

// Superclasse
public class Futebol {
    private String nomeJogador;
    private int idade;
    private String time;

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

// Subclasse 1
class Goleiro extends Futebol {
    private int defesasFeitas;
    private boolean usaLuva;
    private double altura;

    public int getDefesasFeitas() {
        return defesasFeitas;
    }

    public void setDefesasFeitas(int defesasFeitas) {
        this.defesasFeitas = defesasFeitas;
    }

    public boolean isUsaLuva() {
        return usaLuva;
    }

    public void setUsaLuva(boolean usaLuva) {
        this.usaLuva = usaLuva;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

// Subclasse 2
class Zagueiro extends Futebol {
    private int desarmes;
    private int cartoesAmarelos;
    private boolean eTitular;

    public int getDesarmes() {
        return desarmes;
    }

    public void setDesarmes(int desarmes) {
        this.desarmes = desarmes;
    }

    public int getCartoesAmarelos() {
        return cartoesAmarelos;
    }

    public void setCartoesAmarelos(int cartoesAmarelos) {
        this.cartoesAmarelos = cartoesAmarelos;
    }

    public boolean isETitular() {
        return eTitular;
    }

    public void setETitular(boolean eTitular) {
        this.eTitular = eTitular;
    }
}

// Subclasse 3
class Atacante extends Futebol {
    private int golsMarcados;
    private boolean eCanhoto;
    private String pernaPreferida;

    public int getGolsMarcados() {
        return golsMarcados;
    }

    public void setGolsMarcados(int golsMarcados) {
        this.golsMarcados = golsMarcados;
    }

    public boolean isECanhoto() {
        return eCanhoto;
    }

    public void setECanhoto(boolean eCanhoto) {
        this.eCanhoto = eCanhoto;
    }

    public String getPernaPreferida() {
        return pernaPreferida;
    }

    public void setPernaPreferida(String pernaPreferida) {
        this.pernaPreferida = pernaPreferida;
    }
}
