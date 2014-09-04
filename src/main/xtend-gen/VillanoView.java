import com.uqbar.commons.collections.Transformer;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import persona.Villano;

@SuppressWarnings("all")
public class VillanoView extends MainWindow<Villano> {
  public VillanoView() {
    super(new Villano());
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("Expedientes - Nuevo Villano");
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
            VillanoView.this.getModelObject();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    Table<String> x = new Table<String>(mainPanel, String.class);
    x.bindItemsToProperty("señas");
    x.setHeigth(100);
    Column<String> _column = new Column<String>(x);
    final Procedure1<Column<String>> _function_1 = new Procedure1<Column<String>>() {
      public void apply(final Column<String> it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Seña");
        it.setTitle(_builder.toString());
        final Transformer<String, String> _function = new Transformer<String, String>() {
          public String transform(final String senia) {
            return senia;
          }
        };
        it.<String>bindContentsToTransformer(_function);
      }
    };
    ObjectExtensions.<Column<String>>operator_doubleArrow(_column, _function_1);
    Label _label_3 = new Label(mainPanel);
    _label_3.setText("Hobbie:");
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Hobbies");
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
    Table<String> y = new Table<String>(mainPanel, String.class);
    y.bindItemsToProperty("hobbie");
    y.setHeigth(100);
    Column<String> _column_1 = new Column<String>(y);
    final Procedure1<Column<String>> _function_3 = new Procedure1<Column<String>>() {
      public void apply(final Column<String> it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Hobbies");
        it.setTitle(_builder.toString());
        final Transformer<String, String> _function = new Transformer<String, String>() {
          public String transform(final String hobbies) {
            return hobbies;
          }
        };
        it.<String>bindContentsToTransformer(_function);
      }
    };
    ObjectExtensions.<Column<String>>operator_doubleArrow(_column_1, _function_3);
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            Villano _modelObject = VillanoView.this.getModelObject();
            String _nombre = _modelObject.getNombre();
            InputOutput.<String>print(_nombre);
            Villano _modelObject_1 = VillanoView.this.getModelObject();
            InputOutput.<Villano>print(_modelObject_1);
            Villano _modelObject_2 = VillanoView.this.getModelObject();
            String _sexo = _modelObject_2.getSexo();
            InputOutput.<String>print(_sexo);
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_4);
  }
  
  public static void main(final String[] args) {
    VillanoView _villanoView = new VillanoView();
    _villanoView.startApplication();
  }
}
