import com.app.cinema.model.*;
import com.app.cinema.service.*;
import com.app.cinema.view.*;
import com.app.cinema.service.*;

import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {

        Atendente atendente = new Atendente();
        Estoque estoque = new Estoque();

        try {


            while (true) {

                int escolha1 = atendente.Menu();

                estoque.GerenciamentoDeFilmes(atendente,escolha1);

            }
        }catch (InputMismatchException error){
            atendente.saindo();
            main(args);
        }
    }

}
