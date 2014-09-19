package juegoView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import persona.DetectiveApplicationModel

class ViajarView extends SimpleWindow<DetectiveApplicationModel>{
	

	
	new(WindowOwner parent, DetectiveApplicationModel model) {
		super(parent, model)
	}
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	override createMainTemplate(Panel mainPanel) {
		title = "Viajar"
		mainPanel.setLayout(new VerticalLayout)
		
			new Label(mainPanel).setText("Estas en:")
			new Label(mainPanel).bindValueToProperty("juego.detective.paisActual")
			
			
			
			
			
			new Label(mainPanel) => [ 
				text = "Recorrido Actual"
			]
		
			
			new List(mainPanel) => [
				bindItemsToProperty("juego.detective.paisActual.conexiones")
				//bindValueToProperty("nuevoDestino")
				heigth = 100
				width = 300
			]
			
			
			new Button(mainPanel) => [
				caption = "Volver al pais anterior"
				onClick = [ |  ]
			]
			
			
			new Button(mainPanel) => [
				caption = "Viajar"
				onClick = [ | this.close ]
			]
			
		
	}
	
		
}