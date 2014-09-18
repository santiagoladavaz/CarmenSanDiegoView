package juegoView

import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import Juego.Juego
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button

class InicioJuegoView extends SimpleWindow<Juego>{
	
	new(WindowOwner parent, Juego model) {
		super(parent, model)
	}
	
	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override createMainTemplate(Panel mainPanel){
		
		this.setTitle(modelObject.casoSeleccionado.nombre)
		new Label(mainPanel).bindValueToProperty("casoSeleccionado.descripcion")
		
		new Button(mainPanel) => [
			caption = "Aceptar caso"
			onClick [ |
				new ResolverMisterioView(this,modelObject).open
				this.close
			]
		]
		
		
		
	}
	
}