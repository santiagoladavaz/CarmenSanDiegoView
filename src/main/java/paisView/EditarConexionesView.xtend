package paisView

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import pais.PaisApplicationModel

class EditarConexionesView extends EdicionPaisAtribView {
	
	new(WindowOwner owner, PaisApplicationModel model) {
		super(owner, model)
	}
	
	override getTitle() {
		return "Editar Conexiones"
	}
	
	override getTitleTable() {
		return "Conexiones"
	}
	
	
	override getEditableProperty() {
		"paisModel.conexiones"
	}
	

	
	override protected createFormPanel(Panel mainPanel) {
		createContents(mainPanel)
		
	}
	
	override agregarLugarOConexion() {
		modelObject.agregarConexion()
	}
	
	override propertyToAdd() {
		"paisElegido"
	}
	
	override eliminarLugarOConexion() {
		modelObject.eliminarConexion()
	}
	
	override getGetJuegoEditableProperty() {
		"conexiones"
	}
	
}