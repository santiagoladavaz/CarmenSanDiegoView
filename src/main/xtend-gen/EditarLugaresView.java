import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import pais.Pais;

@SuppressWarnings("all")
public class EditarLugaresView extends EdicionPaisAtribView {
  public EditarLugaresView(final WindowOwner owner, final Pais model) {
    super(owner, model);
  }
  
  public String getTitle() {
    return "Editar Lugares";
  }
  
  public String getTitleTable() {
    return "Lugares de Interés";
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.createContents(mainPanel);
  }
}
