package villanoView;

import java.util.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import persona.Villano;
import persona.VillanoApplicationModel;
import villanoView.EditarCaractVillanoView;

@SuppressWarnings("all")
public class EditarHobbiesView extends EditarCaractVillanoView {
  public EditarHobbiesView(final WindowOwner owner, final Villano model) {
    super(owner, model);
  }
  
  public String listaAModificar() {
    return "villano.hobbie";
  }
  
  public String getTitle() {
    return "Editar Hobbies";
  }
  
  public String getNameTable() {
    return "Hobbie";
  }
  
  public void getAgregar() {
    VillanoApplicationModel _modelObject = this.getModelObject();
    VillanoApplicationModel _modelObject_1 = this.getModelObject();
    Villano _villano = _modelObject_1.getVillano();
    List<String> _hobbie = _villano.getHobbie();
    _modelObject.agregarValor("villano.hobbie", _hobbie);
  }
  
  public void getEliminar() {
    VillanoApplicationModel _modelObject = this.getModelObject();
    VillanoApplicationModel _modelObject_1 = this.getModelObject();
    Villano _villano = _modelObject_1.getVillano();
    List<String> _hobbie = _villano.getHobbie();
    _modelObject.eliminarValor("villano.hobbie", _hobbie);
  }
  
  protected void createFormPanel(final Panel arg0) {
    this.createContents(arg0);
  }
}
