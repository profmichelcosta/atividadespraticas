package array;

import java.util.ArrayList;
public class ColectionsArrayList {
  public static void main(String[] args) {
 
    ArrayList<String> agenda = new ArrayList();
    // [ B ] usando o método add() para gravar 4 contatos na agenda
    agenda.add("Juca Bala;11 1111-1111");
    agenda.add("Marcos Paqueta;22 2222-2222");
    agenda.add("Maria Antonieta;33 3333-3333");
    agenda.add("Antônio Conselheiro;44 4444-4444");
    
    System.out.printf("Percorrendo o ArrayList (usando o índice)\n");
    int n = agenda.size();
    for (int i=0; i<n; i++) {
      System.out.printf("Posição %d- %s\n", i, agenda.get(i));
    }
  }
}