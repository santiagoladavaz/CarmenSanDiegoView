package paisView import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import pais.Pais

class EditarLugaresView extends EdicionPaisAtribView {
	
	new(WindowOwner owner, Pais model) {
		super(owner, model)
	}
		
	override getTitle() {
		return "Editar Lugares"
	}
	
	override getTitleTable() {
		return "Lugares de Interés"
	}
	
	override getEditableProperty() {
		"lugares"
	}
	
	override protected createFormPanel(Panel mainPanel) {
		createContents(mainPanel)
	}
	
	override agregarLugarOConexion() {
		modelObject.agregarLugar(modelObject.lugarElegido)
	}
	
	override propertyToAdd() {
		"lugarElegido"
	}
	
	override eliminarLugarOConexion() {
		modelObject.eliminarLugar(modelObject.lugarElegido)
	}
	


}