package paisView;

import com.uqbar.commons.collections.Transformer;
import java.util.List;
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
import pais.Lugar;
import pais.Pais;
import paisView.EditarCaractPaisView;
import paisView.EditarConexionesView;
import paisView.EditarLugaresView;

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
    Table<String> y = new Table<String>(mainPanel, String.class);
    y.bindItemsToProperty("caract");
    y.setHeigth(100);
    y.setWidth(500);
    Column<String> _column = new Column<String>(y);
    final Procedure1<Column<String>> _function_1 = new Procedure1<Column<String>>() {
      public void apply(final Column<String> it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Caracteristicas");
        it.setTitle(_builder.toString());
        final Transformer<String, String> _function = new Transformer<String, String>() {
          public String transform(final String caract) {
            return caract;
          }
        };
        it.<String>bindContentsToTransformer(_function);
      }
    };
    ObjectExtensions.<Column<String>>operator_doubleArrow(_column, _function_1);
    Label _label_2 = new Label(mainPanel);
    _label_2.setText("Conexiones:");
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Conexiones");
        final Action _function = new Action() {
          public void execute() {
            Pais _modelObject = VentanaPaisView.this.getModelObject();
            EditarConexionesView _editarConexionesView = new EditarConexionesView(VentanaPaisView.this, _modelObject);
            _editarConexionesView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
    Table<String> t = new Table<String>(mainPanel, String.class);
    t.bindItemsToProperty("conexiones");
    t.setHeigth(100);
    t.setWidth(500);
    Label _label_3 = new Label(mainPanel);
    _label_3.setText("Lugares:");
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Lugares");
        final Action _function = new Action() {
          public void execute() {
            Pais _modelObject = VentanaPaisView.this.getModelObject();
            EditarLugaresView _editarLugaresView = new EditarLugaresView(VentanaPaisView.this, _modelObject);
            _editarLugaresView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_3);
    Table<String> table = new Table<String>(mainPanel, String.class);
    table.bindItemsToProperty("lugares");
    table.setHeigth(100);
    table.setWidth(500);
    Button _button_3 = new Button(mainPanel);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            Pais _modelObject = VentanaPaisView.this.getModelObject();
            String _nombre = _modelObject.getNombre();
            String _plus = ("nombre " + _nombre);
            String _plus_1 = (_plus + "\n");
            InputOutput.<String>print(_plus_1);
            Pais _modelObject_1 = VentanaPaisView.this.getModelObject();
            List<Pais> _conexiones = _modelObject_1.getConexiones();
            String _plus_2 = ("conexiones " + _conexiones);
            String _plus_3 = (_plus_2 + "\n");
            InputOutput.<String>print(_plus_3);
            Pais _modelObject_2 = VentanaPaisView.this.getModelObject();
            List<String> _caract = _modelObject_2.getCaract();
            String _plus_4 = ("caracteristicas " + _caract);
            String _plus_5 = (_plus_4 + "\n");
            InputOutput.<String>print(_plus_5);
            Pais _modelObject_3 = VentanaPaisView.this.getModelObject();
            List<Lugar> _lugares = _modelObject_3.getLugares();
            String _plus_6 = ("lugares " + _lugares);
            String _plus_7 = (_plus_6 + "\n");
            InputOutput.<String>print(_plus_7);
            VentanaPaisView.this.close();
          }
        };
        it.onClick(_function);
        it.<ControlBuilder>bindEnabledToProperty("consistente");
        it.disableOnError();
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_3, _function_4);
  }
}
