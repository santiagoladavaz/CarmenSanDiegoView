import persona.Villano
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.widgets.tables.Column
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.windows.MainWindow

class VillanoView extends MainWindow<Villano>{

	
	new() {
		super(new Villano)
	}	


	override createContents(Panel mainPanel) {
		this.setTitle("Expedientes - Nuevo Villano")
		mainPanel.setLayout(new VerticalLayout)	
		
	
	
	new Label(mainPanel).setText("Nombre:")
	
	new TextBox(mainPanel).bindValueToProperty("nombre")
	
	new Label(mainPanel).setText("Sexo:")
	
	new TextBox(mainPanel).bindValueToProperty("sexo")
	
	new Label(mainPanel).setText("Señas Particulares:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Señas Particulares"
			onClick [ | modelObject]
			//bindEnabled(new NotNullObservable("conversion"))
		]


	var Table<String> x = new Table<String>(mainPanel,String)
	x.bindItemsToProperty("señas")
	x.heigth = 100
	new Column<String>(x)=>[
 		title='''Seña'''
 		bindContentsToTransformer([senia|senia])
	]
		
	
	
	new Label(mainPanel).setText("Hobbie:")
	
	
	
	
	new Button(mainPanel) => [ 
			caption = "Editar Hobbies"
		//	onClick [ | modelObject.convertir ]
			//bindEnabled(new NotNullObservable("conversion"))
		]	
	
	var Table<String> y = new Table<String>(mainPanel,String)
	y.bindItemsToProperty("hobbie")
	y.heigth = 100
	new Column<String>(y)=>[
 		title='''Hobbies'''
 		bindContentsToTransformer([hobbies|hobbies])
	]
	
	
	new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ | print(modelObject.nombre)
				        print(modelObject)
				        
			]
			//bindEnabled(new NotNullObservable("conversion"))
		]	
		
	}
	
	
	
	def static main(String[] args) {
		new VillanoView().startApplication
	}
	
}