package br.com.ezzysoft.restaurante.bean.cad;

import br.com.ezzysoft.restaurante.bean.InterfaceCad;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Christian Medeiros <christian.souza@gmail.com>
 */
@ManagedBean(name = "MBGrupoCad")
@SessionScoped
public class MBGrupoCad implements InterfaceCad {

    @Override
    public void cadOnLoad() {
    }

    @Override
    public void cadOpen() {
    }

    @Override
    public void cadRemove() {
    }

    @Override
    public void cadSave() {
    }

    @Override
    public boolean cadValidate() {
        return true;
    }

}
