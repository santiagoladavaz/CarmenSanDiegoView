package paisView import pais.Pais
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import Juego.Juego

class EditarPaisView extends VentanaPaisView {
	
	new(WindowOwner m,Pais model) {
		super(m,model)
	}
	
	override getTitle() {
		return "MapaMundi - Editar Pais"
	}
	
	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override procesar(Juego j, Pais p) {
		/**
		 * DO NOTHING
		 */
	}
	
}