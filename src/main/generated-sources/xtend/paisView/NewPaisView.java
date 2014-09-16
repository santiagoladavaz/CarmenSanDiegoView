package paisView;

import pais.Pais;
import paisView.VentanaPaisView;

@SuppressWarnings("all")
public class NewPaisView extends VentanaPaisView {
  public NewPaisView() {
    super(new Pais());
  }
  
  public String getTitle() {
    return "MapaMundi - Nuevo Pais";
  }
  
  public static void main(final String[] args) {
    NewPaisView _newPaisView = new NewPaisView();
    _newPaisView.startApplication();
  }
}
