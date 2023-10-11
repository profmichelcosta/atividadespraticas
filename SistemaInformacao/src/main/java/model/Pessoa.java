package model;
import java.util.ArrayList;

/*
 * @author Michel alves da Costa
 */
public class Pessoa {

    /**
     * @return the lista
     */
    public ArrayList<Pessoa> getLista() {
        return lista;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }
    private String nome;
    private String cpf;
    private ArrayList<Pessoa> lista = new ArrayList<>();
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
        
    }
    public Pessoa(){}
    public void imprimirPessoa(){
        
    }
    String nome_cpf="";
    public void mostrarPessoas(String nome, String cpf){
        nome_cpf+="\n Nome: "+nome+ " CPF: "+cpf+ "\n";
        
    }
    public void salvarPessoa(String nome, String cpf){
        Pessoa pessoa = new Pessoa(nome, cpf);
        getLista().add(pessoa);
    }
}
