package juegoView

import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List
import org.uqbar.arena.bindings.PropertyAdapter
import pais.Pais
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.widgets.Button
import paisView.EditarPaisView
import paisView.NewPaisView
import Juego.JuegoAppModel

class MapamundiView extends SimpleWindow<JuegoAppModel> {

	new(WindowOwner parent, JuegoAppModel model) {
		super(parent, model)
	}

	override protected addActions(Panel actionsPanel) {
		
	}

	override protected createFormPanel(Panel mainPanel) {
		
	} 

	override createMainTemplate(Panel mainPanel) {
		this.title = "Mapamundi"
		mainPanel.layout = new VerticalLayout
		
		var Panel contentPanel = new Panel(mainPanel)
		contentPanel.layout = new ColumnLayout(2)
		this.crearListadoDePaises(contentPanel)
		this.crearPanelPaisSeleccionado(contentPanel)
	}

	def crearListadoDePaises(Panel owner) {
		var Panel panelDeListadoDePaises = new Panel(owner)
		panelDeListadoDePaises.layout = new VerticalLayout

		new Label(panelDeListadoDePaises).text = "Paises"
		new List<Pais>(panelDeListadoDePaises) => [
				bindItemsToProperty("juego.conexiones").adapter = new PropertyAdapter(Pais, "nombre")
				heigth = 150
				width = 130
				bindValueToProperty("paisSeleccionado")
			]
		
		new Button(panelDeListadoDePaises) =>[
			caption = "Eliminar"
			onClick = [ | this.modelObject.eliminarPais
			]	
		]
		
		new Button(panelDeListadoDePaises) =>[
			caption = "Editar"
			onClick = [ | new EditarPaisView(this,modelObject.paisSeleccionado).open
			]	
		] 
		
		new Button(panelDeListadoDePaises) =>[
			caption = "Nuevo"
			onClick = [ | new NewPaisView(this).open
			]	
		]  
		
		new Button(panelDeListadoDePaises)=> [
			caption = "Aceptar"
			onClick = [ | this.close]
		]
	}

	def crearPanelPaisSeleccionado(Panel owner) {
		var Panel paisCompletaPanel = new Panel(owner)
		paisCompletaPanel.layout = new VerticalLayout

		new Label(paisCompletaPanel).setText("Nombre:")
	
		new Label(paisCompletaPanel) => [
			bindValueToProperty("paisSeleccionado.nombre")
		]
			
		new Label(paisCompletaPanel).setText("Caracteristicas")
		
		new List(paisCompletaPanel)	=> [
			bindItemsToProperty("paisSeleccionado.caract")
			heigth = 100
			width = 300
			
		]
		
		new Label(paisCompletaPanel).setText("Conexiones")
		
		new List(paisCompletaPanel)	=> [
			bindItemsToProperty("paisSeleccionado.conexiones")
			heigth = 100
			width = 300
		]
		
		new Label(paisCompletaPanel).setText("Lugares de interes")
		
		new List(paisCompletaPanel)	=> [
			bindItemsToProperty("paisSeleccionado.lugares")
			heigth = 100
			width = 300
		]

		
		}
		
}
		