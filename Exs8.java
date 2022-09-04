import javax.swing.JOptionPane;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 0; i < 20; i++){
     int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade"));
      if (idade >= 18){
        count++;
      }
      
    }
    JOptionPane.showMessageDialog(null, "O número de pessoas com 18 anos ou mais é: " + count);
  }

}
