package villanoView;

import Juego.Caso;
import Juego.Juego;
import components.Lista;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.PropertyAdapter;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.ControlBuilder;
import org.uqbar.lacar.ui.model.ListBuilder;
import org.uqbar.lacar.ui.model.bindings.Binding;
import persona.Villano;
import persona.VillanoApplicationModel;

@SuppressWarnings("all")
public class ExpedienteSinBotonesView extends SimpleWindow<VillanoApplicationModel> {
  public ExpedienteSinBotonesView(final WindowOwner parent, final VillanoApplicationModel model) {
    super(parent, model);
  }
  
  protected void addActions(final Panel actionsPanel) {
  }
  
  protected void createFormPanel(final Panel mainPanel) {
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    VillanoApplicationModel _modelObject = this.getModelObject();
    Juego _juego = _modelObject.getJuego();
    Caso _casoSeleccionado = _juego.getCasoSeleccionado();
    String _nombre = _casoSeleccionado.getNombre();
    String _plus = ("Resolviendo: " + _nombre);
    String _plus_1 = (_plus + "- Expedientes");
    this.setTitle(_plus_1);
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
  }
}
