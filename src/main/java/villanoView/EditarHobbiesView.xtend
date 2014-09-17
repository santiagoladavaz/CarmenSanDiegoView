package villanoView

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import persona.Villano
import persona.VillanoApplicationModel

class EditarHobbiesView extends EditarCaractVillanoView {
	
	new(WindowOwner owner, VillanoApplicationModel model) {
		super(owner, model)
	}
	
	override listaAModificar() {
		"villano.hobbie"
	}
	
	override getTitle() {
		"Editar Hobbies"
	}
	
	override getNameTable() {
		"Hobbie"
	}
	
	override getAgregar() {
		modelObject.agregarValor("hobbie",modelObject.villano.hobbie)
	}
	
	override getEliminar() {
		modelObject.eliminarValor("hobbie",modelObject.villano.hobbie)
	}
	
	override protected createFormPanel(Panel arg0) {
		createContents(arg0)
	}
	
}