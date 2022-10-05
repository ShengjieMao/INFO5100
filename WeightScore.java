/*
 * Assignment 3
 * Shengjie Mao
 * id #002795042
 * section 08
 */

public class WeightScore {
    // Set the attributes.
    private double pointTotal = 0; 
    private double earnedPoints = 0; 
    private double percentage = 0; // assume the input is the value in percentage without % symbol.
    private double totalGrade = 0;

    // Set total points to users input
    public void setPoint(double point){
        this.pointTotal = point;
    }
    // Set students point earned as input
    public void setEarned(double earned){
        this.earnedPoints = earned;
    }
    // set percentage that the assignment counts as input
    public void setPerc(double perc){
        this.percentage = perc;
    }
    // set the weighted score as input
    public void setTotal(double total){
        this.totalGrade = total;
    }
    // get the updated total points
    public double getPoint(){
        return this.pointTotal; 
    }
    // get the updated scored earned
    public double getEarned(){
        return this.earnedPoints;
    }
    // get the percentage assignemnt counts updated
    public double getPerc(){
        return this.percentage;
    }
    // get the final weighted score
    public double getTotal(){
        return this.totalGrade;
    }

    /* The method calculates and returns the final weighted grade. 
     * point: The total points that students can get
     * earned: The actual points students earned
     * perc: The percentage that the assignment counts toward final grade
     */
    public double weightGrade (double point, double earned, double perc) {
        double points;
        double earns;
        double percents;
        double totals;

        WeightScore w = new WeightScore();
        w.setPoint(point);
        w.setEarned(earned);
        w.setPerc(perc);
        points = w.getPoint();
        earns = w.getEarned();
        percents = w.getPerc();
        w.setTotal(earns / points * percents);
        totals = w.getTotal();

        return totals;
    }
}