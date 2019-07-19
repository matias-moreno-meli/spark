import java.util.Collection;

public interface IntegranteService {

    void addIntegrante(Integrante integrante);

    Collection<Integrante> getIntegrantes();

    Integrante getIntegrante(String id);

    Integrante editIntegrante(Integrante integrante) throws IntegranteException;

    void deleteIntegrante(String id);

    boolean integranteExist(String id);
}
