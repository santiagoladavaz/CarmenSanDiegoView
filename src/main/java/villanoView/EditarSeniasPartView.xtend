package villanoView

import org.uqbar.arena.windows.WindowOwner
import persona.Villano
import org.uqbar.arena.widgets.Panel

class EditarSeniasPartView extends EditarCaractVillanoView {
	
	new(WindowOwner owner, Villano model) {
		super(owner, model)
	}
	
	override getTitle() {
		"Editar señas particulares"
	}
	
	override getNameTable() {
		"Seña"
	}
	
	
	override getAgregar() {
		modelObject.agregarValor("villano.señas",modelObject.villano.señas)
		
	}
	
	
	override getEliminar() {
		modelObject.eliminarValor("villano.señas",modelObject.villano.señas)
	}
	
	override listaAModificar() {
		"villano.señas"
	}
	
	override protected createFormPanel(Panel mainPanel) {
		createContents(mainPanel)
	}
	
	
	
}