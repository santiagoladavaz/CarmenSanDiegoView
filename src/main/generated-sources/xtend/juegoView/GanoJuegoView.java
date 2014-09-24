package juegoView;

import Juego.Juego;
import juegoView.FinPartidaView;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;

@SuppressWarnings("all")
public class GanoJuegoView extends FinPartidaView {
  public GanoJuegoView(final WindowOwner parent, final Juego model) {
    super(parent, model);
  }
  
  public String crearMensaje(final String villano, final String v) {
    return ("En hora buena! Ha detenido a " + villano);
  }
  
  public String crearCaptionBoton() {
    return "Disfrutar de nuestra victoria";
  }
  
  protected void addActions(final Panel actionsPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
