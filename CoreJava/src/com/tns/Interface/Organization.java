package com.tns.Interface;


interface TechnicalRole{
	void designArchitecture();
}

interface ManagementRole{
	void ManageTeam();
}

class ProjectManager implements TechnicalRole,ManagementRole{
	private String name;
	private String Projectname;
	private int teamsize;
	private double ProjectBudget;
	
	public ProjectManager(String name, String Projectname,int teamsize,double ProjectBudget ){
		super();
		this.name=name;
		Projectname=Projectname;
		this.teamsize=teamsize;
		this.ProjectBudget=ProjectBudget;
		
	}

	@Override
	public void ManageTeam() {
		// TODO Auto-generated method stub
		System.out.println("managing a team of"+teamsize+"developers");
	}

	@Override
	public void designArchitecture() {
		// TODO Auto-generated method stub
		System.out.println(name+"is architecture for"+Projectname);
	}
	
	void checkBudget() {
		if(ProjectBudget>1000000) {
			System.out.println("high budget");
		}
		else
	}
	
}
public class Organization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
