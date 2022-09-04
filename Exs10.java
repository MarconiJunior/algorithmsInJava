import javax.swing.JOptionPane;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Vamos transformar medidas!");
    double pol = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor em polegada, por favor."));
    double centimetro = pol * 2.54;
    JOptionPane.showMessageDialog(null, "O valor em centímetros da medida inserida é: " + centimetro);
    
  }

}
