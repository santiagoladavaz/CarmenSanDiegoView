package paisView;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import pais.PaisApplicationModel;
import paisView.EdicionPaisAtribView;

@SuppressWarnings("all")
public class EditarConexionesView extends EdicionPaisAtribView {
  public EditarConexionesView(final WindowOwner owner, final PaisApplicationModel model) {
    super(owner, model);
  }
  
  public String getTitle() {
    return "Editar Conexiones";
  }
  
  public String getTitleTable() {
    return "Conexiones";
  }
  
  public String getEditableProperty() {
    return "paisModel.conexiones";
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.createContents(mainPanel);
  }
  
  public void agregarLugarOConexion() {
    PaisApplicationModel _modelObject = this.getModelObject();
    _modelObject.agregarConexion();
  }
  
  public String propertyToAdd() {
    return "paisElegido";
  }
  
  public void eliminarLugarOConexion() {
    PaisApplicationModel _modelObject = this.getModelObject();
    _modelObject.eliminarConexion();
  }
  
  public String getGetJuegoEditableProperty() {
    return "conexiones";
  }
}
