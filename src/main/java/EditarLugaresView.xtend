import org.uqbar.arena.widgets.Panel
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
	
	
	
	override protected createFormPanel(Panel mainPanel) {
		createContents(mainPanel)
	}
	


}