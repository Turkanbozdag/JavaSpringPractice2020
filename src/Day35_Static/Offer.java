package Day35_Static;

public class Offer {
    /* Create a class called Offer that has:
    instance fields :
            location, company, salary , isFullTime    instance methods :
        setOfferInfo: can set the location, company, salary , isFullTime of the offer
        toString -- print all info about offers

     */

    String location;
    String company;
    double salary;
    boolean isFulTime;

    public void setInfo(String location,String company,double salary,boolean isFulTime){
        this.location=location;
        this.company=company;
        this.salary=salary;
        this.isFulTime=isFulTime;

    }
    public String toString(){
        String salary=""+this.salary;//String now
        return "Location: "+location+", Company:"+company+",salary: $"+salary+", isFullTime:"+isFulTime;
    }



}
