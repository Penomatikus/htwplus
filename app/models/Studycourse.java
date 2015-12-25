package models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import models.base.BaseModel;
import play.data.validation.Constraints.Required;
import play.db.jpa.JPA;
import play.libs.F;

@Entity
public class Studycourse extends BaseModel {
	
	@Required
	@Column(length=2000)
	public String title;

	public static Studycourse findById(Long id) {
		return JPA.em().find(Studycourse.class, id);
	}

    @SuppressWarnings("unchecked")
    public static List<Studycourse> getAll() {
    	return JPA.em().createQuery("FROM Studycourse ORDER BY title").getResultList();
    }

}