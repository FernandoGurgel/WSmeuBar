package com.ifam.meubar.model.dao;

import java.util.ArrayList;
import java.util.List;
import com.ifam.meubar.model.bean.ClienteBean;

public class ClienteDao extends Conexao{
	
	String query = null;
	String msg = null;
	
	public String inserir(ClienteBean bean){
		try{
			super.conectar();
			query = "call sp_insertCliente('"+bean.getNome()+"','"+bean.getTelefone()+"');";
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
	
	public String excluir(ClienteBean bean){
		try{
			super.conectar();
			query = "call sp_deleteCliente("+bean.getCodigo()+");";
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
	
	public String altera(ClienteBean bean){
		try{
			super.conectar();
			if (bean.getNome() == null){
				query = "call sp_updateCliente("+bean.getCodigo()+",null,'"+bean.getTelefone()+"');";
			}else if (bean.getTelefone() == null){
				query = "call sp_updateCliente("+bean.getCodigo()+",'"+bean.getNome()+"',null);";
			}else{
				query = "call sp_updateCliente("+bean.getCodigo()+",'"+bean.getNome()+"','"+bean.getTelefone()+"');";
			}
			
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
	
	public List<ClienteBean> lista(){
		ArrayList<ClienteBean> lista = new ArrayList<>();
		try{
			super.conectar();
			query = "select * from vw_cliente;";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				lista.add(new ClienteBean(
						super.getResultSet().getInt("clicodigo"),
						super.getResultSet().getString("clinome"),
						super.getResultSet().getString("clitelefone")));
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
