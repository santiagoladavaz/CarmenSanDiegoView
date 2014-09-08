package villanoView;

import java.util.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import persona.Villano;
import villanoView.EditarCaractVillanoView;

@SuppressWarnings("all")
public class EditarHobbiesView extends EditarCaractVillanoView {
  public EditarHobbiesView(final WindowOwner owner, final Villano model) {
    super(owner, model);
  }
  
  public String listaAModificar() {
    return "hobbie";
  }
  
  public String getTitle() {
    return "Editar Hobbies";
  }
  
  public String getNameTable() {
    return "Hobbie";
  }
  
  public void getAgregar() {
    Villano _modelObject = this.getModelObject();
    Villano _modelObject_1 = this.getModelObject();
    String _valor = _modelObject_1.getValor();
    Villano _modelObject_2 = this.getModelObject();
    List<String> _hobbie = _modelObject_2.getHobbie();
    _modelObject.agregarValor(_valor, "hobbie", _hobbie);
  }
  
  public void getEliminar() {
    Villano _modelObject = this.getModelObject();
    Villano _modelObject_1 = this.getModelObject();
    String _valor = _modelObject_1.getValor();
    Villano _modelObject_2 = this.getModelObject();
    List<String> _hobbie = _modelObject_2.getHobbie();
    _modelObject.eliminarValor(_valor, "hobbie", _hobbie);
  }
  
  protected void createFormPanel(final Panel arg0) {
    this.createContents(arg0);
  }
}
