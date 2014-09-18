package juegoView

import org.uqbar.arena.windows.SimpleWindow
import Juego.Juego
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button

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
		
		new Label(mainPanel).setText("Villano:")
		new Selector(mainPanel) => [
			allowNull = false
			bindItemsToProperty("villanos")
			bindValueToProperty("detective.ordenDeArresto")
		]
		
		
			new Button(mainPanel) => [
			caption = "Generar Orden De Arresto"
			onClick [ |this.close]
		
		]
	
	}
}