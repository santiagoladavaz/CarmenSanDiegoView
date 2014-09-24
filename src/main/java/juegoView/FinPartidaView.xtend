package juegoView

import Juego.Juego
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner

abstract class FinPartidaView extends SimpleWindow<Juego>{
	
	new(WindowOwner parent, Juego model) {
		super(parent, model)
	}
	
	def abstract String crearMensaje(String villano,String otroVillano)
	
	def abstract String crearCaptionBoton() 
	
	override createMainTemplate(Panel mainPanel){
		
		this.setTitle(modelObject.casoSeleccionado.nombre + " - Resuelto")
		
		new Label(mainPanel).
			setText(
				crearMensaje(modelObject.villano.nombre,modelObject.detective.ordenDeArresto.nombre)
			)
		
		new Button(mainPanel) => [
			caption = crearCaptionBoton
			onClick [ |
				
				
				new InicioJuegoView(this).open
				this.close
			]
		]
	
	}
	
}