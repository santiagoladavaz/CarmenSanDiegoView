package villanoView;

import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import persona.Villano;
import persona.VillanoApplicationModel;
import villanoView.EditarHobbiesView;
import villanoView.EditarSeniasPartView;

@SuppressWarnings("all")
public abstract class VillanoAbstractView extends MainWindow<Villano> {
  public VillanoAbstractView() {
    super(new Villano());
  }
  
  public abstract String getTitle();
  
  public void createContents(final Panel mainPanel) {
    String _title = this.getTitle();
    this.setTitle(_title);
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Label _label = new Label(mainPanel);
    _label.setText("Nombre:");
    TextBox _textBox = new TextBox(mainPanel);
    _textBox.<ControlBuilder>bindValueToProperty("nombre");
    Label _label_1 = new Label(mainPanel);
    _label_1.setText("Sexo:");
    TextBox _textBox_1 = new TextBox(mainPanel);
    _textBox_1.<ControlBuilder>bindValueToProperty("sexo");
    Label _label_2 = new Label(mainPanel);
    _label_2.setText("Señas Particulares:");
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Señas Particulares");
        final Action _function = new Action() {
          public void execute() {
            Villano _modelObject = VillanoAbstractView.this.getModelObject();
            VillanoApplicationModel _villanoApplicationModel = new VillanoApplicationModel(_modelObject);
            EditarSeniasPartView _editarSeniasPartView = new EditarSeniasPartView(VillanoAbstractView.this, _villanoApplicationModel);
            _editarSeniasPartView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    Label _label_3 = new Label(mainPanel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Seña");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_3, _function_1);
    List<Object> _list = new List<Object>(mainPanel);
    final Procedure1<List<Object>> _function_2 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty("señas");
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function_2);
    Label _label_4 = new Label(mainPanel);
    _label_4.setText("Hobbie:");
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Hobbies");
        final Action _function = new Action() {
          public void execute() {
            Villano _modelObject = VillanoAbstractView.this.getModelObject();
            VillanoApplicationModel _villanoApplicationModel = new VillanoApplicationModel(_modelObject);
            EditarHobbiesView _editarHobbiesView = new EditarHobbiesView(VillanoAbstractView.this, _villanoApplicationModel);
            _editarHobbiesView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
    Label _label_5 = new Label(mainPanel);
    final Procedure1<Label> _function_4 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Hobbies");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_5, _function_4);
    List<Object> _list_1 = new List<Object>(mainPanel);
    final Procedure1<List<Object>> _function_5 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty("hobbie");
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list_1, _function_5);
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_6 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            VillanoAbstractView.this.close();
            Villano _modelObject = VillanoAbstractView.this.getModelObject();
            String _nombre = _modelObject.getNombre();
            InputOutput.<String>print(_nombre);
            Villano _modelObject_1 = VillanoAbstractView.this.getModelObject();
            InputOutput.<Villano>print(_modelObject_1);
            Villano _modelObject_2 = VillanoAbstractView.this.getModelObject();
            java.util.List<String> _señas = _modelObject_2.getSeñas();
            InputOutput.<java.util.List<String>>print(_señas);
            Villano _modelObject_3 = VillanoAbstractView.this.getModelObject();
            java.util.List<String> _hobbie = _modelObject_3.getHobbie();
            InputOutput.<java.util.List<String>>print(_hobbie);
          }
        };
        it.onClick(_function);
        it.<ControlBuilder>bindEnabledToProperty("consistente");
        it.disableOnError();
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_6);
  }
}
