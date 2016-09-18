package com.ifam.meubar.model.dao;

import java.util.ArrayList;
import java.util.List;
import com.ifam.meubar.model.bean.GrupoProdutoBean;

public class GrupoProdutoDao extends Conexao{
	
	String msg, query = null;
	
	public String inserir(GrupoProdutoBean bean){
		try {
			super.conectar();
			query = "call sp_insertGrupoProduto ('"+bean.getGpdescricao()+"');";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg = getResultSet().getString("msg");
			}
			return msg;
		} catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			msg = "Error ao cadastra grupo";
			return msg;
		}finally {
			super.fecharConexao();
		}
	}
	
	public String excluir(GrupoProdutoBean bean){
		try {
			super.conectar();
			query = "call sp_deleteGrupoProduto("+bean.getGpcodigo()+");";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg = getResultSet().getString("msg");
			}
			return msg;
		} catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			msg = "Error ao excluir grupo";
			return msg;
		}finally {
			super.fecharConexao();
		}
	}
	
	public String altera(GrupoProdutoBean bean){
		try {
			super.conectar();
			query = "call sp_updateGrupoProduto("+bean.getGpcodigo()+",'"+bean.getGpdescricao()+"');";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg = getResultSet().getString("msg");
			}
			return msg;
		} catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			msg = "Error ao atualizar grupo";
			return msg;
		}finally {
			super.fecharConexao();
		}
	}
	
	public List<GrupoProdutoBean> lista(){
		ArrayList<GrupoProdutoBean> lista = new ArrayList<>();
		try{
			super.conectar();
			query = "select * from vw_grupoProduto;";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				lista.add(new GrupoProdutoBean(
						super.getResultSet().getInt(1),
						super.getResultSet().getString(2)));
			}
			return lista;
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			super.fecharConexao();
		}
	}	
}
