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
		modelObject.agregarValor(modelObject.valor,"señas",modelObject.señas)
		print(modelObject.señas)
		
	}
	
	
	
	override getEliminar() {
		modelObject.eliminarValor(modelObject.valor,"señas",modelObject.señas)
	}
	
	override listaAModificar() {
		"señas"
	}
	
	override protected createFormPanel(Panel mainPanel) {
		createContents(mainPanel)
	}
	
	
	
}