package villanoView;

import villanoView.VillanoAbstractView;

@SuppressWarnings("all")
public class NuevoVillanoView extends VillanoAbstractView {
  public String getTitle() {
    return "Expedientes - Nuevo Villano";
  }
  
  public static void main(final String[] args) {
    NuevoVillanoView _nuevoVillanoView = new NuevoVillanoView();
    _nuevoVillanoView.startApplication();
  }
}
