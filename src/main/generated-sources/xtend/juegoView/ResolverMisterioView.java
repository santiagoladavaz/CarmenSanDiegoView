package juegoView;

import Juego.Caso;
import Juego.Juego;
import components.Lista;
import java.util.List;
import juegoView.OrdenDeArrestoView;
import juegoView.VentanaPistasView;
import juegoView.ViajarView;
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
import pais.Lugar;
import pais.Pais;
import persona.Detective;
import persona.DetectiveApplicationModel;
import persona.VillanoApplicationModel;
import villanoView.ExpedienteSinBotonesView;

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
          Juego _modelObject = ResolverMisterioView.this.getModelObject();
          Detective _detective = _modelObject.getDetective();
          Pais _paisActual = _detective.getPaisActual();
          List<Lugar> _lugares = _paisActual.getLugares();
          final Lugar lugar = _lugares.get(0);
          String _nombre = lugar.getNombre();
          it.setCaption(_nombre);
          final Action _function = new Action() {
            public void execute() {
              VentanaPistasView _ventanaPistasView = new VentanaPistasView(ResolverMisterioView.this, lugar);
              _ventanaPistasView.open();
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
      Button _button_1 = new Button(listadoLugaresPanel);
      final Procedure1<Button> _function_2 = new Procedure1<Button>() {
        public void apply(final Button it) {
          Juego _modelObject = ResolverMisterioView.this.getModelObject();
          Detective _detective = _modelObject.getDetective();
          Pais _paisActual = _detective.getPaisActual();
          List<Lugar> _lugares = _paisActual.getLugares();
          final Lugar lugar = _lugares.get(1);
          String _nombre = lugar.getNombre();
          it.setCaption(_nombre);
          final Action _function = new Action() {
            public void execute() {
              VentanaPistasView _ventanaPistasView = new VentanaPistasView(ResolverMisterioView.this, lugar);
              _ventanaPistasView.open();
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
      Button _button_2 = new Button(listadoLugaresPanel);
      final Procedure1<Button> _function_3 = new Procedure1<Button>() {
        public void apply(final Button it) {
          Juego _modelObject = ResolverMisterioView.this.getModelObject();
          Detective _detective = _modelObject.getDetective();
          Pais _paisActual = _detective.getPaisActual();
          List<Lugar> _lugares = _paisActual.getLugares();
          final Lugar lugar = _lugares.get(2);
          String _nombre = lugar.getNombre();
          it.setCaption(_nombre);
          final Action _function = new Action() {
            public void execute() {
              VentanaPistasView _ventanaPistasView = new VentanaPistasView(ResolverMisterioView.this, lugar);
              _ventanaPistasView.open();
            }
          };
          it.onClick(_function);
        }
      };
      _xblockexpression = ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_3);
    }
    return _xblockexpression;
  }
  
  public Lista crearBotonesDetective(final Panel owner) {
    Lista _xblockexpression = null;
    {
      Panel botones = new Panel(owner);
      VerticalLayout _verticalLayout = new VerticalLayout();
      botones.setLayout(_verticalLayout);
      Label _label = new Label(botones);
      _label.setText("Estas en:");
      Label _label_1 = new Label(botones);
      final Procedure1<Label> _function = new Procedure1<Label>() {
        public void apply(final Label it) {
          it.<ControlBuilder>bindValueToProperty("detective.paisActual");
        }
      };
      ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function);
      Button _button = new Button(botones);
      final Procedure1<Button> _function_1 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Emitir orden de arresto");
          final Action _function = new Action() {
            public void execute() {
              Juego _modelObject = ResolverMisterioView.this.getModelObject();
              OrdenDeArrestoView _ordenDeArrestoView = new OrdenDeArrestoView(ResolverMisterioView.this, _modelObject);
              _ordenDeArrestoView.open();
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
      Label _label_2 = new Label(botones);
      _label_2.setText("Orden emitida contra: ");
      Label _label_3 = new Label(botones);
      _label_3.<ControlBuilder>bindValueToProperty("detective.ordenDeArresto");
      Button _button_1 = new Button(botones);
      final Procedure1<Button> _function_2 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Viajar");
          final Action _function = new Action() {
            public void execute() {
              Juego _modelObject = ResolverMisterioView.this.getModelObject();
              DetectiveApplicationModel _detectiveApplicationModel = new DetectiveApplicationModel(_modelObject);
              ViajarView _viajarView = new ViajarView(ResolverMisterioView.this, _detectiveApplicationModel);
              _viajarView.open();
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
              VillanoApplicationModel _villanoApplicationModel = new VillanoApplicationModel();
              ExpedienteSinBotonesView _expedienteSinBotonesView = new ExpedienteSinBotonesView(ResolverMisterioView.this, _villanoApplicationModel);
              _expedienteSinBotonesView.open();
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_3);
      new Lista(botones, "Recorrido Actual", "detective.recorridoCriminal");
      _xblockexpression = new Lista(botones, "Destinos Fallidos", "detective.destinosFallidos");
    }
    return _xblockexpression;
  }
}
