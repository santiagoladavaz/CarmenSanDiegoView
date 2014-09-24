package juegoView;

import Juego.Juego;
import juegoView.FinPartidaView;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;

@SuppressWarnings("all")
public class PerdioJuegoView extends FinPartidaView {
  public PerdioJuegoView(final WindowOwner parent, final Juego model) {
    super(parent, model);
  }
  
  public String crearMensaje(final String villanoAtrapado, final String orden) {
    return ((("Malas Noticias ! Ha detenido a " + villanoAtrapado) + "pero usted tenia una orden contra") + orden);
  }
  
  public String crearCaptionBoton() {
    return "Aceptar el error cometido";
  }
  
  protected void addActions(final Panel actionsPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
