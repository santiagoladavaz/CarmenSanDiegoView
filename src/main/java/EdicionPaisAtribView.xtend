import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.tables.Column
import org.uqbar.arena.widgets.tables.Table
import org.uqbar.arena.windows.Dialog
import org.uqbar.arena.windows.WindowOwner
import pais.Pais

abstract class EdicionPaisAtribView extends Dialog<Pais>{
	
	
	new(WindowOwner owner, Pais model) {
		super(owner, model)
	}
	
	abstract override def String getTitle()
	
	abstract  def String getTitleTable()
	
	
	override createContents(Panel mainPanel) {
		this.setTitle(this.getTitle())
		mainPanel.setLayout(new VerticalLayout)	
		
	var Table<String> y = new Table<String>(mainPanel,String)
	y.heigth = 100
	new Column<String>(y)=>[
 		title= getTitleTable()
 		bindContentsToTransformer([hobbies|hobbies])
	]
	
	
	}
}