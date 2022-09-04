import javax.swing.JOptionPane;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int salarioBruto = Integer.parseInt(JOptionPane.showInputDialog("Informe-me o seu salário bruto, por favor."));
    int prestacao = Integer.parseInt(JOptionPane.showInputDialog("Agora me informe a prestação que deseja pagar."));

     if(prestacao <= 30/100 * salarioBruto) {
      JOptionPane.showMessageDialog(null, "Parabéns! O senhor(a) conseguiu o empréstimo");
  } else {
      JOptionPane.showMessageDialog(null, "Infelizmente não podemos liberar o empréstimo no momento" ); 
    }
  }

}
