import javax.swing.JOptionPane;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int in = Integer.parseInt(JOptionPane.showInputDialog("Dígite um número"));

     if(in % 5 == 0) {
      JOptionPane.showMessageDialog(null, "O número digitado é divisível por 5!");
  } else {
      JOptionPane.showMessageDialog(null, "O número digirado não é divisível por 5");
   
    }
  }

}
