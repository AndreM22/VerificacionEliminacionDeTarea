package testClean;

import java.net.MalformedURLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import activities.MainScreen;
import activities.NuevaTarea;
import activities.OpcinesDeTarea;
import activities.PopUpConfirmarEliminacion;



public class WhenDoTest {
	MainScreen mainScreen = new MainScreen();
	NuevaTarea nuevaTarea = new NuevaTarea();
	OpcinesDeTarea opcionesDeTarea = new OpcinesDeTarea();
	PopUpConfirmarEliminacion popUpConfirmarEliminacion = new PopUpConfirmarEliminacion();
	
	@Test
	public void eliminarTareaTest() throws MalformedURLException {
		
		String tituloTarea= "TareaFAMM";
		String notas= "Tarea de crecion de nueva lista";
		
		
		mainScreen.addTareaButton.click();
		nuevaTarea.tituloTextBox.cleanAndSetValue(tituloTarea);
		nuevaTarea.notasTextBox.cleanAndSetValue(notas);
		
		nuevaTarea.saveItem.click();
		
		//String expectedResult = tituloTarea;
		//String actualResult = mainScreen.itemDeLista(tituloTarea).getText();
		
		//Assertions.assertEquals(expectedResult, actualResult, "ERROR no se creó la tarea");
		
		
		mainScreen.itemDeLista(tituloTarea).click();
		
		opcionesDeTarea.eliminar.click();
		popUpConfirmarEliminacion.confirmarEliminar.click();
		
		Assertions.assertFalse(mainScreen.itemDeLista(tituloTarea).isControlDisplayed());
		
		
	}

}
