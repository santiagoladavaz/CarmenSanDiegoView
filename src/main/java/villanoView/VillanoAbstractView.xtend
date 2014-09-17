package villanoView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.MainWindow
import persona.Villano
import persona.VillanoApplicationModel

abstract class VillanoAbstractView extends MainWindow<Villano>{

	
	new() {
		super(new Villano)
		
	}	


	abstract override def String getTitle()
	
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

		new Label(mainPanel) => [ 
			text = "Seña"
		]
		new List(mainPanel) => [
			bindItemsToProperty("señas")
			heigth = 100
			width = 500
		]

	
	new Label(mainPanel).setText("Hobbie:")
	
	
	
	new Button(mainPanel) => [ 
			caption = "Editar Hobbies"
			onClick [ | new EditarHobbiesView(this,new VillanoApplicationModel(modelObject)).open ]
		]	
	


		new Label(mainPanel) => [ 
			text = "Hobbies"
		]
		new List(mainPanel) => [
			bindItemsToProperty("hobbie")
			heigth = 100
			width = 500
		]



	
	
	new Button(mainPanel) => [ 
			caption = "Aceptar"
			onClick [ | this.close()
				        print(modelObject.nombre)
				        print(modelObject)
				        print(modelObject.señas)
				        print(modelObject.hobbie)
				        ]
				    bindEnabledToProperty("consistente")
				    disableOnError
			
		]	
		
	}
	
	
	
	
}
