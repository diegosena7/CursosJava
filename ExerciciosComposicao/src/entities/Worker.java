package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();
	
	//Construtor com parametros
	public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}
	

	
	//Getters and setters
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public WorkerLevel getLevel() {
		return level;
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}


	public Departament getDepartament() {
		return departament;
	}


	public void setDepartament(Departament departament) {
		this.departament = departament;
	}


	public List<HourContract> getContracts() {
		return contracts;
	}

	//M�todos
	public void addContract(HourContract contract) {//adicionando contrato na lista
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {//removendo contrato na lista
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double soma = baseSalary;
		
		Calendar calendario = Calendar.getInstance();
		
		for(HourContract c : contracts) {
			//Buscando ano e m�s atrav�s do Calendar
			calendario.setTime(c.getDate());
			int c_year = calendario.get(Calendar.YEAR);
			int c_month = 1 + calendario.get(Calendar.MONTH);
			
			if(year == c_year && month == c_month) {
				soma += c.totalValue();
			}
		}
		
		return soma;
	}
	
}
