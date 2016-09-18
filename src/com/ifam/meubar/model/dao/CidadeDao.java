package com.ifam.meubar.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ifam.meubar.model.bean.CidadeBean;

public class CidadeDao extends Conexao{
String msg, query = null;
	
	public String inserir(CidadeBean bean){
		try {
			super.conectar();
			query = "call sp_insertCidade ('"+bean.getCiddescricao()+"',"+bean.getCidestcodigo()+");";
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
	
	public String excluir(CidadeBean bean){
		try {
			super.conectar();
			query = "call sp_deleteCidade("+bean.getCidCodigo()+");";
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
	
	public String altera(CidadeBean bean){
		try {
			super.conectar();
			query = "call sp_updateCidade("+bean.getCidCodigo()+",'"+bean.getCiddescricao()+"',"+bean.getCidestcodigo()+");";
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
	
	public List<CidadeBean> lista(){
		ArrayList<CidadeBean> lista = new ArrayList<>();
		try{
			super.conectar();
			query = "select * from vw_cidade;";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				lista.add(new CidadeBean(
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
