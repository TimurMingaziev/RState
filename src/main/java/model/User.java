package model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String name;
	@Column
	private String fam;
	@Column
	private String lastName;
	@Column
	private String telephone;
	
	@OneToMany
	private List<RealState> realStates;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "record_id", cascade = CascadeType.ALL)
	private Record record;
	
	public Record getRecord() {
		return record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public User() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFam() {
		return fam;
	}
	public void setFam(String fam) {
		this.fam = fam;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	public List<RealState> getRealStates() {
		return realStates;
	}

	public void setRealStates(List<RealState> realStates) {
		this.realStates = realStates;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", fam=" + fam + ", lastName=" + lastName + ", telephone="
				+ telephone + "]";
	}
	
	
}
