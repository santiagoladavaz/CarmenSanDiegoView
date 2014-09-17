package villanoView 
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import persona.Villano
import Juego.Juego

class NuevoVillanoView extends VillanoAbstractView{
	
	new (WindowOwner w,Villano v){
		super(w,v)
	}

	override getTitle() {
			return "Expedientes - Nuevo Villano"
	}
	
	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override procesar(Juego j, Villano v) {
		j.agregarVillano(v)
	}
	
	}