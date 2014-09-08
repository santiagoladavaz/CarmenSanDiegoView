package paisView;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.uqbar.commons.utils.Observable;
import pais.Banco;
import pais.Lugar;
import pais.Pais;

@Observable
@SuppressWarnings("all")
public class Juego {
  private static Juego JUEGO = new Juego();
  
  private List<Pais> _paises = new ArrayList<Pais>();
  
  public List<Pais> getPaises() {
    return this._paises;
  }
  
  public void setPaises(final List<Pais> paises) {
    this._paises = paises;
  }
  
  private List<Lugar> _lugares = new ArrayList<Lugar>();
  
  public List<Lugar> getLugares() {
    return this._lugares;
  }
  
  public void setLugares(final List<Lugar> lugares) {
    this._lugares = lugares;
  }
  
  public static Juego getInstance() {
    return Juego.JUEGO;
  }
  
  public Juego() {
    List<Pais> _paises = this.getPaises();
    final Procedure1<List<Pais>> _function = new Procedure1<List<Pais>>() {
      public void apply(final List<Pais> it) {
        Pais _pais = new Pais("Argentina");
        it.add(_pais);
        Pais _pais_1 = new Pais("Brasil");
        it.add(_pais_1);
        Pais _pais_2 = new Pais("Uruguay");
        it.add(_pais_2);
      }
    };
    ObjectExtensions.<List<Pais>>operator_doubleArrow(_paises, _function);
    List<Lugar> _lugares = this.getLugares();
    final Procedure1<List<Lugar>> _function_1 = new Procedure1<List<Lugar>>() {
      public void apply(final List<Lugar> it) {
        Banco _banco = new Banco("BANCO - Provincia");
        it.add(_banco);
      }
    };
    ObjectExtensions.<List<Lugar>>operator_doubleArrow(_lugares, _function_1);
  }
  
  public Pais buscarPais(final Pais string) {
    Pais _xblockexpression = null;
    {
      InputOutput.<Pais>print(string);
      List<Pais> _paises = this.getPaises();
      final Function1<Pais, Boolean> _function = new Function1<Pais, Boolean>() {
        public Boolean apply(final Pais p) {
          String _nombre = p.getNombre();
          String _nombre_1 = string.getNombre();
          return Boolean.valueOf(Objects.equal(_nombre, _nombre_1));
        }
      };
      Iterable<Pais> _filter = IterableExtensions.<Pais>filter(_paises, _function);
      _xblockexpression = ((Pais[])Conversions.unwrapArray(_filter, Pais.class))[0];
    }
    return _xblockexpression;
  }
}
