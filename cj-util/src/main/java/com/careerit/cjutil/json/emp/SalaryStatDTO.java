package com.careerit.cjutil.json.emp;

public class SalaryStatDTO {

		private Long count;
		private double maxSalary;
		private double minSalary;
		private double avgSalary;
		public Long getCount() {
			return count;
		}
		public void setCount(Long count) {
			this.count = count;
		}
		public double getMaxSalary() {
			return maxSalary;
		}
		public void setMaxSalary(double maxSalary) {
			this.maxSalary = maxSalary;
		}
		public double getMinSalary() {
			return minSalary;
		}
		public void setMinSalary(double minSalary) {
			this.minSalary = minSalary;
		}
		public double getAvgSalary() {
			return avgSalary;
		}
		public void setAvgSalary(double avgSalary) {
			this.avgSalary = avgSalary;
		}
		@Override
		public String toString() {
			return "SalaryStatDTO [count=" + count + ", maxSalary=" + maxSalary + ", minSalary=" + minSalary
					+ ", avgSalary=" + avgSalary + "]";
		}
		
		
		
		
}
