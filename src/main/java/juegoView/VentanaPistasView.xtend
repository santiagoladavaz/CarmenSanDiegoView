package juegoView

import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.WindowOwner
import pais.LugarApplicationModel

class VentanaPistasView extends SimpleWindow<LugarApplicationModel>{
	
	new(WindowOwner parent, LugarApplicationModel model) {
		super(parent, model)
	}
	
	override protected createMainTemplate(Panel mainPanel) {
		this.setTitle(modelObject.lugar.toString)
		mainPanel.setLayout(new VerticalLayout)	
		mainPanel.width = 300
		
		new Label(mainPanel).setText("Estas visitando: ")
		new Label(mainPanel).setText(modelObject.lugar.toString)
		
		new Label(mainPanel).setText(modelObject.ocupanteInforma)
		
		new Button(mainPanel) => [
			caption = "Continuar"
			onClick = [|
				if (modelObject.gano){
					new GanoJuegoView(this,modelObject.juego).open
				}
				
				if(modelObject.juego.perdio(modelObject.juego.detective.paisActual,modelObject.lugar)){
					new PerdioJuegoView(this,modelObject.juego).open
				}
				
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