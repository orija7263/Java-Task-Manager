/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tasktest;

/**
 *
 * @author orijamahat
 */import java.util.*;
public class TaskTest {

    public static void main(String[] args)
    {
        ArrayList <Task>tasks =new ArrayList<Task>();
        System.out.println("Enter the task title: ");
        Scanner keyboard=new Scanner(System.in);
        String title= keyboard.nextLine();
     

        Task tas=new Task(title,false);
        tasks.add(tas);
         
         for(int i=0;i<tasks.size();i++)
         {
             tasks.get(i).printTask();
         }
         int choice=0;
      while(choice!=6)
      {
        System.out.println("1: Add");
        System.out.println("2: view tasks");
        System.out.println("3: Mark complete");
        System.out.println("4:Remove");
          System.out.println("5:Search");
        System.out.println("6: Exit");
      
       
       System.out.println("Enter your choice");
       choice=keyboard.nextInt();
       keyboard.nextLine();
        
       if(choice==1)
       {
           System.out.println("Enter the task you want to add: ");
           String tale=keyboard.nextLine();
           Task tit =new Task(tale,false);
           tasks.add(tit);
       }
       if(choice==2)
       {
           if(tasks.size()==0)
           {
               System.out.println("No tasks available") ;
           }
           else
           {
               for(int i=0;i<tasks.size();i++)
               {
                   System.out.println(i+1);
                   tasks.get(i).printTask();
               }
           }
       }
       
       if (choice==3)
       {
           System.out.println("Enter the task you completed");
           int n= keyboard.nextInt();
           if(n>=1 && n<=tasks.size())
           {
               
           tasks.get(n-1).markComplete();
           }
           else
           {
                    System.out.println("Invalid number");
           }
       }
       if (choice==4)
       {
           System.out.println("Enter the task that you want to remove:");
           int n =keyboard.nextInt();
           if(n<1 && n>tasks.size())
           {
               System.out.println("Invalid number!");
           }
           else
           {
               tasks.remove(n-1);
           }
               
             
       }
       if(choice==5)
       {
           System.out.println("Enter the keyword:");
           String keyword=keyboard.nextLine();
           for(int i=0;i<tasks.size();i++)
           {
               //Task currentTask=tasks.get(i)    if(currentTask.title.contains.
             Task currentTask=tasks.get(i);
                  if(currentTask.title.contains(keyword))
                  {
                     currentTask.printTask();
                  }
           }
       }
       if(choice==6)
       {
           System.out.println("Exit");
       }
           
            
        }
        
       
    }
}
