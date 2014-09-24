package juegoView;

import Juego.Caso;
import Juego.Juego;
import juegoView.InicioJuegoView;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import persona.Detective;
import persona.Villano;

@SuppressWarnings("all")
public abstract class FinPartidaView extends SimpleWindow<Juego> {
  public FinPartidaView(final WindowOwner parent, final Juego model) {
    super(parent, model);
  }
  
  public abstract String crearMensaje(final String villano, final String otroVillano);
  
  public abstract String crearCaptionBoton();
  
  public void createMainTemplate(final Panel mainPanel) {
    Juego _modelObject = this.getModelObject();
    Caso _casoSeleccionado = _modelObject.getCasoSeleccionado();
    String _nombre = _casoSeleccionado.getNombre();
    String _plus = (_nombre + " - Resuelto");
    this.setTitle(_plus);
    Label _label = new Label(mainPanel);
    Juego _modelObject_1 = this.getModelObject();
    Villano _villano = _modelObject_1.getVillano();
    String _nombre_1 = _villano.getNombre();
    Juego _modelObject_2 = this.getModelObject();
    Detective _detective = _modelObject_2.getDetective();
    Villano _ordenDeArresto = _detective.getOrdenDeArresto();
    String _nombre_2 = _ordenDeArresto.getNombre();
    String _crearMensaje = this.crearMensaje(_nombre_1, _nombre_2);
    _label.setText(_crearMensaje);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        String _crearCaptionBoton = FinPartidaView.this.crearCaptionBoton();
        it.setCaption(_crearCaptionBoton);
        final Action _function = new Action() {
          public void execute() {
            InicioJuegoView _inicioJuegoView = new InicioJuegoView(FinPartidaView.this);
            _inicioJuegoView.open();
            FinPartidaView.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
  }
}
