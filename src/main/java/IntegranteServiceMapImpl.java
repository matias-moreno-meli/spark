import java.util.Collection;
import java.util.HashMap;

public class IntegranteServiceMapImpl implements IntegranteService {


    private HashMap<String, Integrante> integranteMap;

    public IntegranteServiceMapImpl() {
        this.integranteMap = new HashMap<String, Integrante>();
    }

    @Override
    public void addIntegrante(Integrante integrante) {

    }

    @Override
    public Collection<Integrante> getIntegrantes() {
        return null;
    }

    @Override
    public Integrante getIntegrante(String id) {
        return null;
    }

    @Override
    public Integrante editIntegrante(Integrante integrante) throws IntegranteException {
        return null;
    }

    @Override
    public void deleteIntegrante(String id) {

    }

    @Override
    public boolean integranteExist(String id) {
        return false;
    }
}
