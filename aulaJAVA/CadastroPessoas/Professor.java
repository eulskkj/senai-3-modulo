package CadastroPessoas;

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disc) { this.disciplina = disc; }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(" | Disciplina: " + disciplina);
    }
}