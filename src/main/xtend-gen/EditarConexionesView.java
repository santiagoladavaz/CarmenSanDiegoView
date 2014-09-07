import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import pais.Pais;

@SuppressWarnings("all")
public class EditarConexionesView extends EdicionPaisAtribView {
  public EditarConexionesView(final WindowOwner owner, final Pais model) {
    super(owner, model);
  }
  
  public String getTitle() {
    return "Editar Conexiones";
  }
  
  public String getTitleTable() {
    return "Conexiones";
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.createContents(mainPanel);
  }
}
