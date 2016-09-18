package com.ifam.meubar.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ifam.meubar.model.bean.EmpresaBean;

public class Empresa extends Conexao{


	String msg, query = null;
	
	public String inserir(EmpresaBean bean){
		try {
			super.conectar();
			query = "call sp_insertEmpresa ('"+bean.getEmpNome()+"','"+bean.getEmpCnpj()+"','"+bean.getEmpComplemento()+"',"+bean.getEmpLogCodigo()+");";
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
	
	public String excluir(EmpresaBean bean){
		try {
			super.conectar();
			query = "call sp_deleteEmpresa("+bean.getEmpCodigo()+");";
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
	
	public String altera(EmpresaBean bean){
		try {
			super.conectar();
			query = "call sp_updateEmpresa("+bean.getEmpCodigo()+",'"+bean.getEmpNome()+"','"+bean.getEmpCnpj()+"','"+bean.getEmpComplemento()+"',"+bean.getEmpLogCodigo()+");";
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
	
	public List<EmpresaBean> lista(){
		ArrayList<EmpresaBean> lista = new ArrayList<>();
		try{
			super.conectar();
			query = "select * from vw_listaEmpresa;";
			super.executarSQL(query);
			while(super.getResultSet().next()){
				lista.add(new EmpresaBean(
						super.getResultSet().getInt(1),
						super.getResultSet().getString(2),
						super.getResultSet().getString(3),
						super.getResultSet().getString(4),
						super.getResultSet().getInt(5)));
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
