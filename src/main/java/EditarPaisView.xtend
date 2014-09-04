import pais.Pais

class EditarPaisView extends VentanaPaisView {
	
	new(Pais model) {
		super(model)
	}
	
	override getTitle() {
		return "MapaMundi - Editar Pais"
	}
	
	def static main(String[] args) {
		new EditarPaisView(new Pais).startApplication
	}
	
}