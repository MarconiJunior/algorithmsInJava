import javax.swing.JOptionPane;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Vamos calcular a área de um losango! \nSiga o exemplo de: A= (D*d)/2");
    int D = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para D"));
    int d = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para d"));
    int A = (D*d)/2;
    JOptionPane.showMessageDialog(null, "A área do losango é: " + A);
    
  }

}
