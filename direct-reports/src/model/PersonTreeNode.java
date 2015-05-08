package model;

import java.util.List;

/**
 * Object representing a tree node of Person.
 * Contains the Person and a List of PersonTreeNodes 
 *  representing all PersonTreeNode's with Person as their respective manager. 
 */
public class PersonTreeNode {
	
    private Person person;
    private List<PersonTreeNode> directReports; // never null, but may be empty
    
    /**
     * Returns Person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Returns all PersonTreeNodes having this.Person as manager.
     * @return
     */
    public List<PersonTreeNode> getDirectReports() {
        return directReports;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    
    public void setDirectReports(List<PersonTreeNode> directReports) {
        this.directReports = directReports;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((directReports == null) ? 0 : directReports.hashCode());
		result = prime * result + ((person == null) ? 0 : person.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonTreeNode other = (PersonTreeNode) obj;
		if (directReports == null) {
			if (other.directReports != null)
				return false;
		} else if (!directReports.equals(other.directReports))
			return false;
		if (person == null) {
			if (other.person != null)
				return false;
		} else if (!person.equals(other.person))
			return false;
		return true;
	}
}