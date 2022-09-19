package com.yash.exception.task1;

import com.yash.exception.custom.ResultException;

public class StudentResult {

	double science;
	double maths;
	double chemistry;
	double english;
	double physics;

	public StudentResult(double science, double maths, double chemistry, double english, double physics) {
		super();
		this.science = science;
		this.maths = maths;
		this.chemistry = chemistry;
		this.english = english;
		this.physics = physics;
	}

	@Override
	public String toString() {
		return "StudentResult [science=" + science + ", maths=" + maths + ", chemistry=" + chemistry + ", english="
				+ english + ", physics=" + physics + "]";
	}

	public double getScience() {
		return science;
	}

	public void setScience(double science) {
		this.science = science;
	}

	public double getMaths() {
		return maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getChemistry() {
		return chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getEnglish() {
		return english;
	}

	public void setEnglish(double english) {
		this.english = english;
	}

	public double getPhysics() {
		return physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}
//getPercentage method
	public double getPercentage() throws ResultException {
		
		double sum=science+maths+english+chemistry+physics;
		
		double percentage=(sum/500)*100;
		
		if (percentage<40) {
			
			throw new ResultException("Student is fail,Try your best in next attempt");
		  }
			else if(science<40) {
				throw new ResultException("Student is fail,Try your best in next attempt");
			}
			else if(maths<40) {
				throw new ResultException("Student is fail,Try your best in next attempt");
			}
			else if(physics<40) {
				throw new ResultException("Student is fail,Try your best in next attempt");
			}
			else if(english<40) {
				throw new ResultException("Student is fail,Try your best in next attempt");
			}
			else if(chemistry<40) {
				throw new ResultException("Student is fail,Try your best in next attempt");
			}
		

	return percentage ;
	
}

}
