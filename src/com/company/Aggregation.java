package com.company;

class Aggregate{

    String companyName;
    String country;
    int branches;

    Aggregate(String companyName, String country, int branches){
        this.companyName = companyName;
        this.country = country;
        this.branches = branches;
    }
}

public class Aggregation {

    String type;
    String lidSize;
    Aggregate agg;

    Aggregation(String type, String lidSize, Aggregate agg){
        this.type = type;
        this.lidSize = lidSize;
        this.agg = agg;
    }
    void display(){
        System.out.println("Type : "+ type+", Lid size : "+ lidSize);
        System.out.println("Company Name : "+agg.companyName+", Country Origin : "+ agg.country+", Total Branches here : "+agg.branches);
    }

    public static void main(String[] args) {
        Aggregate agg1 = new Aggregate("Cello", "India", 10);
        Aggregation aggt = new Aggregation("pen", "0.5mm", agg1);

        Aggregate agg2 = new Aggregate("Apsara","India",20);
        Aggregation aggt0 = new Aggregation("pencil", "1mm", agg2);

        aggt.display();
        aggt0.display();
    }

}
