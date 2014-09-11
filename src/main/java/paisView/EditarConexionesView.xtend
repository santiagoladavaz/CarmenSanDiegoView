package paisView import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import pais.Pais

class EditarConexionesView extends EdicionPaisAtribView {
	
	new(WindowOwner owner, Pais model) {
		super(owner, model)
	}
	
	override getTitle() {
		return "Editar Conexiones"
	}
	
	override getTitleTable() {
		return "Conexiones"
	}
	
	
	override getEditableProperty() {
		"conexiones"
	}
	

	
	override protected createFormPanel(Panel mainPanel) {
		createContents(mainPanel)
		
	}
	
	override agregarLugarOConexion() {
		modelObject.agregarConexion(modelObject.paisElegido)
	}
	
	override propertyToAdd() {
		"paisElegido"
	}
	
	override eliminarLugarOConexion() {
		modelObject.eliminarConexion(modelObject.paisElegido)
	}
	
}