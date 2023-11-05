package laboratorio2.BackEnd;
import laboratorio2.FrontEnd.MainFrame;

public class TheMagic {
    public static Admin CorrectCredentials = new Admin();
    
    public static void Autentication (Admin TryCrendentials){
        if ((TryCrendentials.getUser().equalsIgnoreCase(CorrectCredentials.getUser())) && (TryCrendentials.getPassword().equals(CorrectCredentials.getPassword()))) {
            //PopUp con diciendo que inició sesión correctamente
            MainFrame.PopUp_AdminLogin.setTitle("Login Correcto");
            MainFrame.Lbl_PopUp_Base.setText("Ingresaste correctamente.");
            MainFrame.PopUp_AdminLogin.setVisible(true);
            //Borrar los campos del login
            MainFrame.Pfield_AdminPassword.setText("");
            //Cerrar el login
            MainFrame.IntFrame_AdminLogin.setVisible(false);
            //Abrir la vista de administrador
            MainFrame.IntFrame_ClientView.setVisible(false);
            MainFrame.IntFrame_AdminView.setVisible(true);
        }else{
            //PopUp con error al incio de sesión
            MainFrame.PopUp_AdminLogin.setTitle("Login Incorrecto");
            MainFrame.Lbl_PopUp_Base.setText("El usuario o la contraseña tan mal.");
            MainFrame.PopUp_AdminLogin.setVisible(true);
            //Borrar el campo de contraseña
            MainFrame.Pfield_AdminPassword.setText("");
        }
    }
    
    public static void AutenticatePasswordChange (String LastPassword, String NewPassword, String ConfirmPassword){
        if ((LastPassword.equals(CorrectCredentials.getPassword())) && (NewPassword.equals(ConfirmPassword)) && !(NewPassword.equals(""))) {
            //Cambiar credenciales
            CorrectCredentials.setPassword(NewPassword);
            //PopUp con diciendo que se cambió la contraseña correctamente
            MainFrame.PopUp_AdminLogin.setTitle("Cambio Correcto");
            MainFrame.Lbl_PopUp_Base.setText("Cambiaste correctamente la contraseña.");
            MainFrame.PopUp_AdminLogin.setVisible(true);
            //Borrar los campos del cambio
            MainFrame.Pfield_LastPassword.setText("");
            MainFrame.Pfield_NewPassword.setText("");
            MainFrame.Pfield_ConfirmNewPassword.setText("");
            //Volver al login de administrador
            MainFrame.IntFrame_PasswordChange.setVisible(false);
            MainFrame.IntFrame_AdminLogin.setVisible(true);
        }else{
            //PopUp con error al incio de sesión
            MainFrame.PopUp_AdminLogin.setTitle("Cambio Incorrecto");
            MainFrame.Lbl_PopUp_Base.setText("Alguna de las tres contraseñas esta mal...");
            MainFrame.PopUp_AdminLogin.setVisible(true);
            //Borrar el campo de contraseña
            MainFrame.Pfield_LastPassword.setText("");
            MainFrame.Pfield_NewPassword.setText("");
            MainFrame.Pfield_ConfirmNewPassword.setText("");
        }
    }
    
}
