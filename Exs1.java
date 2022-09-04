import javax.swing.JOptionPane;

class Main {
  public static void main(String[] args) {
    int in = Integer.parseInt(JOptionPane.showInputDialog("Dígite um número"));

     if(in > 0) {
      JOptionPane.showMessageDialog(null, "O número digitado é positivo!");
  } else if (in < 0) {
      JOptionPane.showMessageDialog(null, "O número digitado é negativo!");
    } else {
      JOptionPane.showMessageDialog(null, "O número digitado é neutro");
    }
  }

}
