package paisView;

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
            PaisApplicationModel _paisApplicationModel = new PaisApplicationModel(_modelObject);
            EditarCaractPaisView _editarCaractPaisView = new EditarCaractPaisView(VentanaPaisView.this, _paisApplicationModel);
            _editarCaractPaisView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    new Lista(mainPanel, "Caracteristicas", "caract");
    Label _label_2 = new Label(mainPanel);
    _label_2.setText("Conexiones:");
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
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
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_1);
    new Lista(mainPanel, "conexiones");
    Label _label_3 = new Label(mainPanel);
    _label_3.setText("Lugares:");
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
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
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_2);
    new Lista(mainPanel, "lugares");
    Button _button_3 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
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
    ObjectExtensions.<Button>operator_doubleArrow(_button_3, _function_3);
  }
}
