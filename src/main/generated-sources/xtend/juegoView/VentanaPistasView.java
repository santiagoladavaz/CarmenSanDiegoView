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

@SuppressWarnings("all")
public class VentanaPistasView extends SimpleWindow<Lugar> {
  public VentanaPistasView(final WindowOwner owner, final Lugar model) {
    super(owner, model);
  }
  
  protected void createMainTemplate(final Panel mainPanel) {
    Lugar _modelObject = this.getModelObject();
    String _string = _modelObject.toString();
    this.setTitle(_string);
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    mainPanel.setWidth(300);
    Label _label = new Label(mainPanel);
    _label.setText("Estas visitando: ");
    Label _label_1 = new Label(mainPanel);
    Lugar _modelObject_1 = this.getModelObject();
    String _string_1 = _modelObject_1.toString();
    _label_1.setText(_string_1);
    Label _label_2 = new Label(mainPanel);
    Lugar _modelObject_2 = this.getModelObject();
    String _ocupanteInforma = _modelObject_2.ocupanteInforma();
    _label_2.setText(_ocupanteInforma);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Aceptar");
        final Action _function = new Action() {
          public void execute() {
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
