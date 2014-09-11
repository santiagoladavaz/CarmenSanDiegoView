package paisView;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import pais.Pais;
import paisView.EdicionPaisAtribView;

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
  
  public String getEditableProperty() {
    return "conexiones";
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.createContents(mainPanel);
  }
  
  public void agregarLugarOConexion() {
    Pais _modelObject = this.getModelObject();
    Pais _modelObject_1 = this.getModelObject();
    Pais _paisElegido = _modelObject_1.getPaisElegido();
    _modelObject.agregarConexion(_paisElegido);
  }
  
  public String propertyToAdd() {
    return "paisElegido";
  }
  
  public void eliminarLugarOConexion() {
    Pais _modelObject = this.getModelObject();
    Pais _modelObject_1 = this.getModelObject();
    Pais _paisElegido = _modelObject_1.getPaisElegido();
    _modelObject.eliminarConexion(_paisElegido);
  }
}
