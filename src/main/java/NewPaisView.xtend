import pais.Pais

class NewPaisView extends VentanaPaisView{
	
	new() {
		super(new Pais)
	}
	
	override getTitle() {
		return "MapaMundi - Nuevo Pais"
	}

	
	
  def static main(String[] args) {
		new NewPaisView().startApplication
	}
}