package juegoView;

import Juego.Caso;
import Juego.Juego;
import juegoView.ResolverMisterioView;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class InicioJuegoView extends SimpleWindow<Juego> {
  public InicioJuegoView(final WindowOwner parent, final Juego model) {
    super(parent, model);
  }
  
  protected void addActions(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    Juego _modelObject = this.getModelObject();
    Caso _casoSeleccionado = _modelObject.getCasoSeleccionado();
    String _nombre = _casoSeleccionado.getNombre();
    this.setTitle(_nombre);
    Label _label = new Label(mainPanel);
    _label.<ControlBuilder>bindValueToProperty("casoSeleccionado.descripcion");
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar caso");
        final Action _function = new Action() {
          public void execute() {
            Juego _modelObject = InicioJuegoView.this.getModelObject();
            ResolverMisterioView _resolverMisterioView = new ResolverMisterioView(InicioJuegoView.this, _modelObject);
            _resolverMisterioView.open();
            InicioJuegoView.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
  }
}
