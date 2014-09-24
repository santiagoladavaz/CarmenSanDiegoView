package juegoView


import org.uqbar.arena.windows.WindowOwner
import Juego.Juego
import org.uqbar.arena.widgets.Panel

class GanoJuegoView extends FinPartidaView {
	
	new(WindowOwner parent, Juego model) {
		super(parent, model)
	}
	
	override crearMensaje(String villano,String v) {
		"En hora buena! Ha detenido a " + villano
	}
	
	override crearCaptionBoton() {
		"Disfrutar de nuestra victoria"
	}
	
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
}