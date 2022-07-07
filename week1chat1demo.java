/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csc272.csc272june2022zoomclassdemos;

import java.util.ArrayList;

/**
 *
 * @author haife
 */
public class week1chat1demo {
    
    public static void main(String[] args) {
        
        //step 1: creation of a class for City  -- done
        //step 2: create 5 cities, and store them in a data structure
        //step 3: two data structure, one for shortest path, one for the distance 
        //       of the shortest path
        //step 4: If sales starts at city 1, go through all the distances
        //      find the shortest one and its correspoonding path. 
        
        
        ArrayList<City> cities = new ArrayList<City>(); 
        
        cities.add(new City(1, 1));
        cities.add(new City(1, 3));
        cities.add(new City(4, 1));
        cities.add(new City(5, 3));
        cities.add(new City(3, 5));
        
        
        double[][] distanceVector = new double[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                distanceVector[i][j] = cities.get(i).getDistanceFrom(cities.get(j));
            }
        }
        
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%.2f\t", distanceVector[i][j]);
            }
            System.out.println(); 
        }       
        
    }
    
}


// creating a class just for this app call City
class City {
    private int x;
    private int y;
    
    public City() {
       x = 0; 
       y = 0;
    }
    
    public City(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double getDistanceFrom(City city2) {
        double a = Math.pow(this.x - city2.getX(), 2);
        double b = Math.pow(this.y - city2.getY(), 2);
        return Math.sqrt(a+b);
    }
    
}