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
    String priority;
    String dueDate;
    Task(String tit, Boolean com,String pit,String due)
    {
    this.title=tit;
    this.completed=false;
    this.priority=pit;
    this.dueDate=due;
    }
void markComplete()
 {
     this.completed = true;
     
     
 }
 void printTask()
 {
     System.out.println("The task is: " + this.title);
      System.out.println("Completed: "+this.completed);  
      System.out.println("Priotity: "+this.priority);
      System.out.println("Due Date: "+ this.dueDate);
 }
}  

