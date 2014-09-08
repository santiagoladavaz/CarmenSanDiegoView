package villanoView 


class NuevoVillanoView extends VillanoAbstractView{

	override getTitle() {
			return "Expedientes - Nuevo Villano"
	}
	
	
	def static main(String[] args) {
		new NuevoVillanoView().startApplication
	}
	
}