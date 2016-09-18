package com.ifam.meubar.model.dao;

import java.util.ArrayList;
import java.util.List;
import com.ifam.meubar.model.bean.LogradouroBean;

public class LogradouroDao extends Conexao{

	String msg, query = null;
	
	public String inserir(LogradouroBean bean){
		try {
			super.conectar();
			query = "call sp_insertLogradouro ('"+bean.getLogDescricao()+"',"+bean.getLogbaicodigo()+");";
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
	
	public String excluir(LogradouroBean bean){
		try {
			super.conectar();
			query = "call sp_deleteLogradouro("+bean.getLogCodigo()+");";
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
	
	public String altera(LogradouroBean bean){
		try {
			super.conectar();
			query = "call sp_updateLogradouro("+bean.getLogCodigo()+",'"+bean.getLogDescricao()+"',"+bean.getLogbaicodigo()+");";
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
	
	public List<LogradouroBean> lista(){
		ArrayList<LogradouroBean> lista = new ArrayList<>();
		try{
			super.conectar();
			query = "select * from vw_listaLogradouro;";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				lista.add(new LogradouroBean(
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
