public class Animal {
    private String nome;
    private float comprimento;
    private int numeroDePatas;
    private String cor;
    private String ambiente;
    private float velocidadeMedia;

    public Animal(String nome, float comprimento, int numeroDePatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDePatas = numeroDePatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public void dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Número de Patas: " + numeroDePatas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade Média: " + velocidadeMedia + " m/s");
    }
}
