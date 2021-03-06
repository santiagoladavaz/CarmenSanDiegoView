package juegoView;

import Juego.Juego;
import juegoView.GanoJuegoView;
import juegoView.PerdioJuegoView;
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
import pais.Pais;
import persona.Detective;

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
            boolean _isGano = _modelObject.isGano();
            if (_isGano) {
              LugarApplicationModel _modelObject_1 = VentanaPistasView.this.getModelObject();
              Juego _juego = _modelObject_1.getJuego();
              GanoJuegoView _ganoJuegoView = new GanoJuegoView(VentanaPistasView.this, _juego);
              _ganoJuegoView.open();
            }
            LugarApplicationModel _modelObject_2 = VentanaPistasView.this.getModelObject();
            Juego _juego_1 = _modelObject_2.getJuego();
            LugarApplicationModel _modelObject_3 = VentanaPistasView.this.getModelObject();
            Juego _juego_2 = _modelObject_3.getJuego();
            Detective _detective = _juego_2.getDetective();
            Pais _paisActual = _detective.getPaisActual();
            LugarApplicationModel _modelObject_4 = VentanaPistasView.this.getModelObject();
            Lugar _lugar = _modelObject_4.getLugar();
            boolean _perdio = _juego_1.perdio(_paisActual, _lugar);
            if (_perdio) {
              LugarApplicationModel _modelObject_5 = VentanaPistasView.this.getModelObject();
              Juego _juego_3 = _modelObject_5.getJuego();
              PerdioJuegoView _perdioJuegoView = new PerdioJuegoView(VentanaPistasView.this, _juego_3);
              _perdioJuegoView.open();
            }
            LugarApplicationModel _modelObject_6 = VentanaPistasView.this.getModelObject();
            _modelObject_6.setPaisEnLista();
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
