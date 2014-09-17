package villanoView

import org.uqbar.arena.windows.WindowOwner
import persona.Villano
import org.uqbar.arena.widgets.Panel
import persona.VillanoApplicationModel

class EditarSeniasPartView extends EditarCaractVillanoView {
	
	new(WindowOwner owner, VillanoApplicationModel model) {
		super(owner, model)
	}
	
	override getTitle() {
		"Editar señas particulares"
	}
	
	override getNameTable() {
		"Seña"
	}
	
	
	override getAgregar() {
		modelObject.agregarValor("señas",modelObject.villano.señas)
		
	}
	
	
	override getEliminar() {
		modelObject.eliminarValor("señas",modelObject.villano.señas)
	}
	
	override listaAModificar() {
		"villano.señas"
	}
	
	override protected createFormPanel(Panel mainPanel) {
		createContents(mainPanel)
	}
	
	
	
}