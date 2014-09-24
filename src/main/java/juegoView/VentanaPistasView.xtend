package juegoView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import pais.LugarApplicationModel
import Juego.Juego
import pais.Pais
import pais.Lugar
import persona.Villano

class VentanaPistasView extends SimpleWindow<LugarApplicationModel>{
	
	new(WindowOwner parent, LugarApplicationModel model) {
		super(parent, model)
	}
	
	def Boolean esUltimoPaisDelVillano(Juego juego,Pais pais){
		juego.esUltimoPaisDelVillano(pais)
	}
	
	def Boolean estaVillanoEnLugar(Lugar lugar,Villano villano){
		lugar.okupa.equals(villano)
	}
	
	
	override protected createMainTemplate(Panel mainPanel) {
		this.setTitle(modelObject.lugar.toString)
		mainPanel.setLayout(new VerticalLayout)	
		mainPanel.width = 300
		
		new Label(mainPanel).setText("Estas visitando: ")
		new Label(mainPanel).setText(modelObject.lugar.toString)
		
		//hay que corregir esto que se ve horrible!! - Buscar una manera de agrandar el label,
		// si hay que bindearlo a una propiedad entonces hay que cambiar cosas del modelo!
		new Label(mainPanel).setText(modelObject.ocupanteInforma)
		
		
		new Button(mainPanel) => [
			caption = "Continuar"
			onClick = [|
				if(modelObject.juego.villano.planDeEscape.last.equals(modelObject.juego.detective.paisActual)
					&&
					modelObject.juego.villanoCorrecto
					&&
					estaVillanoEnLugar(modelObject.lugar,modelObject.juego.detective.ordenDeArresto)
				){
					new GanoJuegoView(this,modelObject.juego).open
				
				}
				
				//Si el villano autor del crimen no se corresponde con el de la orden de arresto
				// deberia -> new PerdioJuegoView(this,modelObject.juego).open
				
				modelObject.setPaisEnLista
				this.close()
			]
		]
	}
	
	override protected addActions(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override protected createFormPanel(Panel arg0) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	
}