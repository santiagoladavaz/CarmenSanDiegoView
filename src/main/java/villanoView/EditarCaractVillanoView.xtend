package villanoView 
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.widgets.tables.Column
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import persona.Villano
import org.uqbar.arena.widgets.List

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
		
		
	
		new List(mainPanel) => [
			bindItemsToProperty(this.listaAModificar())
			heigth = 100
			width = 500
		]
	
		new Button(mainPanel) => [ 
			caption = "Eliminar"
			onClick [ | this.getEliminar()
			]	
		]	
		
		new TextBox(mainPanel).bindValueToProperty("valor")
	
		new Button(mainPanel) => [ 
			caption = "Agregar"
			onClick [ | this.getAgregar()]			
		]	
	
	
		
		new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ |this.close]
		]	
	
		
	   
	}
}