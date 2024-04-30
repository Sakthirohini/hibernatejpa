package cascadeexample;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Learner {
	@Id
	private int lId;
	private String lName;
	
	@OneToMany(mappedBy = "lr",cascade = CascadeType.REMOVE)
	private List<Mobile> li=new ArrayList<Mobile>();
	
	public void addMobileNo(Mobile m)
	{
		this.li.add(m);
		m.setLr(this);
			}

	public int getlId() {
		return lId;
	}

	public void setlId(int lId) {
		this.lId = lId;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public List<Mobile> getLi() {
		return li;
	}

	public void setLi(List<Mobile> li) {
		this.li = li;
	}

	@Override
	public String toString() {
		return "Learner [lId=" + lId + ", lName=" + lName + ", li=" + li + "]";
	}
	
	

}
