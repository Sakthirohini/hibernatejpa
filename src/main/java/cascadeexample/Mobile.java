package cascadeexample;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Mobile {

	@Id
	private int mid;
	private String mno;
	
	
	@ManyToOne( fetch = FetchType.LAZY)
	private Learner lr;


	public int getMid() {
		return mid;
	}


	public void setMid(int mid) {
		this.mid = mid;
	}


	public String getMno() {
		return mno;
	}


	public void setMno(String mno) {
		this.mno = mno;
	}


	public Learner getLr() {
		return lr;
	}


	public void setLr(Learner lr) {
		this.lr = lr;
	}
	
	}