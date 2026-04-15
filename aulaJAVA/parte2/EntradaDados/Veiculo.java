package EntradaDados;

public abstract class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        if (modelo.isEmpty()){
            throw new IllegalArgumentException("Modelo não pode ser vazio!");
        }
        else if (ano<2000) {
                throw new IllegalArgumentException("Ano inválido!");
            }       
        this.modelo = modelo;
        this.ano = ano;
        }
        public abstract double calcularValor();

        public void exibir(){
            System.out.println("Modelo: "+modelo);
            System.out.println("Ano: "+ano);
            System.out.println("Valor: "+calcularValor());
        }
    }

