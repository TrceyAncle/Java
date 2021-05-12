public boolean equals(Object obj)
{
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if(!(obj instanceof Employee))
		return false;
	if(!super.equals(obj))
		return false;
	Employee employee = (Employee) obj;
	DecimalFormat df = new DecimalFormat("#.##");
	if(!df.format(employee.salary).equals(df.format(salary))) 
		return false;
	return company !=null? company.equals(employee.company):employee.company ==null;
}