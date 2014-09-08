package villanoView;

import com.uqbar.commons.collections.Transformer;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.TextBox;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import persona.Villano;

@SuppressWarnings("all")
public abstract class EditarCaractVillanoView extends Dialog<Villano> {
  public EditarCaractVillanoView(final WindowOwner owner, final Villano model) {
    super(owner, model);
  }
  
  public abstract String listaAModificar();
  
  public abstract String getTitle();
  
  public abstract String getNameTable();
  
  public abstract void getAgregar();
  
  public abstract void getEliminar();
  
  public void createContents(final Panel mainPanel) {
    String _title = this.getTitle();
    this.setTitle(_title);
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Table<String> y = new Table<String>(mainPanel, String.class);
    String _listaAModificar = this.listaAModificar();
    y.bindItemsToProperty(_listaAModificar);
    y.setHeigth(100);
    y.setWidth(500);
    Column<String> _column = new Column<String>(y);
    final Procedure1<Column<String>> _function = new Procedure1<Column<String>>() {
      public void apply(final Column<String> it) {
        String _nameTable = EditarCaractVillanoView.this.getNameTable();
        it.setTitle(_nameTable);
        final Transformer<String, String> _function = new Transformer<String, String>() {
          public String transform(final String seña) {
            return seña;
          }
        };
        it.<String>bindContentsToTransformer(_function);
      }
    };
    ObjectExtensions.<Column<String>>operator_doubleArrow(_column, _function);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Eliminar");
        final Action _function = new Action() {
          public void execute() {
            EditarCaractVillanoView.this.getEliminar();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
    TextBox _textBox = new TextBox(mainPanel);
    _textBox.<ControlBuilder>bindValueToProperty("valor");
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Agregar");
        final Action _function = new Action() {
          public void execute() {
            EditarCaractVillanoView.this.getAgregar();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
            EditarCaractVillanoView.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_3);
  }
}
