import javax.swing.JOptionPane;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int n1 = Integer.parseInt(JOptionPane.showInputDialog("Dígite um número"));
    int n2 = Integer.parseInt(JOptionPane.showInputDialog("Dígite outro número"));

     if(n1 > n2) {
      JOptionPane.showMessageDialog(null, "A ordem crescrente dos números digitados é: " + n2+ "," + n1+ ".");
  } else if (n2 > n1) {
      JOptionPane.showMessageDialog(null, "A ordem crescrente dos números digitados é: " + n1+ "," + n2+ "." );
       
   
    }
  }

}
