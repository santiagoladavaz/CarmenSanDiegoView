package villanoView

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import persona.Villano

class EditarHobbiesView extends EditarCaractVillanoView {
	
	new(WindowOwner owner, Villano model) {
		super(owner, model)
	}
	
	override listaAModificar() {
		"hobbie"
	}
	
	override getTitle() {
		"Editar Hobbies"
	}
	
	override getNameTable() {
		"Hobbie"
	}
	
	override getAgregar() {
		modelObject.agregarValor(modelObject.valor,"hobbie",modelObject.hobbie)
	}
	
	override getEliminar() {
		modelObject.eliminarValor(modelObject.valor,"hobbie",modelObject.hobbie)
	}
	
	override protected createFormPanel(Panel arg0) {
		createContents(arg0)
	}
	
}