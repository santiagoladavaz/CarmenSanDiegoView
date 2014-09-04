import java.awt.Color;
import java.util.List;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import pais.Pais;

@SuppressWarnings("all")
public abstract class VentanaPaisView extends MainWindow<Pais> {
  public VentanaPaisView(final Pais model) {
    super(model);
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
    _label_1.setText("Caracteristicas:");
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Caracteristicas");
        final Action _function = new Action() {
          public void execute() {
            Pais _modelObject = VentanaPaisView.this.getModelObject();
            EditarCaractPaisView _editarCaractPaisView = new EditarCaractPaisView(VentanaPaisView.this, _modelObject);
            _editarCaractPaisView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    Label _label_2 = new Label(mainPanel);
    Label _setText = _label_2.setText("Caracteristicas:");
    _setText.setBackground(Color.CYAN);
    new TextBox(mainPanel);
    Label _label_3 = new Label(mainPanel);
    _label_3.setText("Conexiones:");
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Conexiones");
        final Action _function = new Action() {
          public void execute() {
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_1);
    Label _label_4 = new Label(mainPanel);
    Label _setText_1 = _label_4.setText("Conexiones:");
    _setText_1.setBackground(Color.CYAN);
    new TextBox(mainPanel);
    Label _label_5 = new Label(mainPanel);
    _label_5.setText("Lugares:");
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Lugares");
        final Action _function = new Action() {
          public void execute() {
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_2);
    Label _label_6 = new Label(mainPanel);
    Label _setText_2 = _label_6.setText("Lugares:");
    _setText_2.setBackground(Color.CYAN);
    new TextBox(mainPanel);
    Button _button_3 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            Pais _modelObject = VentanaPaisView.this.getModelObject();
            String _nombre = _modelObject.getNombre();
            InputOutput.<String>print(_nombre);
            Pais _modelObject_1 = VentanaPaisView.this.getModelObject();
            List<String> _caract = _modelObject_1.getCaract();
            InputOutput.<List<String>>print(_caract);
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_3, _function_3);
  }
}
