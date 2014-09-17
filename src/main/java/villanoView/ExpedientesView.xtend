package villanoView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import persona.VillanoApplicationModel

class ExpedientesView extends SimpleWindow<VillanoApplicationModel>{
	
	
	def crearLista(Panel panel,String label, String lista){
		new Label(panel).setText(label)
		new List(panel) => [
			bindItemsToProperty(lista)
			heigth = 100
			width = 500
		]
	}
	
	new(WindowOwner parent, VillanoApplicationModel model) {
		super(parent, model)
	}

	override protected addActions(Panel actionsPanel) {
		
	}

	override protected createFormPanel(Panel mainPanel) {
		
	}
	
	
	override createMainTemplate(Panel mainPanel) {
		title = "Expedientes"
		mainPanel.setLayout(new VerticalLayout)
		
	
		new Label(mainPanel) => [ 
			text = "Villano"
		]
		
		new List(mainPanel) => [
			bindItemsToProperty("juego.villanos")
			bindValueToProperty("villano")
			heigth = 100
			width = 500
		]
		
		
		new Label(mainPanel).setText("Nombre:")
		new Label(mainPanel).bindValueToProperty("villano.nombre")
		new Label(mainPanel).setText("Sexo:")
		new Label(mainPanel).bindValueToProperty("villano.sexo")
		
		
		
		this.crearLista(mainPanel,"Señas Particulares:","villano.señas")
	
		this.crearLista(mainPanel,"Hobbies:","villano.hobbie")
		
		new Button(mainPanel) => [
			caption = "Nuevo"
			onClick = [|new NuevoVillanoView().open]
		]
		
		new Button(mainPanel) => [
			caption = "Editar"
			onClick = [|new EditarVillanoView().open]
		]		
		
	}

	
	
}