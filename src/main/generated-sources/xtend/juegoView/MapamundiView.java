package juegoView;

import Juego.Juego;
import Juego.JuegoAppModel;
import components.Lista;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.ColumnLayout;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.ListBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;
import pais.Pais;
import paisView.EditarPaisView;
import paisView.NewPaisView;

@SuppressWarnings("all")
public class MapamundiView extends SimpleWindow<JuegoAppModel> {
  public MapamundiView(final WindowOwner parent, final JuegoAppModel model) {
    super(parent, model);
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    this.setTitle("Mapamundi");
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Panel contentPanel = new Panel(mainPanel);
    ColumnLayout _columnLayout = new ColumnLayout(2);
    contentPanel.setLayout(_columnLayout);
    this.crearListadoDePaises(contentPanel);
    this.crearPanelPaisSeleccionado(contentPanel);
  }
  
  public Button crearListadoDePaises(final Panel owner) {
    Button _xblockexpression = null;
    {
      Panel panelDeListadoDePaises = new Panel(owner);
      VerticalLayout _verticalLayout = new VerticalLayout();
      panelDeListadoDePaises.setLayout(_verticalLayout);
      Label _label = new Label(panelDeListadoDePaises);
      _label.setText("Paises");
      List<Pais> _list = new List<Pais>(panelDeListadoDePaises);
      final Procedure1<List<Pais>> _function = new Procedure1<List<Pais>>() {
        public void apply(final List<Pais> it) {
          Binding<ListBuilder<Pais>> _bindItemsToProperty = it.bindItemsToProperty("juego.conexiones");
          PropertyAdapter _propertyAdapter = new PropertyAdapter(Pais.class, "nombre");
          _bindItemsToProperty.setAdapter(_propertyAdapter);
          it.setHeigth(150);
          it.setWidth(130);
          it.<ControlBuilder>bindValueToProperty("paisSeleccionado");
        }
      };
      ObjectExtensions.<List<Pais>>operator_doubleArrow(_list, _function);
      Button _button = new Button(panelDeListadoDePaises);
      final Procedure1<Button> _function_1 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Eliminar");
          final Action _function = new Action() {
            public void execute() {
              JuegoAppModel _modelObject = MapamundiView.this.getModelObject();
              _modelObject.eliminarPais();
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
      Button _button_1 = new Button(panelDeListadoDePaises);
      final Procedure1<Button> _function_2 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Editar");
          final Action _function = new Action() {
            public void execute() {
              JuegoAppModel _modelObject = MapamundiView.this.getModelObject();
              Pais _paisSeleccionado = _modelObject.getPaisSeleccionado();
              EditarPaisView _editarPaisView = new EditarPaisView(MapamundiView.this, _paisSeleccionado);
              _editarPaisView.open();
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
      Button _button_2 = new Button(panelDeListadoDePaises);
      final Procedure1<Button> _function_3 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Nuevo");
          final Action _function = new Action() {
            public void execute() {
              NewPaisView _newPaisView = new NewPaisView(MapamundiView.this);
              _newPaisView.open();
            }
          };
          it.onClick(_function);
        }
      };
      ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_3);
      Button _button_3 = new Button(panelDeListadoDePaises);
      final Procedure1<Button> _function_4 = new Procedure1<Button>() {
        public void apply(final Button it) {
          it.setCaption("Aceptar");
          final Action _function = new Action() {
            public void execute() {
              MapamundiView.this.close();
              JuegoAppModel _modelObject = MapamundiView.this.getModelObject();
              Juego _juego = _modelObject.getJuego();
              java.util.List<Pais> _conexiones = _juego.getConexiones();
              InputOutput.<java.util.List<Pais>>print(_conexiones);
            }
          };
          it.onClick(_function);
        }
      };
      _xblockexpression = ObjectExtensions.<Button>operator_doubleArrow(_button_3, _function_4);
    }
    return _xblockexpression;
  }
  
  public Lista crearPanelPaisSeleccionado(final Panel owner) {
    Lista _xblockexpression = null;
    {
      Panel paisCompletaPanel = new Panel(owner);
      VerticalLayout _verticalLayout = new VerticalLayout();
      paisCompletaPanel.setLayout(_verticalLayout);
      Label _label = new Label(paisCompletaPanel);
      _label.setText("Nombre:");
      Label _label_1 = new Label(paisCompletaPanel);
      final Procedure1<Label> _function = new Procedure1<Label>() {
        public void apply(final Label it) {
          it.<ControlBuilder>bindValueToProperty("paisSeleccionado.nombre");
        }
      };
      ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function);
      new Lista(paisCompletaPanel, "Caracteristicas", "paisSeleccionado.caract");
      new Lista(paisCompletaPanel, "Conexiones", "paisSeleccionado.conexiones");
      _xblockexpression = new Lista(paisCompletaPanel, "Lugares de interes", "paisSeleccionado.lugares");
    }
    return _xblockexpression;
  }
  
  protected void addActions(final Panel actionsPanel) {
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
}
