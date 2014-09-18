package juegoView

import Juego.Juego
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.List
import persona.DetectiveApplicationModel

class ResolverMisterioView extends SimpleWindow<Juego> {
	
	new(WindowOwner parent, Juego model) {
		super(parent, model)
	}
	
	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
	
	
	
	override createMainTemplate(Panel mainPanel){
		this.setTitle("Resolviendo: "+ modelObject.casoSeleccionado.nombre)
		
		var Panel contentPanel = new Panel(mainPanel)
		contentPanel.layout = new ColumnLayout(2)
		this.crearBotonesDetective(contentPanel)
		this.crearListadoLugares(contentPanel)
		}
	
	
	def crearListadoLugares(Panel owner) {
		
		var Panel listadoLugaresPanel = new Panel(owner)
		listadoLugaresPanel.layout = new VerticalLayout
		
		new Label(listadoLugaresPanel) => [
			text = "Lugares"
		]
		
		new Button(listadoLugaresPanel) => [
			caption = modelObject.detective.paisActual.getLugares().get(0).getNombre()
			onClick = [ | 
				//new dameLasPistasView(this, )
			]
		]
		
		new Button(listadoLugaresPanel) => [
			caption = modelObject.detective.paisActual.getLugares().get(1).getNombre()
			onClick = [ | 
				//new dameLasPistasView(this, )
			]
		]
		
		new Button(listadoLugaresPanel) => [
			caption = modelObject.detective.paisActual.getLugares().get(2).getNombre()
			onClick = [ | 
				//new dameLasPistasView(this, )
			]
		]

		
	}
		
		def crearBotonesDetective(Panel owner) {
			
		var Panel botones = new Panel(owner)
		botones.layout = new VerticalLayout
		
		new Label(botones) => [
			text = "Estas en: "
			bindValueToProperty("detective.paisActual")
		]
		
		new Button(botones) => [
			caption = "Orden de arresto"
			onClick = [ | 
				new OrdenDeArrestoView(this,modelObject).open
			]
		]
		
		
		new Label(botones) => [
			text = "Orden ya emitida: "
			bindValueToProperty("detective.ordenDeArresto")
		]	
		
		
		new Button(botones) => [
			caption = "Viajar"
			onClick = [ | 
				new ViajarView(this,new DetectiveApplicationModel()).open
			]
		]
		
		new Button(botones) => [
			caption = "Expedientes"
			onClick = [ | 
				//new newExpedienteSinBotonesView(this, )
			]
		]
	
	
	new Label(botones) => [ 
			text = "Recorrido Actual"
		]
		
		new List(botones) => [
			bindItemsToProperty("detective.recorridoCriminal")
			heigth = 100
			width = 300
		]
		
	new Label(botones) => [ 
			text = "Destinos Fallidos"
		]
		
		new List(botones) => [
			bindItemsToProperty("detective.destinosFallidos")
			heigth = 100
			width = 300
		]
		
		
	}
		
		

	}
	
