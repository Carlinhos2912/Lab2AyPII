package laboratorio2.BackEnd;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import javax.swing.JTable;
import java.util.ArrayList;
import javax.swing.Icon;
import laboratorio2.BackEnd.Clientes;
import javax.swing.table.DefaultTableModel;
import laboratorio2.FrontEnd.MainFrame;
import static laboratorio2.FrontEnd.MainFrame.PopUp_Base;
import static laboratorio2.FrontEnd.MainFrame.Table_CarsList;
import static laboratorio2.FrontEnd.MainFrame.automobileRecords;
import static laboratorio2.FrontEnd.MainFrame.clientsRecords;
import static laboratorio2.FrontEnd.MainFrame.salesRecords;

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

    public static void UpdateCarsList(ArrayList<Autos> CarsList, JTable View) {
        DefaultTableModel dtm = new DefaultTableModel();
        String[] Header = {"Placa", "Modelo", "Color", "Precio"};
        dtm.setColumnIdentifiers(Header);
        View.setModel(dtm);
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

    public static boolean AtenticateClientRegister(int ID, String Nombres, String Apellidos, String FechaDeNacimiento, String Email, int Telefono, String Direccion) {
        //Si campos vacios 
        if (ID == 0 || Nombres.equals("") || Apellidos.equals("") || FechaDeNacimiento.equals("") || Email.equals("") || Telefono == 0 || Direccion.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean AtenticateSalesRegister(long NumVenta, int IdComprador, String AutoVendido, String FechaYhoraDeLaVenta, double ValorTotal) {
        //Si campos vacios 
        if (NumVenta == 0 || IdComprador == 0 || AutoVendido == "" || FechaYhoraDeLaVenta == "" || ValorTotal == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void ComprobarCampos() {

    }

    public static void ComprarAuto() {
        
        Clientes Comprador = new Clientes();
        //Llenas los datos del comprador
        try {
            Comprador.setID(Integer.parseInt(MainFrame.TField_ClientIdentification_Buy.getText()));
            Comprador.setNombres(MainFrame.TField_ClientName_Buy.getText());
            Comprador.setApellidos(MainFrame.TField_ClientLastname_Buy.getText());
            Comprador.setFechaDeNacimiento(MainFrame.TField_ClientBirthday_Buy.getText());
            Comprador.setEmail(MainFrame.TField_ClientEmail_Buy.getText());
            Comprador.setTelefono(Integer.parseInt(MainFrame.TField_ClientPhoneNumber_Buy.getText()));
            Comprador.setDireccion(MainFrame.TField_ClientAdress_Buy.getText());
        } catch (Exception e) {
            System.out.println("eooooooo");
        }

        //Lo metes en el arraylist
        if (TheMagic.AtenticateClientRegister(Comprador.getID(), Comprador.getNombres(), Comprador.getApellidos(), Comprador.getFechaDeNacimiento(), Comprador.getEmail(), Comprador.getTelefono(), Comprador.getDireccion())) {
            clientsRecords.add(Comprador);
            //Icon icon = new ImageIcon(getClass().getResource("/media/POPUPS/"));
            //Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setTitle("Registro de cliente correcto");
            PopUp_Base.setVisible(true);
        } else {
            //Icon icon = new ImageIcon(getClass().getResource("/media/POPUPS/"));
            //Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setTitle("Registro de cliente incorrecto");
            PopUp_Base.setVisible(true);
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
                Venta.setValorTotal(automobileRecords.get(i).getPrecioDeVenta() - automobileRecords.get(i).getPrecioDeCompra());
            }
        }
        System.out.println(Venta.getNumVenta() + "\t" + Venta.getIdComprador() + "\t" + Venta.getAutoVendido() + "\t" + Venta.getNombreDelVendedor() + "\t" + Venta.getFechaYhoraDeLaVenta() + "\t" + Venta.getValorTotal());
        if (TheMagic.AtenticateSalesRegister(Venta.getNumVenta(), Venta.getIdComprador(), Venta.getAutoVendido(), Venta.getFechaYhoraDeLaVenta(), Venta.getValorTotal())) {
            salesRecords.add(Venta);
            //Icon icon = new ImageIcon(getClass().getResource("/media/POPUPS/"));
            //Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setTitle("Registro de venta correcto");
            PopUp_Base.setVisible(true);
        } else {
            //Icon icon = new ImageIcon(getClass().getResource("/media/POPUPS/"));
            //Lbl_PopUp_Base.setIcon(icon);
            PopUp_Base.setTitle("Registro de venta incorrecto");
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
    }
}
