
public class Students {
	private int Id;
	private String FirstName;
	private String SurName;
	private String Patronymic;
	private int GroupId;
	private String Sex;
	private String DateOfBirth;
	private int EducationYear;
	
	public Students(int id,String surName,String firstName,
			String patronymic, int groupId,String sex,String dateOfBirth,int educationYear){
		
		this.Id = id;
		this.SurName = surName;
		this.FirstName = firstName;
		this.Patronymic = patronymic;
		this.GroupId = groupId;
		this.Sex = sex;
		this.DateOfBirth = dateOfBirth;
		this.EducationYear = educationYear; 
	}
	
	public int getId(){
		return this.Id;
	}
	
	
	public String getFirstName(){
		return this.FirstName;
	}
	
	public String getSurName(){
		return this.SurName;
	} 
	
	public String getPatronymic(){
		return this.Patronymic;
	} 
	
	public int getGroupId(){
		return this.GroupId;
	} 
	
	public String getSex(){
		return this.Sex;
	} 
	
	public String getDateOfBirth(){
		return this.DateOfBirth;
	} 
	public int getEducationYear(){
		return this.EducationYear;
	} 
	
}
