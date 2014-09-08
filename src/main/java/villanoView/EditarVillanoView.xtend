package villanoView


class EditarVillanoView extends VillanoAbstractView{

	override getTitle() {
			return "Expedientes - Editar Villano"
	}
	
	
	
	def static main(String[] args) {
		new EditarVillanoView().startApplication
	}
	
}