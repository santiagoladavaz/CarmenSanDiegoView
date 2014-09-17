package paisView;

import Juego.Juego;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import pais.Pais;
import paisView.VentanaPaisView;

@SuppressWarnings("all")
public class EditarPaisView extends VentanaPaisView {
  public EditarPaisView(final WindowOwner m, final Pais model) {
    super(m, model);
  }
  
  public String getTitle() {
    return "MapaMundi - Editar Pais";
  }
  
  protected void addActions(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void procesar(final Juego j, final Pais p) {
  }
}
