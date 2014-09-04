import com.uqbar.commons.collections.Transformer;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.tables.Column;
import org.uqbar.arena.widgets.tables.Table;
import org.uqbar.arena.windows.Dialog;
import org.uqbar.arena.windows.WindowOwner;
import pais.Pais;

@SuppressWarnings("all")
public abstract class EdicionPaisAtribView extends Dialog<Pais> {
  public EdicionPaisAtribView(final WindowOwner owner, final Pais model) {
    super(owner, model);
  }
  
  public abstract String getTitle();
  
  public abstract String getTitleTable();
  
  public void createContents(final Panel mainPanel) {
    String _title = this.getTitle();
    this.setTitle(_title);
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Table<String> y = new Table<String>(mainPanel, String.class);
    y.setHeigth(100);
    Column<String> _column = new Column<String>(y);
    final Procedure1<Column<String>> _function = new Procedure1<Column<String>>() {
      public void apply(final Column<String> it) {
        String _titleTable = EdicionPaisAtribView.this.getTitleTable();
        it.setTitle(_titleTable);
        final Transformer<String, String> _function = new Transformer<String, String>() {
          public String transform(final String hobbies) {
            return hobbies;
          }
        };
        it.<String>bindContentsToTransformer(_function);
      }
    };
    ObjectExtensions.<Column<String>>operator_doubleArrow(_column, _function);
  }
}
