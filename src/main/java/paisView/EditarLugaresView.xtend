package paisView import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import pais.PaisApplicationModel

class EditarLugaresView extends EdicionPaisAtribView {
	
	new(WindowOwner owner, PaisApplicationModel model) {
		super(owner, model)
	}
		
	override getTitle() {
		return "Editar Lugares"
	}
	
	override getTitleTable() {
		return "Lugares de Interés"
	}
	
	override getEditableProperty() {
		"paisModel.lugares"
	}
	
	override protected createFormPanel(Panel mainPanel) {
		createContents(mainPanel)
	}
	
	override agregarLugarOConexion() {
		modelObject.agregarLugar()
	}
	
	override propertyToAdd() {
		"lugarElegido"
	}
	
	override eliminarLugarOConexion() {
		modelObject.eliminarLugar()
	}
	
	override getGetJuegoEditableProperty() {
		"lugares"
	}
	


}