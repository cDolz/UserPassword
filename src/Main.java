import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String user = "Carlos";
        String password = "Dolz";
        int contador = 0;
        boolean flag = false;
        do {
            String texto = JOptionPane.showInputDialog("Dime el nombre de usuario");
            if (user.equals(texto)) {
                flag = true;
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no es correcto");
                contador++;
                if (contador == 3) {
                    JOptionPane.showMessageDialog(null, "Has superado el numero de intentos");
                    return;
                }
            }
        } while (!flag);
        do {
            String texto = JOptionPane.showInputDialog("Dime la contraseña");
            if (password.equals(texto)) {
                flag = false;
            } else {
                JOptionPane.showMessageDialog(null, "La contraseña no es correcta");
                contador++;
                if (contador == 3) {
                    JOptionPane.showMessageDialog(null, "Has superado el numero de intentos");
                    return;
                }
            }
        } while (flag);
        JOptionPane.showMessageDialog(null, "Usuario y contraseña correctos!");
    }
}
