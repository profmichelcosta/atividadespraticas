package model;
import java.util.ArrayList;

/*
 * @author Michel alves da Costa
 */
public class Pessoa {
    private String nome;
    private String cpf;
    
    ArrayList<Pessoa> lista;
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
    static String dado="";
    public String printLista(){
        
        for(Pessoa pessoa: getLista()){
            dado = "  Nome: "+ pessoa.getNome()+ " CPF: "+pessoa.getCpf()+" ";
        }
        return dado;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Pessoa> lista) {
        this.lista = lista;
    }
    public void addPessoa(Pessoa p){
        lista.add(p);
    }
}
