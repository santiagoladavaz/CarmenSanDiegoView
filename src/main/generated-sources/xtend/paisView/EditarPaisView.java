package paisView;

import pais.Pais;
import paisView.VentanaPaisView;

@SuppressWarnings("all")
public class EditarPaisView extends VentanaPaisView {
  public EditarPaisView(final Pais model) {
    super(model);
  }
  
  public String getTitle() {
    return "MapaMundi - Editar Pais";
  }
  
  public static void main(final String[] args) {
    Pais _pais = new Pais();
    EditarPaisView _editarPaisView = new EditarPaisView(_pais);
    _editarPaisView.startApplication();
  }
}
