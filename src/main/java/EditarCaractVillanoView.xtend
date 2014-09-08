import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.widgets.tables.Column
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import persona.Villano

abstract class EditarCaractVillanoView extends Dialog<Villano> {
	
	new(WindowOwner owner, Villano model) {
		super(owner, model)
		
	}
	
	abstract def String listaAModificar()
	
	abstract override def String getTitle()
	
	abstract def String getNameTable()
	
	abstract def void getAgregar()
	
	abstract def void getEliminar()
	
	override createContents(Panel mainPanel) {
		this.setTitle(this.getTitle())
		mainPanel.setLayout(new VerticalLayout)	
		var Table<String> y = new Table<String>(mainPanel,String)
		y.bindItemsToProperty(this.listaAModificar())
		y.heigth = 100
		y.setWidth(500)
		
		new Column<String>(y)=>[
 		title= this.getNameTable()
 		bindContentsToTransformer([seña|seña])
	]
	
		new Button(mainPanel) => [ 
			caption = "Eliminar"
			onClick [ | this.getEliminar()
			]
			
		]	
		
		new TextBox(mainPanel).bindValueToProperty("valor")
	
		new Button(mainPanel) => [ 
			caption = "Agregar"
			onClick [ | this.getAgregar()
						
						// Agrega valores vacios - Modificarlo       
			]
			
		]	
	
	
		
		new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ | 
				        this.close
			        ]
			
		]	
	
		
	   
	}
}