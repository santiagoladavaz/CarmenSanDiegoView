package juegoView


import juegoView.FinPartidaView
import org.uqbar.arena.windows.WindowOwner
import Juego.Juego
import org.uqbar.arena.widgets.Panel

class PerdioJuegoView extends FinPartidaView {
	
	new(WindowOwner parent, Juego model) {
		super(parent, model)
	}
	
	override crearMensaje(String villanoAtrapado, String orden) {
		"Malas Noticias ! Ha detenido a " + villanoAtrapado + "pero usted tenia una orden contra" + orden
	}
	
	override crearCaptionBoton() {
		"Aceptar el error cometido"
	}
	
	override protected addActions(Panel actionsPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel mainPanel) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}