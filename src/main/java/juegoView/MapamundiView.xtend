package juegoView

import Juego.JuegoAppModel
import components.Lista
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import paisView.EditarPaisView
import paisView.NewPaisView
import org.uqbar.arena.widgets.List
import pais.Pais
import org.uqbar.arena.bindings.PropertyAdapter

class MapamundiView extends SimpleWindow<JuegoAppModel> {

	new(WindowOwner parent, JuegoAppModel model) {
		super(parent, model)
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

		
		//Este list dejarlo !
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
			onClick = [ | 
				this.close
				print(modelObject.juego.conexiones)
			]
		]
	}

	def crearPanelPaisSeleccionado(Panel owner) {
		var Panel paisCompletaPanel = new Panel(owner)
		paisCompletaPanel.layout = new VerticalLayout

		new Label(paisCompletaPanel).setText("Nombre:")
	
		new Label(paisCompletaPanel) => [
			bindValueToProperty("paisSeleccionado.nombre")
		]
			
		
		
		new Lista(paisCompletaPanel,"Caracteristicas","paisSeleccionado.caract")
		
		new Lista(paisCompletaPanel,"Conexiones","paisSeleccionado.conexiones")
		
		new Lista(paisCompletaPanel,"Lugares de interes","paisSeleccionado.lugares")
		

		}
	
	
	override protected addActions(Panel actionsPanel) {
		
	}

	override protected createFormPanel(Panel mainPanel) {
		
	} 	
}
		