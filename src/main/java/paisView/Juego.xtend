package paisView
import pais.Pais
import java.util.List
import java.util.ArrayList
import org.uqbar.commons.utils.Observable
import pais.Lugar
import pais.Banco

@Observable
class Juego {
	
 private static Juego JUEGO = new Juego
 @Property  List<Pais> paises = new ArrayList<Pais>
 @Property List<Lugar>lugares = new ArrayList<Lugar>
 
 
  
  def static Juego getInstance(){
 	return  JUEGO
 }
	
	
	new(){
		paises =>[
			add(new Pais("Argentina"))
			add(new Pais("Brasil"))
			add(new Pais("Uruguay"))
		]
		lugares =>[ add(new Banco("BANCO - Provincia"))
		            ]
		
	}
	
	def Pais buscarPais(Pais string) {
		print(string)
		paises.filter[p| p.nombre == string.nombre].get(0)
	}
	
	
}