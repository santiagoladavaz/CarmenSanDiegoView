package villanoView;

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
import persona.Villano;
import villanoView.EditarHobbiesView;
import villanoView.EditarSeniasPartView;

@SuppressWarnings("all")
public abstract class VillanoAbstractView extends MainWindow<Villano> {
  public VillanoAbstractView() {
    super(new Villano());
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
            EditarSeniasPartView _editarSeniasPartView = new EditarSeniasPartView(VillanoAbstractView.this, _modelObject);
            _editarSeniasPartView.open();
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
        final Action _function = new Action() {
          public void execute() {
            Villano _modelObject = VillanoAbstractView.this.getModelObject();
            EditarHobbiesView _editarHobbiesView = new EditarHobbiesView(VillanoAbstractView.this, _modelObject);
            _editarHobbiesView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_2);
    Table<String> y = new Table<String>(mainPanel, String.class);
    y.bindItemsToProperty("hobbie");
    y.setHeigth(100);
    y.setWidth(500);
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
            VillanoAbstractView.this.close();
            Villano _modelObject = VillanoAbstractView.this.getModelObject();
            String _nombre = _modelObject.getNombre();
            InputOutput.<String>print(_nombre);
            Villano _modelObject_1 = VillanoAbstractView.this.getModelObject();
            InputOutput.<Villano>print(_modelObject_1);
            Villano _modelObject_2 = VillanoAbstractView.this.getModelObject();
            List<String> _señas = _modelObject_2.getSeñas();
            InputOutput.<List<String>>print(_señas);
            Villano _modelObject_3 = VillanoAbstractView.this.getModelObject();
            List<String> _hobbie = _modelObject_3.getHobbie();
            InputOutput.<List<String>>print(_hobbie);
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_4);
  }
}
