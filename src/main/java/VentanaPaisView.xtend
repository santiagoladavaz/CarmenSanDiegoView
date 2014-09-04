import pais.Pais
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.widgets.tables.Column

abstract class VentanaPaisView extends MainWindow<Pais> {
	
	
	
	
	new(Pais model) {
		super(model)
	}
	
	abstract override def String getTitle()
	
	override createContents(Panel mainPanel) {
		this.setTitle(this.getTitle())
		mainPanel.setLayout(new VerticalLayout)	
		
	
	
	new Label(mainPanel).setText("Nombre:")
	
	new TextBox(mainPanel).bindValueToProperty("nombre")
	
	new Label(mainPanel).setText("Caracteristicas:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Caracteristicas"
			onClick [ | new EditarCaractPaisView(this,modelObject).open]
			//bindEnabled(new NotNullObservable("conversion"))
		]	
	
	
	var Table<String> y = new Table<String>(mainPanel,String)
		y.bindItemsToProperty("caract")
		y.heigth = 100
		y.setWidth(500)
		
		new Column<String>(y)=>[
 		title='''Caracteristicas'''
 		bindContentsToTransformer([caract|caract])
	]
	


	new Label(mainPanel).setText("Conexiones:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Conexiones"
			onClick [ | ]
			
		]
	
	
	var Table<String> t = new Table<String>(mainPanel,String)
		t.bindItemsToProperty("conexiones")
		t.heigth = 100
		t.setWidth(500)
		
		new Column<String>(t)=>[
 		title='''Conexiones'''
 		bindContentsToTransformer([conex |conex ])
	]
	

	new Label(mainPanel).setText("Lugares:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Lugares"
			onClick [ | ]
			
		]
	
	// FIJARSE SI HAY QUE HACER UNA TABLE DE LUGAR : TABLE<LUGAR>
	var Table<String> table = new Table<String>(mainPanel,String)
		table.bindItemsToProperty("lugares")
		table.heigth = 100
		table.setWidth(500)
		
		new Column<String>(table)=>[
 		title='''Lugares'''
 		bindContentsToTransformer([lugar |lugar ])
	]
	
		new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ | print(modelObject.nombre)
				        print(modelObject.caract)
			]
			
		]
   }
	
}