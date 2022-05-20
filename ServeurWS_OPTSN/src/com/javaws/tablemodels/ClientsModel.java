package com.javaws.tablemodels;
/**********************************************************************************************************************************************************/
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.AbstractTableModel;

import com.javaws.entities.Clients;
import com.javaws.entities.ServiceActive;
import com.javaws.entities.TypeClient;
/**********************************************************************************************************************************************************/
public class ClientsModel extends AbstractTableModel {
	private static final long serialVersionUID = 1L;
	public static final int OBJECT_COL = -1;
/**********************************************************************************************************************************************************/
	
	private Vector<Object[]> rows = new Vector<Object[]>();
	
	private List<Clients> client = new ArrayList<Clients>();
	
	private String[] columns = {"Id", "DateCreation", "NumeroTel", "Type", "data" ,"Services","Services2","Services3","Services4","Services5"};
	
	public ClientsModel() {}
/**********************************************************************************************************************************************************/

	@Override
	public int getColumnCount() {
		return columns.length;
	}
/**********************************************************************************************************************************************************/

	@Override
	public int getRowCount() {		
		return rows.size();
	}
/**********************************************************************************************************************************************************/

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
			case OBJECT_COL : return client.get(rowIndex);
			default : return rows.get(rowIndex)[columnIndex];
		}
	}
/**********************************************************************************************************************************************************/

	public List<Clients> getUser() {
		return client;
	}
/**********************************************************************************************************************************************************/
	
	@Override
	public String getColumnName(int column) {
		return columns[column];
	}
/**********************************************************************************************************************************************************/
	
	public void setUser (List<Clients> client) {		
		rows.clear();
		this.client.clear();
		this.client.addAll(0, client);
		
		for (Clients clients : client ){
			
			rows.add( new Object [] {
					clients.getId(), 
					clients.getDate(),
					clients.getNumeroTel(),
					clients.getType(),
					clients.isActivedata(),
					//clients.getListeService(),
					clients.getSms(),
					clients.getAppels(),
					clients.getHotline(),
					clients.getRenvoiappel(),
					clients.getRoaming()
				});
		}
		
		fireTableDataChanged();
	}
/**********************************************************************************************************************************************************/
	
	public void delete(Clients clients) {
		int indexOf = client.indexOf(clients);
		client.remove(clients);
		rows.remove(indexOf);
		
		fireTableDataChanged();
	}
/**********************************************************************************************************************************************************/

	public void update (int id,String date,String numero,TypeClient type,boolean activedata,List<ServiceActive> listeService) {
		Clients clients = new Clients(id,date,numero,type,activedata,listeService);
		int indexOf = client.indexOf(clients);
		client.get(indexOf).setDate(date);
		client.get(indexOf).setNumeroTel(numero);
		client.get(indexOf).setType(type);
		client.get(indexOf).setListeService(listeService);
		Object [] obj = rows.get(indexOf);
		obj[0] = id;
		obj[1] = date;
		obj[2] = numero;
		obj[3] = type;
		obj[4] = activedata;
		for(int i = 0; i < listeService.size() ; i ++) {
		obj[i+5] = listeService.get(i).name();
		}
		
		fireTableDataChanged();
	}
/**********************************************************************************************************************************************************/

	public void add(int id,String date,String numero,TypeClient type, boolean activedata, String sms,String appel,String hot,String renvoie,String roa) {
		Clients clients = new Clients(id,date,numero,type, activedata,sms,appel,hot,renvoie,roa);
		client.add(clients);
		rows.add( new Object [] {
				clients.getId(),
				clients.getDate(),
				clients.getNumeroTel(),
				clients.getType(),
				clients.isActivedata(),
				clients.getSms(),
				clients.getAppels(),
				clients.getHotline(),
				clients.getRenvoiappel(),
				clients.getRoaming()
				
		});
		
		fireTableDataChanged();
	}
/**********************************************************************************************************************************************************/
	
	public void clear() {
		rows.clear();
		this.client.clear();
		
		fireTableDataChanged();
	}
}
/**********************************************************************************************************************************************************/