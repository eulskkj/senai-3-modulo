package parte2.Cliente;


public class ClientePf extends Cliente {
    private String cpf;

    public ClientePf(int codigo, String nome, String endereco, String cpf) {
        super(codigo, nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("o cpf é : " + getCpf());
        
    }
    
}