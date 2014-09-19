package villanoView;

import Juego.Juego;
import components.Lista;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import persona.Villano;
import persona.VillanoApplicationModel;
import villanoView.EditarHobbiesView;
import villanoView.EditarSeniasPartView;

@SuppressWarnings("all")
public abstract class VillanoAbstractView extends SimpleWindow<Villano> {
  public VillanoAbstractView(final WindowOwner w, final Villano v) {
    super(w, v);
  }
  
  public abstract String getTitle();
  
  public abstract void procesar(final Juego j, final Villano v);
  
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
    new Lista(mainPanel, "Seña", "señas");
    Label _label_3 = new Label(mainPanel);
    _label_3.setText("Hobbie:");
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
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
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_1);
    new Lista(mainPanel, "Hobbies", "hobbie");
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            Juego _instance = Juego.getInstance();
            Villano _modelObject = VillanoAbstractView.this.getModelObject();
            VillanoAbstractView.this.procesar(_instance, _modelObject);
            VillanoAbstractView.this.close();
          }
        };
        it.onClick(_function);
        it.<ControlBuilder>bindEnabledToProperty("consistente");
        it.disableOnError();
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_2);
  }
}
