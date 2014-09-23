package juegoView;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import pais.Lugar;
import pais.LugarApplicationModel;

@SuppressWarnings("all")
public class VentanaPistasView extends SimpleWindow<LugarApplicationModel> {
  public VentanaPistasView(final WindowOwner parent, final LugarApplicationModel model) {
    super(parent, model);
  }
  
  protected void createMainTemplate(final Panel mainPanel) {
    LugarApplicationModel _modelObject = this.getModelObject();
    Lugar _lugar = _modelObject.getLugar();
    String _string = _lugar.toString();
    this.setTitle(_string);
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    mainPanel.setWidth(300);
    Label _label = new Label(mainPanel);
    _label.setText("Estas visitando: ");
    Label _label_1 = new Label(mainPanel);
    LugarApplicationModel _modelObject_1 = this.getModelObject();
    Lugar _lugar_1 = _modelObject_1.getLugar();
    String _string_1 = _lugar_1.toString();
    _label_1.setText(_string_1);
    Label _label_2 = new Label(mainPanel);
    LugarApplicationModel _modelObject_2 = this.getModelObject();
    String _ocupanteInforma = _modelObject_2.ocupanteInforma();
    _label_2.setText(_ocupanteInforma);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Continuar");
        final Action _function = new Action() {
          public void execute() {
            LugarApplicationModel _modelObject = VentanaPistasView.this.getModelObject();
            _modelObject.setPaisEnLista();
            VentanaPistasView.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
  }
  
  protected void addActions(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel arg0) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
}
