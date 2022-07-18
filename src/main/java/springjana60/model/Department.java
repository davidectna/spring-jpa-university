package springjana60.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // We also have AUTO, TABLE, SEQUENCE
	private Integer id;
	private String name ;
	private String address ;
	private String phone;
	private String website ;
	private String headOfDepartment ;
	
	@OneToMany
	@JoinColumn(name="id")
	private List <Degree> degrees;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getHeadOfDepartments() {
		return headOfDepartment;
	}
	public void setHeadOfDepartments(String headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
	
}
