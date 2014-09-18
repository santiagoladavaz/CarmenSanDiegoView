package juegoView;

import Juego.Caso;
import Juego.Juego;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
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
    _label.setText("Villano:");
    Selector<Object> _selector = new Selector<Object>(mainPanel);
    final Procedure1<Selector<Object>> _function = new Procedure1<Selector<Object>>() {
      public void apply(final Selector<Object> it) {
        it.allowNull(false);
        it.bindItemsToProperty("villanos");
        it.<ControlBuilder>bindValueToProperty("detective.ordenDeArresto");
      }
    };
    ObjectExtensions.<Selector<Object>>operator_doubleArrow(_selector, _function);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
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
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
  }
}
