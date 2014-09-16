package paisView;

import com.google.common.base.Objects;
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
import pais.Lugar;
import pais.Pais;
import pais.PaisApplicationModel;
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
    Label _label_2 = new Label(mainPanel);
    final Procedure1<Label> _function_1 = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Caracteristicas");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function_1);
    List<Object> _list = new List<Object>(mainPanel);
    final Procedure1<List<Object>> _function_2 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty("caract");
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function_2);
    Label _label_3 = new Label(mainPanel);
    _label_3.setText("Conexiones:");
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Conexiones");
        final Action _function = new Action() {
          public void execute() {
            Pais _modelObject = VentanaPaisView.this.getModelObject();
            PaisApplicationModel _paisApplicationModel = new PaisApplicationModel(_modelObject);
            EditarConexionesView _editarConexionesView = new EditarConexionesView(VentanaPaisView.this, _paisApplicationModel);
            _editarConexionesView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
    List<Object> _list_1 = new List<Object>(mainPanel);
    final Procedure1<List<Object>> _function_4 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty("conexiones");
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list_1, _function_4);
    Label _label_4 = new Label(mainPanel);
    _label_4.setText("Lugares:");
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Editar Lugares");
        final Action _function = new Action() {
          public void execute() {
            Pais _modelObject = VentanaPaisView.this.getModelObject();
            PaisApplicationModel _paisApplicationModel = new PaisApplicationModel(_modelObject);
            EditarLugaresView _editarLugaresView = new EditarLugaresView(VentanaPaisView.this, _paisApplicationModel);
            _editarLugaresView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_5);
    List<Object> _list_2 = new List<Object>(mainPanel);
    final Procedure1<List<Object>> _function_6 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty("lugares");
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list_2, _function_6);
    Button _button_3 = new Button(mainPanel);
    final Procedure1<Button> _function_7 = new Procedure1<Button>() {
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
            java.util.List<Pais> _conexiones = _modelObject_1.getConexiones();
            String _plus_2 = ("conexiones " + _conexiones);
            String _plus_3 = (_plus_2 + "\n");
            InputOutput.<String>print(_plus_3);
            Pais _modelObject_2 = VentanaPaisView.this.getModelObject();
            java.util.List<String> _caract = _modelObject_2.getCaract();
            String _plus_4 = ("caracteristicas " + _caract);
            String _plus_5 = (_plus_4 + "\n");
            InputOutput.<String>print(_plus_5);
            Pais _modelObject_3 = VentanaPaisView.this.getModelObject();
            java.util.List<Lugar> _lugares = _modelObject_3.getLugares();
            String _plus_6 = ("lugares " + _lugares);
            String _plus_7 = (_plus_6 + "\n");
            InputOutput.<String>print(_plus_7);
            boolean _and = false;
            boolean _and_1 = false;
            boolean _and_2 = false;
            Pais _modelObject_4 = VentanaPaisView.this.getModelObject();
            String _nombre_1 = _modelObject_4.getNombre();
            boolean _notEquals = (!Objects.equal(_nombre_1, null));
            if (!_notEquals) {
              _and_2 = false;
            } else {
              Pais _modelObject_5 = VentanaPaisView.this.getModelObject();
              java.util.List<Pais> _conexiones_1 = _modelObject_5.getConexiones();
              boolean _isEmpty = _conexiones_1.isEmpty();
              boolean _not = (!_isEmpty);
              _and_2 = _not;
            }
            if (!_and_2) {
              _and_1 = false;
            } else {
              Pais _modelObject_6 = VentanaPaisView.this.getModelObject();
              java.util.List<Lugar> _lugares_1 = _modelObject_6.getLugares();
              boolean _isEmpty_1 = _lugares_1.isEmpty();
              boolean _not_1 = (!_isEmpty_1);
              _and_1 = _not_1;
            }
            if (!_and_1) {
              _and = false;
            } else {
              Pais _modelObject_7 = VentanaPaisView.this.getModelObject();
              java.util.List<String> _caract_1 = _modelObject_7.getCaract();
              boolean _isEmpty_2 = _caract_1.isEmpty();
              boolean _not_2 = (!_isEmpty_2);
              _and = _not_2;
            }
            InputOutput.<Boolean>print(Boolean.valueOf(_and));
            VentanaPaisView.this.close();
          }
        };
        it.onClick(_function);
        it.<ControlBuilder>bindEnabledToProperty("consistente");
        it.disableOnError();
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_3, _function_7);
  }
}
