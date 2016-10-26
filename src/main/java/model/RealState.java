package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RealState")
public class RealState {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String realStateName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "record_id", cascade = CascadeType.ALL)
	private Record record;
	
	public User getUser() {
		return this.user;
	}
	
	public RealState() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return realStateName;
	}
	public void setName(String name) {
		this.realStateName = name;
	}

	@Override
	public String toString() {
		return "RealState [id=" + id + ", name=" + realStateName + ", user=" + user.getFam() + "]";
	}
	
	
}
