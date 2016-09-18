package com.ifam.meubar.model.dao;

import java.util.ArrayList;
import java.util.List;
import com.ifam.meubar.model.bean.BairroBean;


public class BarrioDao extends Conexao{

	String msg, query = null;
	
	public String inserir(BairroBean bean){
		try {
			super.conectar();
			query = "call sp_insertBairro ('"+bean.getBaidescricao()+"',"+bean.getBaicidcodigo()+");";
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
	
	public String excluir(BairroBean bean){
		try {
			super.conectar();
			query = "call sp_deleteBairro("+bean.getBaicodigo()+");";
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
	
	public String altera(BairroBean bean){
		try {
			super.conectar();
			query = "call sp_updateBairro("+bean.getBaicodigo()+",'"+bean.getBaidescricao()+"',"+bean.getBaicidcodigo()+");";
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
	
	public List<BairroBean> lista(){
		ArrayList<BairroBean> lista = new ArrayList<>();
		try{
			super.conectar();
			query = "select * from vw_listaLogradouro;";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				lista.add(new BairroBean(
						super.getResultSet().getInt(1),
						super.getResultSet().getString(2),
						super.getResultSet().getInt(3)));
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
