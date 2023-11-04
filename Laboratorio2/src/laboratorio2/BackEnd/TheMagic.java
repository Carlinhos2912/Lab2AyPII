package laboratorio2.BackEnd;

public class TheMagic {
    static Admin CorrectCredentials = new Admin();
    
    
    public static void Autentication (Admin TryCrendentials){
        if ((TryCrendentials.getUser().equalsIgnoreCase(CorrectCredentials.getUser())) && (TryCrendentials.getPassword().equals(CorrectCredentials.getPassword()))) {
            //PopUp con diciendo que inició sesión correctamente
            //Borrar los campos del login
            //Cerrar el login
            //Abrir la vista de administrador
        }else{
            //PopUp con error al incio de sesión
            //Borrar el campo de contraseña
        }
    }
    
}
