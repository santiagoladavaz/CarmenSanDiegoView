package components;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.List;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class Lista {
  public Lista(final Panel panel, final String bindItem) {
    List<Object> _list = new List<Object>(panel);
    final Procedure1<List<Object>> _function = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty(bindItem);
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function);
  }
  
  public Lista(final String value, final Panel panel, final String label, final String lista) {
    Label _label = new Label(panel);
    _label.setText(label);
    List<Object> _list = new List<Object>(panel);
    final Procedure1<List<Object>> _function = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty(lista);
        it.<ControlBuilder>bindValueToProperty(value);
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function);
  }
  
  public Lista(final Panel panel, final String label, final String lista) {
    Label _label = new Label(panel);
    _label.setText(label);
    List<Object> _list = new List<Object>(panel);
    final Procedure1<List<Object>> _function = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty(lista);
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function);
  }
  
  public Lista(final Panel panel, final String bindItem, final String bindValue, final String s) {
    List<Object> _list = new List<Object>(panel);
    final Procedure1<List<Object>> _function = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty(bindItem);
        it.<ControlBuilder>bindValueToProperty(bindValue);
        it.setHeigth(100);
        it.setWidth(500);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function);
  }
  
  public Lista(final Panel panel, final String text, final String bindItem, final String bindValue, final Integer h, final Integer w) {
    Label _label = new Label(panel);
    _label.setText(text);
    List<Object> _list = new List<Object>(panel);
    final Procedure1<List<Object>> _function = new Procedure1<List<Object>>() {
      public void apply(final List<Object> it) {
        it.bindItemsToProperty(bindItem);
        it.setHeigth((h).intValue());
        it.setWidth((w).intValue());
        it.<ControlBuilder>bindValueToProperty(bindValue);
      }
    };
    ObjectExtensions.<List<Object>>operator_doubleArrow(_list, _function);
  }
}
