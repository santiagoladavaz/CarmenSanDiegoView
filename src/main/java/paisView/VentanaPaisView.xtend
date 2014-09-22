package paisView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.SimpleWindow
import pais.Pais
import pais.PaisApplicationModel
import org.uqbar.arena.windows.WindowOwner
import Juego.Juego
import components.Lista

abstract class VentanaPaisView extends SimpleWindow<Pais> {
	
	new(WindowOwner w,Pais model) {
		super(w,model)
	}
	
	abstract override def String getTitle()
	abstract def void procesar(Juego j, Pais p)
	
	override createContents(Panel mainPanel) {
		this.setTitle(this.getTitle())
		mainPanel.setLayout(new VerticalLayout)	
		
	
	
	new Label(mainPanel).setText("Nombre:")
	
	new TextBox(mainPanel).bindValueToProperty("nombre")
	
	new Label(mainPanel).setText("Caracteristicas:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Caracteristicas"
			onClick [ | new EditarCaractPaisView(this,new PaisApplicationModel(modelObject)).open]
		]	
		
		
	new Lista(mainPanel,"Caracteristicas","caract")
		
	
	
	new Label(mainPanel).setText("Conexiones:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Conexiones"
			onClick [ | new EditarConexionesView(this,new PaisApplicationModel(modelObject)).open]
	]
			
		
	
	new Lista(mainPanel,"conexiones")
	
	new Label(mainPanel).setText("Lugares:")
	
	new Button(mainPanel) => [ 
			caption = "Editar Lugares"
			onClick [ | new EditarLugaresView(this,new PaisApplicationModel(modelObject)).open]
			
		]
	
	new Lista(mainPanel,"lugares") 
	
	new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ | this.procesar(Juego.getInstance,modelObject)
						this.close()
			]
			disableOnError
		]
   }
	
}