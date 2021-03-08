public class Cliente {
    
    private String nome;
    private int idade;
    private double renda;
    
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    
    public String classificarIdade() {
        
        String resposta;
        if(this.idade >= 18) {
            resposta = "Cliente é maior de idade";
        }else{
            resposta = "Cliente é menor de idade";            
        }
        return resposta;
    }
    
    public String classificarRenda() {
        
        String salario;
        if(this.renda > 15000) {
            salario = "Cliente é rico";
        }else{
            salario = "Cliente não é rico";
        }
        return salario;
    }
    
}