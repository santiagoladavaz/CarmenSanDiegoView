package juegoView

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import pais.Lugar

import org.uqbar.arena.widgets.Label
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.windows.SimpleWindow

class VentanaPistasView extends SimpleWindow<Lugar>{
	
	new(WindowOwner owner, Lugar model) {
		super(owner, model)
	}
	
	override protected createMainTemplate(Panel mainPanel) {
		this.setTitle(modelObject.toString)
		mainPanel.setLayout(new VerticalLayout)	
		mainPanel.width = 300
		
		
		//hay que corregir esto que se ve horrible!! - Buscar una manera de agrandar el label,
		// si hay que bindearlo a una propiedad entonces hay que cambiar cosas del modelo!
		new Label(mainPanel).setText(modelObject.ocupanteInforma)
		
		new Button(mainPanel) => [
			caption = "Aceptar"
			onClick = [|this.close()]
			]
	}
	
	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
}