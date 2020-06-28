package Practice_05_06_2020;
/*crteate a class called BankofAmerica:
				Bank of America in VA is p-lanning to create a scrum teams:
						4 developers 2 testers				 create a arraylist of scrum team and:
						 1. use the for loop to print out every single employees from BOA' scrum teams
						 2. calculate the total budgets of the screumteam

 */
public class Developer {
    public long employeeId;
    String name;
    String jobTitle;
    double salary;
    long emloyeeId;

    public void setInfo(String name,String jobTitle, double salary,long emloyeeId) {
        this.name = name;//user given argument name is assigned to instance variable name
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.emloyeeId = emloyeeId;
    }

        public String toString(){
        return "Name:"+name+", job title: "+jobTitle+", salary:$ "+salary+", Id:"+emloyeeId;
    }
        public void coding(){
            System.out.println(name+" is coding");
        }
        public void fixingBug(){
            System.out.println(name+" is crying");
        }

}
