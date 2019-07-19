import com.google.gson.Gson;

import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {

        get("/hola", (req, res) -> "hola mundo");

        IntegranteService integranteService = new IntegranteServiceMapImpl();

        post("/integrantes", (req, res) -> {
            res.type("application/json");
            Integrante integrante = new Gson().fromJson(req.body(), Integrante.class);
            integranteService.addIntegrante(integrante);
            return new Gson().toJson(new StandardResponse((StatusResponse.SUCCESS)));
        });

    }
}