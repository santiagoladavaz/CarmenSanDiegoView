package paisView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.MainWindow
import pais.Pais
import pais.PaisApplicationModel

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
		]	
		
		new Label(mainPanel) => [ 
				text = "Caracteristicas" 
			]
		new List(mainPanel) => [
			bindItemsToProperty("caract")
			heigth = 100
			width = 500
		]
	
	
	new Label(mainPanel).setText("Conexiones:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Conexiones"
			onClick [ | new EditarConexionesView(this,new PaisApplicationModel(modelObject)).open]
	]
			
		
	new List(mainPanel) => [
			bindItemsToProperty("conexiones")
			heigth = 100
			width = 500
		]

	new Label(mainPanel).setText("Lugares:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Lugares"
			onClick [ | new EditarLugaresView(this,new PaisApplicationModel(modelObject)).open]
			
		]
	
	new List(mainPanel) => [
			bindItemsToProperty("lugares")
			heigth = 100
			width = 500
		]
	
		new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ | print("nombre " + modelObject.nombre+"\n")
				        print("conexiones "+modelObject.conexiones+"\n")
				        print("caracteristicas "+modelObject.caract+"\n")
				        print("lugares "+modelObject.lugares+"\n")
				        print(modelObject.nombre !=null && !modelObject.conexiones.empty &&
				        	!modelObject.lugares.empty && !modelObject.caract.empty)
				        this.close()
			]
			bindEnabledToProperty("consistente")
			disableOnError
		]
   }
	
}