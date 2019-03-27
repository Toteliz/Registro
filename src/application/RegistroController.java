package application;

import java.net.MalformedURLException;



import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class RegistroController {
	@FXML
	private TextField NombreField;
	@FXML
	private TextField EmailField;
	@FXML
	private Button botonRegistro;
	@FXML
	private TextField PassField;
	@FXML
	private Button BotonSalir;
	
	
	@FXML
	public void initialize() throws MalformedURLException {

		System.out.println("Ejecutando");

		
	}
	

	@FXML
	public void setNombre() {
		NombreField.setText(NombreField.getText());
		
	}

	

	public void setEmail() {
		EmailField.setText(EmailField.getText());
	}

	

	public void setPass() {
		PassField.setText(PassField.getText());
	}
	
	@FXML
	public void botonRegistro()
	{
		
		System.out.println("Presionaste el boton Registro");
		System.out.println("Hola " + NombreField.getText());
		System.out.println("Te Escribo a: " + EmailField.getText());
		
	}
	@FXML
	public void botonSalir()
	{
		System.exit(0);
	}
}
	

