package villanoView

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import persona.Villano
import Juego.Juego

class EditarVillanoView extends VillanoAbstractView{
	
	new(WindowOwner w,Villano v){
		super(w,v)
	}

	override getTitle() {
			return "Expedientes - Editar Villano"
	}
	
	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override procesar(Juego j, Villano v) {
		/**
		 * DO NOTHING
		 */
	}
	
}