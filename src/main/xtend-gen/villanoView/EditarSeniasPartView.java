package villanoView;

import java.util.List;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.WindowOwner;
import persona.Villano;
import villanoView.EditarCaractVillanoView;

@SuppressWarnings("all")
public class EditarSeniasPartView extends EditarCaractVillanoView {
  public EditarSeniasPartView(final WindowOwner owner, final Villano model) {
    super(owner, model);
  }
  
  public String getTitle() {
    return "Editar señas particulares";
  }
  
  public String getNameTable() {
    return "Seña";
  }
  
  public void getAgregar() {
    Villano _modelObject = this.getModelObject();
    Villano _modelObject_1 = this.getModelObject();
    String _valor = _modelObject_1.getValor();
    Villano _modelObject_2 = this.getModelObject();
    List<String> _señas = _modelObject_2.getSeñas();
    _modelObject.agregarValor(_valor, "señas", _señas);
    Villano _modelObject_3 = this.getModelObject();
    List<String> _señas_1 = _modelObject_3.getSeñas();
    InputOutput.<List<String>>print(_señas_1);
  }
  
  public void getEliminar() {
    Villano _modelObject = this.getModelObject();
    Villano _modelObject_1 = this.getModelObject();
    String _valor = _modelObject_1.getValor();
    Villano _modelObject_2 = this.getModelObject();
    List<String> _señas = _modelObject_2.getSeñas();
    _modelObject.eliminarValor(_valor, "señas", _señas);
  }
  
  public String listaAModificar() {
    return "señas";
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    this.createContents(mainPanel);
  }
}
