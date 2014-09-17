package villanoView;

import java.util.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import persona.Villano;
import persona.VillanoApplicationModel;
import villanoView.EditarCaractVillanoView;

@SuppressWarnings("all")
public class EditarSeniasPartView extends EditarCaractVillanoView {
  public EditarSeniasPartView(final WindowOwner owner, final VillanoApplicationModel model) {
    super(owner, model);
  }
  
  public String getTitle() {
    return "Editar señas particulares";
  }
  
  public String getNameTable() {
    return "Seña";
  }
  
  public void getAgregar() {
    VillanoApplicationModel _modelObject = this.getModelObject();
    VillanoApplicationModel _modelObject_1 = this.getModelObject();
    Villano _villano = _modelObject_1.getVillano();
    List<String> _señas = _villano.getSeñas();
    _modelObject.agregarValor("señas", _señas);
  }
  
  public void getEliminar() {
    VillanoApplicationModel _modelObject = this.getModelObject();
    VillanoApplicationModel _modelObject_1 = this.getModelObject();
    Villano _villano = _modelObject_1.getVillano();
    List<String> _señas = _villano.getSeñas();
    _modelObject.eliminarValor("señas", _señas);
  }
  
  public String listaAModificar() {
    return "villano.señas";
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.createContents(mainPanel);
  }
}
