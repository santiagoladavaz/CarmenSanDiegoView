package paisView;

import Juego.Juego;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import pais.Pais;
import paisView.VentanaPaisView;

@SuppressWarnings("all")
public class NewPaisView extends VentanaPaisView {
  public NewPaisView(final WindowOwner w) {
    super(w, new Pais());
  }
  
  public String getTitle() {
    return "MapaMundi - Nuevo Pais";
  }
  
  protected void addActions(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void procesar(final Juego j, final Pais p) {
    j.agregarPais(p);
  }
}
