package components;

import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.arena.widgets.Label;
import org.uqbar.arena.widgets.Panel;
import org.uqbar.arena.widgets.Selector;
import org.uqbar.lacar.ui.model.ControlBuilder;

@SuppressWarnings("all")
public class SelectorComp {
  public SelectorComp(final Panel panel, final String text, final String bindItem, final String bindValue) {
    Label _label = new Label(panel);
    _label.setText(text);
    Selector<Object> _selector = new Selector<Object>(panel);
    final Procedure1<Selector<Object>> _function = new Procedure1<Selector<Object>>() {
      public void apply(final Selector<Object> it) {
        it.allowNull(false);
        it.bindItemsToProperty(bindItem);
        it.<ControlBuilder>bindValueToProperty(bindValue);
      }
    };
    ObjectExtensions.<Selector<Object>>operator_doubleArrow(_selector, _function);
  }
}
