package laboratorio2.BackEnd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JTable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.Icon;
import laboratorio2.BackEnd.Clientes;
import javax.swing.table.DefaultTableModel;
import laboratorio2.FrontEnd.MainFrame;
import static laboratorio2.FrontEnd.MainFrame.PopUp_Base;
import static laboratorio2.FrontEnd.MainFrame.Table_CarsList;
import static laboratorio2.FrontEnd.MainFrame.automobileRecords;
import static laboratorio2.FrontEnd.MainFrame.clientsRecords;
import static laboratorio2.FrontEnd.MainFrame.salesRecords;
import laboratorio2.BackEnd.Autos;

public class TheMagic {

    public static Admin CorrectCredentials = new Admin();

    //Procedimiento para autenticar el login de administrador
    public static void Autentication(Admin TryCrendentials) {
        if ((TryCrendentials.getUser().equalsIgnoreCase(CorrectCredentials.getUser())) && (TryCrendentials.getPassword().equals(CorrectCredentials.getPassword()))) {
            //PopUp con diciendo que inició sesión correctamente
            PopUp_Base.setTitle("Inicio de sesión correcto");
            Icon icon = MainFrame.ImgGetter_LoginCorrecto.getIcon();
            MainFrame.Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setVisible(true);
            //Borrar los campos del login
            MainFrame.Pfield_AdminPassword.setText("");
            //Cerrar el login
            MainFrame.IntFrame_AdminLogin.setVisible(false);
            //Abrir la vista de administrador
            MainFrame.IntFrame_ClientView.setVisible(false);
            MainFrame.IntFrame_AdminView.setVisible(true);
        } else {
            //PopUp con error al incio de sesión
            PopUp_Base.setTitle("Inicio de sesión incorrecto");
            Icon icon = MainFrame.ImgGetter_LoginIncorrecto.getIcon();
            MainFrame.Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setVisible(true);
            //Borrar el campo de contraseña
            MainFrame.Pfield_AdminPassword.setText("");
        }
    }

    //Procedimiento para autenticar cambio de contraseña
    public static void AutenticatePasswordChange(String LastPassword, String NewPassword, String ConfirmPassword) {
        if ((LastPassword.equals(CorrectCredentials.getPassword())) && (NewPassword.equals(ConfirmPassword)) && !(NewPassword.equals(""))) {
            //Cambiar credenciales
            CorrectCredentials.setPassword(NewPassword);
            //PopUp con diciendo que se cambió la contraseña correctamente
            PopUp_Base.setTitle("Cambio de contraseña correcto");
            //Icon icon = MainFrame.ImgGetter_CambioContraseñaCorrecto.getIcon();
            //MainFrame.Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setVisible(true);
            //Borrar los campos del cambio
            MainFrame.Pfield_LastPassword.setText("");
            MainFrame.Pfield_NewPassword.setText("");
            MainFrame.Pfield_ConfirmNewPassword.setText("");
            //Volver al login de administrador
            MainFrame.IntFrame_PasswordChange.setVisible(false);
            MainFrame.IntFrame_AdminLogin.setVisible(true);
        } else {
            //PopUp con error al incio de sesión
            PopUp_Base.setTitle("Cambio de contraseña incorrecto");
            //Icon icon = MainFrame.ImgGetter_CambioContraseñaCorrecto.getIcon();
            //MainFrame.Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setVisible(true);
            //Borrar el campo de contraseña
            MainFrame.Pfield_LastPassword.setText("");
            MainFrame.Pfield_NewPassword.setText("");
            MainFrame.Pfield_ConfirmNewPassword.setText("");
        }
    }

    public static DefaultTableModel dtm = new DefaultTableModel();
    public static String[] Header = {"Placa", "Modelo", "Color", "Precio"};

    public static DefaultTableModel SetDtm() {
        dtm.setColumnIdentifiers(Header);
        return dtm;
    }

    public static void UpdateCarsList(ArrayList<Autos> CarsList, JTable View) {
        dtm = SetDtm();
        View.setModel(dtm);
        for (int i = 0; i < dtm.getRowCount(); i++) {
            dtm.removeRow(i);
        }

        Object[] NewCarsRow = new Object[Header.length];
        for (int i = 0; i < CarsList.size(); i++) {
            NewCarsRow = Autos.createTableItem(CarsList.get(i), NewCarsRow);
            dtm.addRow(NewCarsRow);
        }
    }

    public static String ShowSelectedCar(int SelectedRow, JTable View) {
        if (SelectedRow < 0) {
            return "<html><font color = 'White'>No hay nigun auto seleccionado</font></html>";
        } else {
            return "<html><font color = 'White'>Placa: " + View.getModel().getValueAt(SelectedRow, 0) + "<br>"
                    + "Modelo: " + View.getModel().getValueAt(SelectedRow, 1) + " <br>"
                    + "Color: " + View.getModel().getValueAt(SelectedRow, 2) + " <br>"
                    + "Precio: " + View.getModel().getValueAt(SelectedRow, 3) + ".</font></html>";
        }
    }

    public static boolean AtenticateClientRegister(long ID, String Nombres, String Apellidos, String FechaDeNacimiento, String Email, long Telefono, String Direccion) {
        //Si campos vacios 
        if (ID == 0 || Nombres.equals("") || Apellidos.equals("") || FechaDeNacimiento.equals("") || Email.equals("") || Telefono == 0 || Direccion.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean AtenticateSalesRegister(long NumVenta, long IdComprador, String AutoVendido, String FechaYhoraDeLaVenta) {
        //Si campos vacios 
        if (NumVenta == 0 || IdComprador == 0 || AutoVendido == "" || FechaYhoraDeLaVenta == "") {
            return false;
        } else {
            return true;
        }
    }

    public static void ComprarAuto() {

        Clientes Comprador = new Clientes();
        boolean onList = false;
        int index = 0;
        for (int i = 0; i < clientsRecords.size(); i++) {
            if (Long.parseLong(MainFrame.TField_ClientIdentification_Buy.getText()) == clientsRecords.get(i).getID()) {
                index = i;
                onList = true;
                break;
            }
        }
        if (onList) {
            //Si esta en lista se toma como el nuevo comprador
            Comprador = clientsRecords.get(index);
        } else {
            //Llenas los datos del comprador
            Comprador.setID(Long.parseLong(MainFrame.TField_ClientIdentification_Buy.getText()));
            Comprador.setNombres(MainFrame.TField_ClientName_Buy.getText());
            Comprador.setApellidos(MainFrame.TField_ClientLastname_Buy.getText());
            Comprador.setFechaDeNacimiento(MainFrame.TField_ClientBirthday_Buy.getText());
            Comprador.setEmail(MainFrame.TField_ClientEmail_Buy.getText());
            Comprador.setTelefono(Long.parseLong(MainFrame.TField_ClientPhoneNumber_Buy.getText()));
            Comprador.setDireccion(MainFrame.TField_ClientAdress_Buy.getText());
            //Lo metes en el arraylist
            if (TheMagic.AtenticateClientRegister(Comprador.getID(), Comprador.getNombres(), Comprador.getApellidos(), Comprador.getFechaDeNacimiento(), Comprador.getEmail(), Comprador.getTelefono(), Comprador.getDireccion())) {
                clientsRecords.add(Comprador);
            } else {
                PopUp_Base.setTitle("Error");
                Icon icon = MainFrame.ImgGetter_ErrorAlComprar.getIcon();
                MainFrame.Lbl_PopUp_Base.setIcon(icon);
                PopUp_Base.setVisible(true);
            }
        }
        //Creas Nueva venta
        Ventas Venta = new Ventas();
        //Llenas los datos de la venta
        Venta.setNumVenta(salesRecords.size() + 1);
        Venta.setIdComprador(Comprador.getID());
        Venta.setAutoVendido(String.valueOf(Table_CarsList.getModel().getValueAt(Table_CarsList.getSelectedRow(), 0)));
        Venta.setNombreDelVendedor(TheMagic.CorrectCredentials.getUser());
        Venta.setFechaYhoraDeLaVenta("" + LocalDateTime.of(LocalDate.now(), LocalTime.now()));
        for (int i = 0; i < automobileRecords.size(); i++) {
            if (automobileRecords.get(i).getPlaca().equals(Venta.getAutoVendido())) {
                Venta.setPagoTotal(automobileRecords.get(i).getPrecioDeVenta());
                Venta.setBalance(automobileRecords.get(i).getPrecioDeVenta() - automobileRecords.get(i).getPrecioDeCompra());
            }
        }
        if (TheMagic.AtenticateSalesRegister(Venta.getNumVenta(), Venta.getIdComprador(), Venta.getAutoVendido(), Venta.getFechaYhoraDeLaVenta())) {
            salesRecords.add(Venta);
            PopUp_Base.setTitle("Compra correcta");
            Icon icon = MainFrame.ImgGetter_CompraCorrecta.getIcon();
            MainFrame.Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setVisible(true);
            //Mostrar un popUpconFondo vacío con los datos de la venta
        } else {
            PopUp_Base.setTitle("Error");
            Icon icon = MainFrame.ImgGetter_ErrorAlComprar.getIcon();
            MainFrame.Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setVisible(true);
        }
        //Limpiar los campos
        MainFrame.TField_ClientIdentification_Buy.setText("");
        MainFrame.TField_ClientName_Buy.setText("");
        MainFrame.TField_ClientLastname_Buy.setText("");
        MainFrame.TField_ClientBirthday_Buy.setText("");
        MainFrame.TField_ClientEmail_Buy.setText("");
        MainFrame.TField_ClientPhoneNumber_Buy.setText("");
        MainFrame.TField_ClientAdress_Buy.setText("");
        MainFrame.IntFrame_BuyACar.setVisible(false);

    }

    public static boolean containsSpecialCharacters(String str) {
        // Permitir letras (mayúsculas y minúsculas), números, comas, puntos y espacios
        String regex = "^[a-zA-Z0-9, .]+$";
        return !Pattern.matches(regex, str);
    }

    public static void RegisterCar(String placa, String color, String marca, String nombreModelo, String añoLanzamientoStr, String precioCompraStr, String precioVentaStr) {

// Verificar si ya existe un automóvil con la misma placa
        for (Autos registro : automobileRecords) {
            if (registro.getPlaca().equals(placa)) {
                //No se encontró la placa
                return;
            }
        }
        String incompleteField = null;

        if (placa.isEmpty()) {
            incompleteField = "Placa";
        } else if (color.isEmpty()) {
            incompleteField = "Color";
        } else if (marca.isEmpty()) {
            incompleteField = "Marca";
        } else if (nombreModelo.isEmpty()) {
            incompleteField = "Nombre del Modelo";
        } else if (añoLanzamientoStr.isEmpty()) {
            incompleteField = "Año de Lanzamiento";
        } else if (precioCompraStr.isEmpty()) {
            incompleteField = "Precio de Compra";
        } else if (precioVentaStr.isEmpty()) {
            incompleteField = "Precio de Venta";
        }

        if (incompleteField != null) {
            //Colocar "campos imcompletos"
            return;
        }

        if (containsSpecialCharacters(placa) || containsSpecialCharacters(color)
                || containsSpecialCharacters(marca) || containsSpecialCharacters(nombreModelo)
                || containsSpecialCharacters(añoLanzamientoStr) || containsSpecialCharacters(precioCompraStr)
                || containsSpecialCharacters(precioVentaStr)) {
            //COLOCAR POPUP "CARACTERES ESPECIALES"
            return;
        }

        // Validar y convertir los valores ingresados
        int añoLanzamiento;
        double precioCompra;
        double precioVenta;

        try {
            añoLanzamiento = Integer.parseInt(añoLanzamientoStr);
            precioCompra = Double.parseDouble(precioCompraStr.replace(',', '.'));
            precioVenta = Double.parseDouble(precioVentaStr.replace(',', '.'));
        } catch (NumberFormatException e) {

            return;
        }

        // Concatenar la información del modelo
        String modelostr = marca + "," + nombreModelo + "," + añoLanzamiento;

        // Crear un objeto de tipo Autos con la información
        Autos registro = new Autos();
        registro.setPlaca(placa);
        registro.setColor(color);
        registro.setModelo(modelostr);
        registro.setPrecioDeCompra(precioCompra);
        registro.setPrecioDeVenta(precioVenta);

        // Agregar el registro a la lista de automóviles
        automobileRecords.add(registro);
        // Limpiar los campos de entrada y mostrar un mensaje de éxito
        MainFrame.TField_Placa.setText("");
        MainFrame.TField_Color.setText("");
        MainFrame.TField_Marca.setText("");
        MainFrame.TField_NombreModelo.setText("");
        MainFrame.TField_AñoAuto.setText("");
        MainFrame.TField_PrecioCompra.setText("");
        MainFrame.TField_PreciodeVenta.setText("");
        //colocar el popup "Auto Registrado"
    }

    public static void EliminarPorPlaca(String placa) {
        for (Autos registro : automobileRecords) {
            if (registro.getPlaca().equalsIgnoreCase(placa)) {
                automobileRecords.remove(registro);
                //COLOCAR POPUP "AUTOELIMINADO"
                return;
            }
        }
        //COLOCAR POPUP "No se encontró un auto con la placa"
    }

    public static void ModifyCar(String placa, String color, String marca, String nombreModelo, String añoLanzamientoStr, String precioCompraStr, String precioVentaStr) {

        // Bucle para buscar el carro con la placa
        boolean carroEncontrado = false;
        for (Autos auto : automobileRecords) {
            if (auto.getPlaca().equalsIgnoreCase(placa)) {
                carroEncontrado = true;

                // leee valores de campos de entrada
                // Actualiza los campos del automóvil solo si no están vacíos
                if (!color.isEmpty()) {
                    auto.setColor(color);
                }
                if (!marca.isEmpty()) {
                    String[] modeloParts = auto.getModelo().split(",");
                    auto.setModelo(marca + "," + modeloParts[1] + "," + modeloParts[2]);
                }
                if (!nombreModelo.isEmpty()) {
                    String[] modeloParts = auto.getModelo().split(",");
                    auto.setModelo(modeloParts[0] + "," + nombreModelo + "," + modeloParts[2]);
                }
                if (!añoLanzamientoStr.isEmpty()) {
                    try {
                        int añoLanzamiento = Integer.parseInt(añoLanzamientoStr);
                        String[] modeloParts = auto.getModelo().split(",");
                        auto.setModelo(modeloParts[0] + "," + modeloParts[1] + "," + añoLanzamiento);
                    } catch (NumberFormatException e) {

                    }
                }
                if (!precioCompraStr.isEmpty()) {
                    try {
                        double precioCompra = Double.parseDouble(precioCompraStr.replace(',', '.'));
                        auto.setPrecioDeCompra(precioCompra);
                    } catch (NumberFormatException e) {

                    }
                }

               

                if (!precioVentaStr.isEmpty()) {
                    try {
                        double precioVenta = Double.parseDouble(precioVentaStr.replace(',', '.'));
                        auto.setPrecioDeVenta(precioVenta);
                        //POPUP "modificados con éxito"
                        break;
                    } catch (Exception e) {
                    }
                }

                if (!carroEncontrado) {
                    //POP UP NO SE ECONTRO AUTO CON LA PLACA
                    
                }
                MainFrame.TField_Placa.setText("");
                MainFrame.TField_Color.setText("");
                MainFrame.TField_Marca.setText("");
                MainFrame.TField_NombreModelo.setText("");
                MainFrame.TField_AñoAuto.setText("");
                MainFrame.TField_PrecioCompra.setText("");
                MainFrame.TField_PreciodeVenta.setText("");

            }
        }

    }
}
