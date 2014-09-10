package paisView

import org.uqbar.arena.bindings.ObservableProperty
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.widgets.tables.Column
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import pais.Pais

abstract class EdicionPaisAtribView extends Dialog<Pais>{
	
	@Property Juego juego = Juego.getInstance()
	
	//Clase abstracta de las ediciones de Lugares y Conexiones
	
	new(WindowOwner owner, Pais model) {
		super(owner, model)
	}
	

	abstract override def String getTitle()
	
	abstract def void agregarLugarOConexion()
	abstract def void eliminarLugarOConexion()
	
	abstract  def String getTitleTable()
	
	
	
	override createContents(Panel mainPanel) {
		this.setTitle(this.getTitle())
		mainPanel.setLayout(new VerticalLayout)	
		
		var Table<String> y = new Table<String>(mainPanel,String)
		y.heigth = 100
		y.width = 500
		new Column<String>(y)=>[
 			title= getTitleTable()
 			bindContentsToProperty("conexiones")
		]
	
	
	new Button(mainPanel) => [ 
			caption = "Eliminar"
			onClick [ | eliminarLugarOConexion() ]
			
		]
		
	new Selector(mainPanel) => [
			allowNull = false
			bindItems(new ObservableProperty(juego,getObservableProperty()))
			bindValueToProperty(propertyToAdd())
		]		
		
		new Button(mainPanel) => [ 
				caption = "Agregar"
				onClick [ | this.agregarLugarOConexion()]
		]
	
	
		new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ | this.close
			]
		]
	
	}
	
	def abstract String propertyToAdd()
	
	def abstract String getObservableProperty()
	
}