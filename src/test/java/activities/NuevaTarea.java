package activities;

import org.openqa.selenium.By;

import controles.Button;
import controles.TextBox;

public class NuevaTarea {
	public TextBox tituloTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id='com.vrproductiveapps.whendo:id/noteTextTitle']"));
	public TextBox notasTextBox = new TextBox(By.xpath("//android.widget.EditText[@resource-id='com.vrproductiveapps.whendo:id/noteTextNotes']"));
	
	public Button saveItem = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));

}
