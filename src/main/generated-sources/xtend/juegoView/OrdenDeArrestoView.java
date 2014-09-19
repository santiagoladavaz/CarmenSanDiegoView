package juegoView;

import Juego.Caso;
import Juego.Juego;
import components.SelectorComp;
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
public class OrdenDeArrestoView extends SimpleWindow<Juego> {
  public OrdenDeArrestoView(final WindowOwner parent, final Juego model) {
    super(parent, model);
  }
  
  protected void addActions(final Panel actionsPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    Juego _modelObject = this.getModelObject();
    Caso _casoSeleccionado = _modelObject.getCasoSeleccionado();
    String _nombre = _casoSeleccionado.getNombre();
    this.setTitle(_nombre);
    Label _label = new Label(mainPanel);
    _label.setText("Orden emitida contra: ");
    Label _label_1 = new Label(mainPanel);
    _label_1.<ControlBuilder>bindValueToProperty("detective.ordenDeArresto");
    new SelectorComp(mainPanel, "Villano:", "villanos", "detective.ordenDeArresto");
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Generar Orden De Arresto");
        final Action _function = new Action() {
          public void execute() {
            OrdenDeArrestoView.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
  }
}
