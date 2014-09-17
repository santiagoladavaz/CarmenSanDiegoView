package paisView import pais.Pais
import pais.Banco
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import Juego.Juego

class NewPaisView extends VentanaPaisView{
	
	new(WindowOwner w) {
		super(w,new Pais)
	}
	
	override getTitle() {
		return "MapaMundi - Nuevo Pais"
	}

	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override procesar(Juego j, Pais p) {
		j.agregarPais(p)
	}
	
}