package villanoView;

import components.Lista;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.PropertyAdapter;
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
import persona.Villano;
import persona.VillanoApplicationModel;
import villanoView.EditarVillanoView;
import villanoView.NuevoVillanoView;

@SuppressWarnings("all")
public class ExpedientesView extends SimpleWindow<VillanoApplicationModel> {
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
    List<Villano> _list = new List<Villano>(mainPanel);
    final Procedure1<List<Villano>> _function_1 = new Procedure1<List<Villano>>() {
      public void apply(final List<Villano> it) {
        Binding<ListBuilder<Villano>> _bindItemsToProperty = it.bindItemsToProperty("juego.villanos");
        PropertyAdapter _propertyAdapter = new PropertyAdapter(Villano.class, "nombre");
        _bindItemsToProperty.setAdapter(_propertyAdapter);
        it.setHeigth(150);
        it.setWidth(130);
        it.<ControlBuilder>bindValueToProperty("villano");
      }
    };
    ObjectExtensions.<List<Villano>>operator_doubleArrow(_list, _function_1);
    Label _label_1 = new Label(mainPanel);
    final Procedure1<Label> _function_2 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Nombre:");
        it.<ControlBuilder>bindValueToProperty("villano.nombre");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_1, _function_2);
    Label _label_2 = new Label(mainPanel);
    final Procedure1<Label> _function_3 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Sexo:");
        it.<ControlBuilder>bindValueToProperty("villano.sexo");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_3);
    new Lista(mainPanel, "Señas Particulares:", "villano.señas");
    new Lista(mainPanel, "Hobbies:", "villano.hobbie");
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Nuevo");
        final Action _function = new Action() {
          public void execute() {
            Villano _villano = new Villano();
            NuevoVillanoView _nuevoVillanoView = new NuevoVillanoView(ExpedientesView.this, _villano);
            _nuevoVillanoView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_4);
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar");
        final Action _function = new Action() {
          public void execute() {
            VillanoApplicationModel _modelObject = ExpedientesView.this.getModelObject();
            Villano _villano = _modelObject.getVillano();
            EditarVillanoView _editarVillanoView = new EditarVillanoView(ExpedientesView.this, _villano);
            _editarVillanoView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_5);
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            ExpedientesView.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_6);
  }
}
