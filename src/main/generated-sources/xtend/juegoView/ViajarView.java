package juegoView;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.layout.VerticalLayout;
import org.uqbar.arena.widgets.Button;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.windows.SimpleWindow;
import org.uqbar.arena.windows.WindowOwner;
import org.uqbar.lacar.ui.model.Action;
import org.uqbar.lacar.ui.model.ControlBuilder;
import persona.DetectiveApplicationModel;

@SuppressWarnings("all")
public class ViajarView extends SimpleWindow<DetectiveApplicationModel> {
  public ViajarView(final WindowOwner parent, final DetectiveApplicationModel model) {
    super(parent, model);
  }
  
  protected void addActions(final Panel actionsPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  protected void createFormPanel(final Panel mainPanel) {
    throw new UnsupportedOperationException("TODO: auto-generated method stub");
  }
  
  public void createMainTemplate(final Panel mainPanel) {
    this.setTitle("Viajar");
    VerticalLayout _verticalLayout = new VerticalLayout();
    mainPanel.setLayout(_verticalLayout);
    Label _label = new Label(mainPanel);
    _label.setText("Estas en:");
    Label _label_1 = new Label(mainPanel);
    _label_1.<ControlBuilder>bindValueToProperty("juego.detective.paisActual");
    Label _label_2 = new Label(mainPanel);
    final Procedure1<Label> _function = new Procedure1<Label>() {
      public void apply(final Label it) {
        it.setText("Posibles destinos");
      }
    };
    ObjectExtensions.<Label>operator_doubleArrow(_label_2, _function);
    List<Object> _list = new List<Object>(mainPanel);
    final Procedure1<List<Object>> _function_1 = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty("juego.detective.paisActual.conexiones");
        it.setHeigth(100);
        it.setWidth(300);
        it.<ControlBuilder>bindValueToProperty("nuevoDestino");
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function_1);
    Button _button = new Button(mainPanel);
    final Procedure1<Button> _function_2 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Volver al pais anterior");
        final Action _function = new Action() {
          public void execute() {
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button, _function_2);
    Button _button_1 = new Button(mainPanel);
    final Procedure1<Button> _function_3 = new Procedure1<Button>() {
      public void apply(final Button it) {
        it.setCaption("Viajar");
        final Action _function = new Action() {
          public void execute() {
            DetectiveApplicationModel _modelObject = ViajarView.this.getModelObject();
            _modelObject.viajar();
            ViajarView.this.close();
          }
        };
        it.onClick(_function);
      }
    };
    ObjectExtensions.<Button>operator_doubleArrow(_button_1, _function_3);
  }
}
