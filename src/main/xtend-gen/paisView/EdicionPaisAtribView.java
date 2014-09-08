package paisView;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import pais.Pais;
import paisView.Juego;

@SuppressWarnings("all")
public abstract class EdicionPaisAtribView extends Dialog<Pais> {
  private Juego _juego = Juego.getInstance();
  
  public Juego getJuego() {
    return this._juego;
  }
  
  public void setJuego(final Juego juego) {
    this._juego = juego;
  }
  
  public EdicionPaisAtribView(final WindowOwner owner, final Pais model) {
    super(owner, model);
  }
  
  public abstract String getTitle();
  
  public abstract void agregarLugarOConexion();
  
  public abstract void eliminarLugarOConexion();
  
  public abstract String getTitleTable();
  
  public void createContents(final Panel mainPanel) {
    String _title = this.getTitle();
    this.setTitle(_title);
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Table<String> y = new Table<String>(mainPanel, String.class);
    y.setHeigth(100);
    y.setWidth(500);
    Column<String> _column = new Column<String>(y);
    final Procedure1<Column<String>> _function = new Procedure1<Column<String>>() {
      public void apply(final Column<String> it) {
        String _titleTable = EdicionPaisAtribView.this.getTitleTable();
        it.setTitle(_titleTable);
        it.bindContentsToProperty("conexiones");
      }
    };
    ObjectExtensions.<Column<String>>operator_doubleArrow(_column, _function);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Eliminar");
        final Action _function = new Action() {
          public void execute() {
            EdicionPaisAtribView.this.eliminarLugarOConexion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
    Selector<Object> _selector = new Selector<Object>(mainPanel);
    final Procedure1<Selector<Object>> _function_2 = new Procedure1<Selector<Object>>() {
      public void apply(final Selector<Object> it) {
        it.allowNull(false);
        Juego _juego = EdicionPaisAtribView.this.getJuego();
        String _observableProperty = EdicionPaisAtribView.this.getObservableProperty();
        ObservableProperty _observableProperty_1 = new ObservableProperty(_juego, _observableProperty);
        it.bindItems(_observableProperty_1);
        String _propertyToAdd = EdicionPaisAtribView.this.propertyToAdd();
        it.<ControlBuilder>bindValueToProperty(_propertyToAdd);
      }
    };
    ObjectExtensions.<Selector<Object>>operator_doubleArrow(_selector, _function_2);
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar");
        final Action _function = new Action() {
          public void execute() {
            EdicionPaisAtribView.this.agregarLugarOConexion();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            EdicionPaisAtribView.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_4);
  }
  
  public abstract String propertyToAdd();
  
  public abstract String getObservableProperty();
}
