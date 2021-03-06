package paisView

import Juego.Juego
import components.Lista
import org.uqbar.arena.bindings.ObservableProperty
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Selector
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import pais.PaisApplicationModel

abstract class EdicionPaisAtribView extends Dialog<PaisApplicationModel>{
	
	@Property Juego juego = Juego.getInstance()
	
	abstract def String getGetJuegoEditableProperty()
	abstract def String getEditableProperty()
	abstract def String propertyToAdd()
	abstract override String getTitle()
	abstract def void agregarLugarOConexion()
	abstract def void eliminarLugarOConexion()
	abstract def String getTitleTable()
	

	//Clase abstracta de las ediciones de Lugares y Conexiones
	
	new(WindowOwner owner, PaisApplicationModel model) {
		super(owner, model)
	}	
	
	override createContents(Panel mainPanel) {
		this.setTitle(this.getTitle())
		mainPanel.setLayout(new VerticalLayout)	
		
		
		new Lista(propertyToAdd,mainPanel,getTitleTable,getEditableProperty)
		
		
	
		new Button(mainPanel) => [ 
			caption = "Eliminar"
			onClick [ | eliminarLugarOConexion() ]
			
		]
		
	new Selector(mainPanel) => [
			allowNull = false
			//# le cambio la prop. a juego para que machee este bind y asi borrar 2 metodos.
			bindItems(new ObservableProperty(juego,getJuegoEditableProperty)) 
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
	
	
}