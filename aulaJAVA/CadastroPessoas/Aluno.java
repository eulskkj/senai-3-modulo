package CadastroPessoas;

class Aluno extends Pessoa {
    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() { return matricula; }
    public void setMatricula(int mat) { this.matricula = mat; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(" | Matrícula: " + matricula);
    }
}
