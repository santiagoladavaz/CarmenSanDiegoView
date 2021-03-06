package juegoView

import Juego.Juego
import components.SelectorComp
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner

class OrdenDeArrestoView extends SimpleWindow<Juego> {
	
	new(WindowOwner parent, Juego model) {
		super(parent, model)
	}
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	override createMainTemplate(Panel mainPanel){
		
		this.setTitle(modelObject.casoSeleccionado.nombre)
		
		new Label(mainPanel).setText("Orden emitida contra: ")
		new Label(mainPanel).bindValueToProperty("detective.ordenDeArresto")
		
		
		new SelectorComp(mainPanel,"Villano:","villanos","detective.ordenDeArresto")
		
		
		new Button(mainPanel) => [
			caption = "Generar Orden De Arresto"
			onClick [ |this.close]
		]
	
	}
}