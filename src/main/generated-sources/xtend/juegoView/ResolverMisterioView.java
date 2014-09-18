package juegoView;

import Juego.Caso;
import Juego.Juego;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class ResolverMisterioView extends SimpleWindow<Juego> {
  public ResolverMisterioView(final WindowOwner parent, final Juego model) {
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
    String _plus = ("Resolviendo: " + _nombre);
    this.setTitle(_plus);
    Panel contentPanel = new Panel(mainPanel);
    ColumnLayout _columnLayout = new ColumnLayout(2);
    contentPanel.setLayout(_columnLayout);
    this.crearBotonesDetective(contentPanel);
    this.crearListadoLugares(contentPanel);
  }
  
  public Button crearListadoLugares(final Panel owner) {
    Button _xblockexpression = null;
    {
      Panel listadoLugaresPanel = new Panel(owner);
      VerticalLayout _verticalLayout = new VerticalLayout();
      listadoLugaresPanel.setLayout(_verticalLayout);
      Label _label = new Label(listadoLugaresPanel);
      final Procedure1<Label> _function = new Procedure1<Label>() {
        public void apply(final Label it) {
          it.setText("Lugares");
        }
      };
      ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
      Button _button = new Button(listadoLugaresPanel);
      final Procedure1<Button> _function_1 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("sarasa");
          final Action _function = new Action() {
            public void execute() {
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
      Button _button_1 = new Button(listadoLugaresPanel);
      final Procedure1<Button> _function_2 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("hola");
          final Action _function = new Action() {
            public void execute() {
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
      Button _button_2 = new Button(listadoLugaresPanel);
      final Procedure1<Button> _function_3 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("gkgk");
          final Action _function = new Action() {
            public void execute() {
            }
          };
          it.onClick(_function);
        }
      };
      _xblockexpression = ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_3);
    }
    return _xblockexpression;
  }
  
  public Button crearBotonesDetective(final Panel owner) {
    Button _xblockexpression = null;
    {
      Panel botones = new Panel(owner);
      VerticalLayout _verticalLayout = new VerticalLayout();
      botones.setLayout(_verticalLayout);
      Label _label = new Label(botones);
      final Procedure1<Label> _function = new Procedure1<Label>() {
        public void apply(final Label it) {
          it.setText("Estas en: ");
          it.<ControlBuilder>bindValueToProperty("detective.paisActual");
        }
      };
      ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
      Button _button = new Button(botones);
      final Procedure1<Button> _function_1 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Orden de arresto");
          final Action _function = new Action() {
            public void execute() {
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
      Button _button_1 = new Button(botones);
      final Procedure1<Button> _function_2 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Viajar");
          final Action _function = new Action() {
            public void execute() {
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
      Button _button_2 = new Button(botones);
      final Procedure1<Button> _function_3 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Expedientes");
          final Action _function = new Action() {
            public void execute() {
            }
          };
          it.onClick(_function);
        }
      };
      _xblockexpression = ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_3);
    }
    return _xblockexpression;
  }
}
