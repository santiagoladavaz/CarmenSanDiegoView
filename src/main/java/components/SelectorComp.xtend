package components

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Selector

class SelectorComp {
	
	new(Panel panel,String text,String bindItem,String bindValue){
		new Label(panel).setText(text)
			new Selector(panel) => [
				allowNull = false
				bindItemsToProperty(bindItem)
				bindValueToProperty(bindValue)
			]
	}
	

}