package villanoView;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import persona.VillanoApplicationModel;
import villanoView.EditarVillanoView;
import villanoView.NuevoVillanoView;

@SuppressWarnings("all")
public class ExpedientesView extends SimpleWindow<VillanoApplicationModel> {
  public List<Object> crearLista(final Panel panel, final String label, final String lista) {
    List<Object> _xblockexpression = null;
    {
      Label _label = new Label(panel);
      _label.setText(label);
      List<Object> _list = new List<Object>(panel);
      final Procedure1<List<Object>> _function = new Procedure1<List<Object>>() {
        public void apply(final List<Object> it) {
          it.bindItemsToProperty(lista);
          it.setHeigth(100);
          it.setWidth(500);
        }
      };
      _xblockexpression = ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function);
    }
    return _xblockexpression;
  }
  
  public ExpedientesView(final WindowOwner parent, final VillanoApplicationModel model) {
    super(parent, model);
  }
  
  protected void addActions(final Panel actionsPanel) {
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    this.setTitle("Expedientes");
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Villano");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    List<Object> _list = new List<Object>(mainPanel);
    final Procedure1<List<Object>> _function_1 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty("juego.villanos");
        it.<ControlBuilder>bindValueToProperty("villano");
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function_1);
    Label _label_1 = new Label(mainPanel);
    _label_1.setText("Nombre:");
    Label _label_2 = new Label(mainPanel);
    _label_2.<ControlBuilder>bindValueToProperty("villano.nombre");
    Label _label_3 = new Label(mainPanel);
    _label_3.setText("Sexo:");
    Label _label_4 = new Label(mainPanel);
    _label_4.<ControlBuilder>bindValueToProperty("villano.sexo");
    this.crearLista(mainPanel, "Señas Particulares:", "villano.señas");
    this.crearLista(mainPanel, "Hobbies:", "villano.hobbie");
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Nuevo");
        final Action _function = new Action() {
          public void execute() {
            NuevoVillanoView _nuevoVillanoView = new NuevoVillanoView();
            _nuevoVillanoView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar");
        final Action _function = new Action() {
          public void execute() {
            EditarVillanoView _editarVillanoView = new EditarVillanoView();
            _editarVillanoView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
  }
}
