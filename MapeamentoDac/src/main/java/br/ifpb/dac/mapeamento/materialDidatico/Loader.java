package br.ifpb.dac.mapeamento.materialdidatico;

import br.ifpb.dac.mapeamento.materialdidatico.DAO;
import br.ifpb.dac.mapeamento.materialdidatico.TipoMaterialDidatico;
import br.ifpb.dac.mapeamento.materialdidatico.MaterialDidatico;

/**
 *
 * @author Rodger
 */
public class NewMain {

    public static void main(String[] args) throws Exception {

        DAO materialDidaticoDAO = new DAO();

        MaterialDidatico materialDidatico = new MaterialDidatico(
            "Origem", "Titulo", "Descricao", "Autor", 10, true ,TipoMaterialDidatico.APOSTILA
        );

        MaterialDidatico materialDidatico2 = new MaterialDidatico(
            "Origem 2", "Titulo 2", "Descricao 2", "Autor 2", 20, true,TipoMaterialDidatico.APRESENTACAO
        );

        MaterialDidatico materialDidatico3 = new MaterialDidatico(
            "Origem 3", "Titulo 3", "Descricao 3", "Autor 3", 30, true,TipoMaterialDidatico.VIDEOAULA
        );
        
        materialDidaticoDAO.salvar(materialDidatico);
        materialDidaticoDAO.salvar(materialDidatico2);
        materialDidaticoDAO.salvar(materialDidatico3);

    }

}