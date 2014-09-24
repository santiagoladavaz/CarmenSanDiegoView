package paisView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import pais.PaisApplicationModel

class EditarCaractPaisView extends Dialog<PaisApplicationModel> {
	
	
	
	new(WindowOwner owner, PaisApplicationModel model) {
		super(owner, model)
	}
	
	override protected createFormPanel(Panel mainPanel) {
		this.setTitle("Editar Caracteristicas") 
		mainPanel.setLayout(new VerticalLayout)
		
		
		
		new List(mainPanel) => [
			bindItemsToProperty("paisModel.caract")
			bindValueToProperty("caracteristicaAEliminar")
			heigth = 100
			width = 500
		]		
		
	
		new Button(mainPanel) => [ 
			caption = "Eliminar"
			onClick [ | modelObject.eliminarCaract ]
			
		]	
		
		new TextBox(mainPanel).bindValueToProperty("caracteristicaAAgregar")
	
		new Button(mainPanel) => [ 
			caption = "Agregar"
			onClick [ | modelObject.agregarCaract]
			
		]	
	
	
		
		new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ |  this.close
			]	
		]	  
	}
	
	
	
}