package org.tech.jpa.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.type.YesNoConverter;
import org.tech.jpa.enums.DeptEnum;
import org.tech.jpa.util.converter.DeptEnumConverter;


@Entity
@Table(name="TECH_USER_DIRECTORY")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Access(AccessType.FIELD)
@Builder
// @NamedQuery(name = "User.findByTheUsersName", query = "from User u where u.username = ?1")
public class TechUserDirectory extends BaseEntity<Long> {

	private static final long serialVersionUID = -2952735933715107252L;

	@Id
	@Column(name="ID", nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tech_sequence_generator")
	@SequenceGenerator(name="tech_sequence_generator", sequenceName = "tech_sequence", allocationSize = 1)
	private Long id;

	@Column(name = "EMPLOYEE_ID")
	private String employeeId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "DEPT")
	@Convert(converter = DeptEnumConverter.class)
	private DeptEnum dept;

	@Column(name = "IS_ACTIVE")
	@Convert(converter = YesNoConverter.class)
	private Boolean isActive;

}