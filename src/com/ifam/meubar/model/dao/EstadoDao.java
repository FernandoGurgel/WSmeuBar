package com.ifam.meubar.model.dao;

import java.util.ArrayList;
import java.util.List;
import com.ifam.meubar.model.bean.EstadoBean;

public class EstadoDao extends Conexao {
	
	String query = null;
	String msg = null;
	
	public String inserir(EstadoBean bean){
		try{
			super.conectar();
			query = "call sp_insertEstado('"+bean.getEdescricao()+"');";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg = getResultSet().getString("msg");
			}
			System.out.println(msg);
			return msg;
		}catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			return "error";
		}finally {
			super.fecharConexao();
		}
	}
	
	public String excluir(EstadoBean bean){
		try{
			super.conectar();
			query = "call sp_deleteEstado("+bean.getEcodigo()+");";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg  = super.getResultSet().getString(1);
			}
			return  msg;
		}catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			return null;
		}finally {
			super.fecharConexao();
		}
	}
	
	public String altera(EstadoBean bean){
		try{
			super.conectar();
			query = "call sp_updateEstado("+bean.getEcodigo()+",'"+bean.getEdescricao()+"');";			
			super.executarSQL(query);
			while(super.getResultSet().next()){
				msg = super.getResultSet().getString("msg");
			}
			return msg;
		}catch (Exception e) {
			System.out.println("--------- Error Classe dao -------");
			e.printStackTrace();
			return "error";
		}finally {
			super.fecharConexao();
		}
	}
	
	public List<EstadoBean> lista(){
		ArrayList<EstadoBean> lista = new ArrayList<>();
		try{
			super.conectar();
			query = "select * from vw_listaEstado;";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				lista.add(new EstadoBean(
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
