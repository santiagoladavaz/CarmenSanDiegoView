package components

import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.List

class Lista {
	
	
	new(Panel panel,String bindItem){
		new List(panel) => [
			bindItemsToProperty(bindItem)
			heigth = 100
			width = 500
		]
		
	}
	
	
	//Usado cuando tengo que ponerle un label
	new(Panel panel,String label, String lista){
		new Label(panel).setText(label)
		new List(panel) => [
			bindItemsToProperty(lista)
			heigth = 100
			width = 500
		]
	}
	
	
	//Usado cuando NO tengo que ponerle label y uso 2 bindings
	new(Panel panel,String bindItem,String bindValue,String s){
		new List(panel) => [
			bindItemsToProperty(bindItem)
			bindValueToProperty(bindValue)
			heigth = 100
			width = 500
		]
	}
	
	
	new(Panel panel,String text,String bindItem,String bindValue,Integer h,Integer w){
		new Label(panel).text = text
		new List(panel) => [
				bindItemsToProperty(bindItem)
				heigth = h
				width = w
				bindValueToProperty(bindValue)
			]
	}
	
	
	
}