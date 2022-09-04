import javax.swing.JOptionPane;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Dígite um número"));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Dígite outro número"));

     if(n1 > n2) {
      JOptionPane.showMessageDialog(null, "A raiz quadrada do maior número digitado é: " + Math.sqrt(n1));
       JOptionPane.showMessageDialog(null, "O quadrado do menor número digitado é: " + n2 * n2);
  } else if (n2 > n1) {
      JOptionPane.showMessageDialog(null, "A raiz quadrada do maior número digitado é: " + Math.sqrt(n2) );
       JOptionPane.showMessageDialog(null, "O quadrado do menor número digitado é: " + n1 * n1);
   
    }
  }

}
