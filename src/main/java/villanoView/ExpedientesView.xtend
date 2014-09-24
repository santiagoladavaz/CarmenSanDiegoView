package villanoView

import components.Lista
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import persona.Villano
import persona.VillanoApplicationModel
import org.uqbar.arena.widgets.List
import org.uqbar.arena.bindings.PropertyAdapter

class ExpedientesView extends SimpleWindow<VillanoApplicationModel>{
	
	
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
		
		
		new Button(mainPanel) => [
			caption = "Nuevo"
			onClick = [|new NuevoVillanoView(this,new Villano).open]
		]
		
		new Button(mainPanel) => [
			caption = "Editar"
			onClick = [|new EditarVillanoView(this,modelObject.villano).open]
			
		]
		
		new Button(mainPanel) => [
			caption = "Aceptar"
			onClick = [ | this.close]
		]		
		
	}
	
}