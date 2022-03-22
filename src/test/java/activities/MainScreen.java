package activities;

import org.openqa.selenium.By;

import controles.Button;
import controles.Label;

public class MainScreen {
	public Button addTareaButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
	
	private Label listaTareaConNombre;
	
	public Label itemDeLista(String nombre) {
		listaTareaConNombre = new Label(By.xpath("\r\n" + 
				"//android.widget.TextView[@text='"+nombre+"']"));
		
		return listaTareaConNombre;
	}
}
