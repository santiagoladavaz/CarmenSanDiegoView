package paisView;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.bindings.ObservableProperty;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
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
  
  public void createContents(final Panel mainPanel) {
    String _title = this.getTitle();
    this.setTitle(_title);
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Label _label = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        String _titleTable = EdicionPaisAtribView.this.getTitleTable();
        it.setText(_titleTable);
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label, _function);
    List<Object> _list = new List<Object>(mainPanel);
    final Procedure1<List<Object>> _function_1 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        String _editableProperty = EdicionPaisAtribView.this.getEditableProperty();
        it.bindItemsToProperty(_editableProperty);
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function_1);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
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
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    Selector<Object> _selector = new Selector<Object>(mainPanel);
    final Procedure1<Selector<Object>> _function_3 = new Procedure1<Selector<Object>>() {
      public void apply(final Selector<Object> it) {
        it.allowNull(false);
        Juego _juego = EdicionPaisAtribView.this.getJuego();
        String _optionsProperty = EdicionPaisAtribView.this.getOptionsProperty();
        ObservableProperty _observableProperty = new ObservableProperty(_juego, _optionsProperty);
        it.bindItems(_observableProperty);
        String _propertyToAdd = EdicionPaisAtribView.this.propertyToAdd();
        it.<ControlBuilder>bindValueToProperty(_propertyToAdd);
      }
    };
    ObjectExtensions.<Selector<Object>>operator_doubleArrow(_selector, _function_3);
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_4 = new Procedure1<Button>() {
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
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_4);
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_5 = new Procedure1<Button>() {
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
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_5);
  }
  
  public abstract String getEditableProperty();
  
  public abstract String propertyToAdd();
  
  public abstract String getOptionsProperty();
  
  public abstract String getTitle();
  
  public abstract void agregarLugarOConexion();
  
  public abstract void eliminarLugarOConexion();
  
  public abstract String getTitleTable();
}
