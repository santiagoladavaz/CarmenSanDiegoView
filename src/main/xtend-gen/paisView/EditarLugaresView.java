package paisView;

import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import pais.Lugar;
import pais.Pais;
import paisView.EdicionPaisAtribView;

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
  
  public String getEditableProperty() {
    return "lugares";
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.createContents(mainPanel);
  }
  
  public void agregarLugarOConexion() {
    Pais _modelObject = this.getModelObject();
    Pais _modelObject_1 = this.getModelObject();
    Lugar _lugarElegido = _modelObject_1.getLugarElegido();
    _modelObject.agregarLugar(_lugarElegido);
  }
  
  public String getOptionsProperty() {
    return "lugares";
  }
  
  public String propertyToAdd() {
    return "lugarElegido";
  }
  
  public void eliminarLugarOConexion() {
    Pais _modelObject = this.getModelObject();
    Pais _modelObject_1 = this.getModelObject();
    Lugar _lugarElegido = _modelObject_1.getLugarElegido();
    _modelObject.eliminarLugar(_lugarElegido);
  }
}
