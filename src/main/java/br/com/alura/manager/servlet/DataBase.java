package br.com.alura.manager.servlet;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
	private static List<Company> list = new ArrayList<Company>();
	
	public void add(Company company) {
		list.add(company);
	}
	
	public List<Company> getCompanys() {
		return DataBase.list;
	}
}
