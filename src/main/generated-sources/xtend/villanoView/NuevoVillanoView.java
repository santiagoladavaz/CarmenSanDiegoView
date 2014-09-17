package villanoView;

import Juego.Juego;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import persona.Villano;
import villanoView.VillanoAbstractView;

@SuppressWarnings("all")
public class NuevoVillanoView extends VillanoAbstractView {
  public NuevoVillanoView(final WindowOwner w, final Villano v) {
    super(w, v);
  }
  
  public String getTitle() {
    return "Expedientes - Nuevo Villano";
  }
  
  protected void addActions(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void procesar(final Juego j, final Villano v) {
    j.agregarVillano(v);
  }
}
