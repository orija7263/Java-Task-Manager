/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tasktest;

/**
 *
 * @author orijamahat
 */
public class Task 
{
  String title;
    boolean completed;
    Task(String tit, Boolean com)
    {
    this.title=tit;
    this.completed=false;
    }
void markComplete()
 {
     this.completed = true;
     
     
 }
 void printTask()
 {
     System.out.println("The task is: " + this.title);
      System.out.println("Completed: "+this.completed);  
 }
}  

