
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;


public class ListaComButtonUI extends JFrame {
    private List<Pessoa> lista = new ArrayList<>();
    private DefaultListModel<Pessoa> listModel = new DefaultListModel<>();
    private JList<Pessoa> listaJList;
    private JTextField nomeTextField;
    private JTextField cpfTextField;
    private JButton addButton;
    private JTextArea textArea;

    public ListaComButtonUI() {
        // ...

        nomeTextField = new JTextField(10);
        cpfTextField = new JTextField(10);

        // ...

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeTextField.getText();
                String cpf = cpfTextField.getText();
                if (!nome.isEmpty() && !cpf.isEmpty()) {
                    Pessoa pessoa = new Pessoa(nome, cpf);
                    lista.add(pessoa);
                    listModel.addElement(pessoa);
                    nomeTextField.setText("");
                    cpfTextField.setText("");
                    atualizarTextArea();
                }
            }
        });

        // ...

        atualizarTextArea();
    }

    private void atualizarTextArea() {
        textArea.setText("");
        for (Pessoa pessoa : lista) {
            textArea.append(pessoa.toString() + "\n");
        }
    }

    // ...

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ListaComButtonUI app = new ListaComButtonUI();
                app.setVisible(true);
            }
        });
    }
}
