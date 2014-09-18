package juegoView;

import Juego.Juego;
import Juego.JuegoAppModel;
import juegoView.InicioJuegoView;
import juegoView.MapamundiView;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.HorizontalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.MainWindow;
import org.uqbar.lacar.ui.model.Action;
import persona.VillanoApplicationModel;
import villanoView.ExpedientesView;

@SuppressWarnings("all")
public class JuegoView extends MainWindow<Juego> {
  public JuegoView(final Juego model) {
    super(model);
  }
  
  public void createContents(final Panel mainPanel) {
    this.setTitle("¿Donde esta Carmen Sandiego?");
    HorizontalLayout _horizontalLayout = new HorizontalLayout();
    mainPanel.setLayout(_horizontalLayout);
    Label _label = new Label(mainPanel);
    _label.setText("¿Que haremos ahora detective?");
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Resolver Misterio");
        final Action _function = new Action() {
          public void execute() {
            Juego _modelObject = JuegoView.this.getModelObject();
            InicioJuegoView _inicioJuegoView = new InicioJuegoView(JuegoView.this, _modelObject);
            _inicioJuegoView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function);
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_1 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Mapamundi");
        final Action _function = new Action() {
          public void execute() {
            JuegoAppModel _juegoAppModel = new JuegoAppModel();
            MapamundiView _mapamundiView = new MapamundiView(JuegoView.this, _juegoAppModel);
            _mapamundiView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_1);
    Button _button_2 = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Expedientes");
        final Action _function = new Action() {
          public void execute() {
            VillanoApplicationModel _villanoApplicationModel = new VillanoApplicationModel();
            ExpedientesView _expedientesView = new ExpedientesView(JuegoView.this, _villanoApplicationModel);
            _expedientesView.open();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_2, _function_2);
  }
  
  public static void main(final String[] args) {
    Juego j = new Juego();
    JuegoView _juegoView = new JuegoView(j);
    _juegoView.startApplication();
  }
}
