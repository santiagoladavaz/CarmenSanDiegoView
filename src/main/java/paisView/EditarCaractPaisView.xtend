package paisView import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.widgets.tables.Column
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.TextBox
import pais.Pais

class EditarCaractPaisView extends Dialog<Pais> {
	
	new(WindowOwner owner, Pais model) {
		super(owner, model)
		
	}
	
	override protected createFormPanel(Panel mainPanel) {
		this.setTitle("Editar Caracteristicas") 
		mainPanel.setLayout(new VerticalLayout)
		
		var Table<String> y = new Table<String>(mainPanel,String)
		y.bindItemsToProperty("caract")
		y.heigth = 100
		y.setWidth(500)
		
		new Column<String>(y)=>[
 		title='''Caracteristicas'''
 		bindContentsToTransformer([caract|caract])
	]
	
		new Button(mainPanel) => [ 
			caption = "Eliminar"
			onClick [ | modelObject.eliminarCaract(modelObject.caracteristica)
			]
			
		]	
		
		new TextBox(mainPanel).bindValueToProperty("caracteristica")
	
		new Button(mainPanel) => [ 
			caption = "Agregar"
			onClick [ | modelObject.agregarCaract(modelObject.caracteristica)]
			
		]	
	
	
		
		new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ |  this.close
			]
			
		]	
	
		
	   
	}
	
	
	
}