import pais.Pais
import java.util.List
import java.util.ArrayList
import org.uqbar.commons.utils.Observable

@Observable
class Juego {
	
 private static Juego JUEGO = new Juego
 @Property  List<Pais> paises = new ArrayList<Pais>
 
 
  
  def static Juego getInstance(){
 	return  JUEGO
 }
	
	
	new(){
		paises =>[
			add(new Pais("Argentina"))
			add(new Pais("Brasil"))
			add(new Pais("Uruguay"))
		]
		
	}
	
	def Pais buscarPais(Pais string) {
		print(string)
		paises.filter[p| p.nombre == string.nombre].get(0)
	}
	
	
}