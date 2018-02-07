import java.util.ArrayList;

/**
 * Stores information about a website
 * @author Sean Stock
 * @version 2.6.18
 */
public class Website
{
    private ArrayList<Integer> nature;
    private ArrayList<Integer> tech;
    private ArrayList<Integer> business;
    private ArrayList<Integer> music;
    private ArrayList<Integer> naughty;
    private String design;
    private int numFeatures;
    private int price;

    /**
     * Constructor for objects of class Website
     * @param design
     */
    public Website(String design)
    {
        this.design = design;
        this.nature = new ArrayList<>();
        this.tech = new ArrayList<>();
        this.business = new ArrayList<>();
        this.music = new ArrayList<>();
        this.naughty = new ArrayList<>();
        this.populateArrays();
    }

    /**
     * Populates the five design arrays with prices for number of features
     */
    public void populateArrays()
    {
        nature.add(300);
        nature.add(310);
        nature.add(315);
        nature.add(320);
        nature.add(325);        
        nature.add(330);
        tech.add(350);
        tech.add(370);
        tech.add(380);
        tech.add(390);
        tech.add(400);
        tech.add(410);
        business.add(375);
        business.add(405);
        business.add(415);
        business.add(425);
        business.add(435);
        business.add(445);
        music.add(400);
        music.add(485);
        music.add(495);
        music.add(510);
        music.add(530);
        music.add(610);
        naughty.add(500);
        naughty.add(600);
        naughty.add(700);
        naughty.add(800);
        naughty.add(900);
        naughty.add(1000);
    }
    
    /**
     * Determines price of website based on design and number of features
     * @param numFeatures
     * @return price
     */
    public int getPrice(int numFeatures)
    {
        if(design.equals("Nature"))
        {
            System.out.println("Base: $ " + nature.get(0));
            System.out.println("1 Feature: $ " + nature.get(1));
            System.out.println("2 Features: $ " + nature.get(2));
            System.out.println("3 Features: $ " + nature.get(3));
            System.out.println("4 Features: $ " + nature.get(4));
            System.out.println("5 Features: $ " + nature.get(5));
            this.price = nature.get(numFeatures);
        }
        if(design.equals("Tech"))
        {
            System.out.println("Base: $ " + tech.get(0));
            System.out.println("1 Feature: $ " + tech.get(1));
            System.out.println("2 Features: $ " + tech.get(2));
            System.out.println("3 Features: $ " + tech.get(3));
            System.out.println("4 Features: $ " + tech.get(4));
            System.out.println("5 Features: $ " + tech.get(5));
            this.price = tech.get(numFeatures);           
        }
        if(design.equals("Business"))
        {
            System.out.println("Base: $ " + business.get(0));
            System.out.println("1 Feature: $ " + business.get(1));
            System.out.println("2 Features: $ " + business.get(2));
            System.out.println("3 Features: $ " + business.get(3));
            System.out.println("4 Features: $ " + business.get(4));
            System.out.println("5 Features: $ " + business.get(5));
            this.price = business.get(numFeatures);
        }
        if(design.equals("Music"))
        {
            System.out.println("Base: $ " + music.get(0));
            System.out.println("1 Feature: $ " + music.get(1));
            System.out.println("2 Features: $ " + music.get(2));
            System.out.println("3 Features: $ " + music.get(3));
            System.out.println("4 Features: $ " + music.get(4));
            System.out.println("5 Features: $ " + music.get(5));
            this.price = music.get(numFeatures);
        }
        if(design.equals("Naughty"))
        {
            System.out.println("Base: $ " + naughty.get(0));
            System.out.println("1 Feature: $ " + naughty.get(1));
            System.out.println("2 Features: $ " + naughty.get(2));
            System.out.println("3 Features: $ " + naughty.get(3));
            System.out.println("4 Features: $ " + naughty.get(4));
            System.out.println("5 Features: $ " + naughty.get(5));
            this.price = naughty.get(numFeatures);
        }        
        return price;
    }
}
