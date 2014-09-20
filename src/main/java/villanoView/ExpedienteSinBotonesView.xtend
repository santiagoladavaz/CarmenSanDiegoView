package villanoView

import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import persona.VillanoApplicationModel
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Label
import persona.Villano
import org.uqbar.arena.widgets.List
import org.uqbar.arena.bindings.PropertyAdapter
import components.Lista

class ExpedienteSinBotonesView extends SimpleWindow<VillanoApplicationModel>{
	
	
	new(WindowOwner parent, VillanoApplicationModel model) {
		super(parent, model)
	}

	override protected addActions(Panel actionsPanel) {
		
	}

	override protected createFormPanel(Panel mainPanel) {
		
	}
	
	
	override createMainTemplate(Panel mainPanel) {
		
		
		this.setTitle("Resolviendo: " + modelObject.juego.casoSeleccionado.nombre + "- Expedientes" )
		mainPanel.setLayout(new VerticalLayout)
		
	
		new Label(mainPanel) => [ 
			text = "Villano"
		]
		
		new List<Villano>(mainPanel) => [
				bindItemsToProperty("juego.villanos").adapter = new PropertyAdapter(Villano, "nombre")
				heigth = 150
				width = 130
				bindValueToProperty("villano")
			]
	
		
		new Label(mainPanel)=>[
			setText("Nombre:")
			bindValueToProperty("villano.nombre")
		]

		new Label(mainPanel)=>[
			setText("Sexo:")
			bindValueToProperty("villano.sexo")
		]
	
		
		new Lista(mainPanel,"Señas Particulares:","villano.señas")
	
		new Lista(mainPanel,"Hobbies:","villano.hobbie") 
	}
}