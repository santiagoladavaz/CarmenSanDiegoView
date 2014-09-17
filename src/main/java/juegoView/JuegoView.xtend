package juegoView

import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import Juego.Juego
import org.uqbar.arena.layout.HorizontalLayout
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Button
import Juego.JuegoAppModel

class JuegoView extends MainWindow<Juego> {
	
	new(Juego model) {
		super(model)
	}

	override createContents(Panel mainPanel) {
		this.setTitle("¿Donde esta Carmen Sandiego?")
		mainPanel.setLayout(new HorizontalLayout)	
		
		new Label(mainPanel).setText("¿Que haremos ahora detective?")
		
		
		
		new Button(mainPanel) => [ 
			caption = "Resolver Misterio"
			onClick [ | // new Misterio(this,modelObject).open
			]
		]
		
		new Button(mainPanel) => [ 
			caption = "Mapamundi"
			onClick [ | new MapamundiView(this, new JuegoAppModel()).open
			]
		]
		
		new Button(mainPanel) => [ 
			caption = "Expedientes"
			onClick [ | //new ExpedientesView(this,modelObject).open
			]
		]
		}
		
		def static void main(String[] args) {
			var Juego j = new Juego
			new JuegoView(j).startApplication
		}
		
}
		