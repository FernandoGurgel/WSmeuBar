package com.ifam.meubar.model.dao;

import java.util.ArrayList;
import java.util.List;
import com.ifam.meubar.model.bean.ProdutoBean;


public class ProdutoDao extends Conexao{

	String msg, query = null;
	
	public String inserir(ProdutoBean bean){
		try {
			super.conectar();
			query = "call sp_insertProduto ('"+bean.getPdescricao()+"',"+bean.getPestoque()+","+bean.getProgrpcodigo()+");";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg = getResultSet().getString("msg");
			}
			return msg;
		} catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			msg = "Error ao cadastra produto";
			return msg;
		}finally {
			super.fecharConexao();
		}
	}
	
	public String excluir(ProdutoBean bean){
		try {
			super.conectar();
			query = "call sp_deleteProduto("+bean.getPcodigo()+");";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg = getResultSet().getString("msg");
			}
			return msg;
		} catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			msg = "Error ao excluir produto";
			return msg;
		}finally {
			super.fecharConexao();
		}
	}
	
	public String altera(ProdutoBean bean){
		try {
			super.conectar();
			query = "call sp_updateProduto("+bean.getPcodigo()+",'"+bean.getPdescricao()+"',"+bean.getPestoque()+","+bean.getProgrpcodigo()+");";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg = getResultSet().getString("msg");
			}
			return msg;
		} catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			msg = "Error ao atualizar produto";
			return msg;
		}finally {
			super.fecharConexao();
		}
	}
	
	public List<ProdutoBean> lista(){
		ArrayList<ProdutoBean> lista = new ArrayList<>();
		try{
			super.conectar();
			query = "select * from vw_listaProduto;";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				lista.add(new ProdutoBean(
						super.getResultSet().getInt(1),
						super.getResultSet().getString(2),
						super.getResultSet().getInt(3),
						super.getResultSet().getInt(4)));
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
