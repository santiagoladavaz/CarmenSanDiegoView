package juegoView

import Juego.Juego
import components.Lista
import org.uqbar.arena.layout.ColumnLayout
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import pais.LugarApplicationModel
import persona.VillanoApplicationModel
import villanoView.ExpedienteSinBotonesView
import persona.ViajarApplicationModel

class ResolverMisterioView extends SimpleWindow<Juego> {
	
	new(WindowOwner parent, Juego model) {
		super(parent, model)
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
			bindCaptionToProperty("detective.paisActual.primerLugar")
			onClick = [ | new VentanaPistasView(this,
							new LugarApplicationModel
							(modelObject.detective.paisActual.primerLugar)).
					open()
					]
		]
		
		
		new Button(listadoLugaresPanel) => [
			bindCaptionToProperty("detective.paisActual.segundoLugar")
			
			onClick = [ | new VentanaPistasView(this,
							new LugarApplicationModel
							(modelObject.detective.paisActual.segundoLugar)).
					open()
			]
		]
		
		new Button(listadoLugaresPanel) => [
			bindCaptionToProperty("detective.paisActual.tercerLugar")
			onClick = [ | new VentanaPistasView(this,new LugarApplicationModel
							(modelObject.detective.paisActual.tercerLugar)).
					open()
			]
		]

		
	}
		
		def crearBotonesDetective(Panel owner) {
			
		var Panel botones = new Panel(owner)
		botones.layout = new VerticalLayout
		
		
		new Label(botones).setText("Estas en:")
	
		new Label(botones) => [
			bindValueToProperty("detective.paisActual")
		]
		
		
		new Button(botones) => [
			caption = "Emitir orden de arresto"
			onClick = [ | 
				new OrdenDeArrestoView(this,modelObject).open
			]
		]
		
		new Label(botones).setText("Orden emitida contra: ")
		new Label(botones).bindValueToProperty("detective.ordenDeArresto")
		
		new Button(botones) => [
			caption = "Viajar"
			onClick = [ | 
				new ViajarView(this, new ViajarApplicationModel(modelObject)).open ]
		]
		
		new Button(botones) => [
			caption = "Expedientes"
			onClick = [ | 
				new ExpedienteSinBotonesView(this, new VillanoApplicationModel()).open
			]
		]
	
		new Lista(botones,"Recorrido Actual","detective.recorridoCriminal")
		new Lista(botones,"Destinos Fallidos","detective.destinosFallidos")
	}
	
	
	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
