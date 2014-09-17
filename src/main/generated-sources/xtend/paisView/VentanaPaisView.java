package paisView;

import Juego.Juego;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import pais.Pais;
import pais.PaisApplicationModel;
import paisView.EditarCaractPaisView;
import paisView.EditarConexionesView;
import paisView.EditarLugaresView;

@SuppressWarnings("all")
public abstract class VentanaPaisView extends SimpleWindow<Pais> {
  public VentanaPaisView(final WindowOwner w, final Pais model) {
    super(w, model);
  }
  
  public abstract String getTitle();
  
  public abstract void procesar(final Juego j, final Pais p);
  
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
            Juego _instance = Juego.getInstance();
            Pais _modelObject = VentanaPaisView.this.getModelObject();
            VentanaPaisView.this.procesar(_instance, _modelObject);
            VentanaPaisView.this.close();
          }
        };
        it.onClick(_function);
        it.disableOnError();
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_3, _function_7);
  }
}
