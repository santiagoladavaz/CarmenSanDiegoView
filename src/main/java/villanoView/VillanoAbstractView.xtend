package villanoView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.SimpleWindow
import persona.Villano
import persona.VillanoApplicationModel
import org.uqbar.arena.windows.WindowOwner
import Juego.Juego
import components.Lista

abstract class VillanoAbstractView extends SimpleWindow<Villano>{

	
	new(WindowOwner w,Villano v) {
		super(w,v)
		
	}	


	abstract override def String getTitle()
	abstract def void procesar(Juego j,Villano v)
	
	override createContents(Panel mainPanel) {
		
		this.setTitle(this.getTitle())
		mainPanel.setLayout(new VerticalLayout)	
		
	
		new Label(mainPanel).setText("Nombre:")
	
		new TextBox(mainPanel).bindValueToProperty("nombre")
		
		new Label(mainPanel).setText("Sexo:")
	
		new TextBox(mainPanel).bindValueToProperty("sexo")
	
		new Label(mainPanel).setText("Señas Particulares:")
	
		new Button(mainPanel) => [ 
			caption = "Editar Señas Particulares"
			onClick [ | new EditarSeniasPartView(this,new VillanoApplicationModel(modelObject)).open]
			
		]

		
		new Lista(mainPanel,"Seña","señas")
		

	
		new Label(mainPanel).setText("Hobbie:")
	
	
	
		new Button(mainPanel) => [ 
			caption = "Editar Hobbies"
			onClick [ | new EditarHobbiesView(this,new VillanoApplicationModel(modelObject)).open ]
		]	
	


		new Lista(mainPanel,"Hobbies","hobbie")	
	
		
		new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ |	this.procesar(Juego.getInstance,modelObject)
						this.close()
				    ]
				    bindEnabledToProperty("consistente")
				    disableOnError
		]	
		
	}
	
	
	
	
}
