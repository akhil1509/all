package testOperation.testOperation.model;


import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Data

@NoArgsConstructor
@Entity
@Table(name = "operation")


public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "Name")
    private String name;
    @Column(name = "Address")
    private  String address;
    @Column(name = "Email", nullable = false,length = 255)
    private  String email;
    
    
    
    
    
    
    
    
	public Employee(Long id, String name, String address, String email) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + "]";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    

}
