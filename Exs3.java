import javax.swing.JOptionPane;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int in = Integer.parseInt(JOptionPane.showInputDialog("Dígite um número"));

     if(in > 0) {
      JOptionPane.showMessageDialog(null, Math.sqrt(in));
  } else {
      JOptionPane.showMessageDialog(null, in * in);
   
    }
  }

}
