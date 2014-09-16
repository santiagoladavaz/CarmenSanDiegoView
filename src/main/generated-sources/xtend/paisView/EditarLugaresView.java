package paisView;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import pais.PaisApplicationModel;
import paisView.EdicionPaisAtribView;

@SuppressWarnings("all")
public class EditarLugaresView extends EdicionPaisAtribView {
  public EditarLugaresView(final WindowOwner owner, final PaisApplicationModel model) {
    super(owner, model);
  }
  
  public String getTitle() {
    return "Editar Lugares";
  }
  
  public String getTitleTable() {
    return "Lugares de Interés";
  }
  
  public String getEditableProperty() {
    return "paisModel.lugares";
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.createContents(mainPanel);
  }
  
  public void agregarLugarOConexion() {
    PaisApplicationModel _modelObject = this.getModelObject();
    _modelObject.agregarLugar();
  }
  
  public String propertyToAdd() {
    return "lugarElegido";
  }
  
  public void eliminarLugarOConexion() {
    PaisApplicationModel _modelObject = this.getModelObject();
    _modelObject.eliminarLugar();
  }
  
  public String getGetJuegoEditableProperty() {
    return "lugares";
  }
}
