/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tasktest;

/**
 *
 * @author orijamahat
 */import java.util.*;
  import java.io.FileWriter;
import java.io.File;
public class TaskTest {

    public static void main(String[] args)
    {
        ArrayList <Task>tasks =new ArrayList<Task>();
      Scanner keyboard = new Scanner(System.in);
         //load task here
         
       
           try{  
         File file=new File("tasks.txt");
         Scanner fileReader=new Scanner(file);
         
         while(fileReader.hasNextLine())
         {
             String line=fileReader.nextLine();
             String[] parts=line.split(",");
             String tit=parts[0];
             boolean completed=Boolean.parseBoolean(parts[1]);
             
             Task t=new Task(tit,completed);
             tasks.add(t);
             
         }
         fileReader.close();
           }
           catch(Exception e)
           {
               System.out.println("No saved tasks found");
           }  
         
         int choice=0;
      while(choice!=7)
      {
        System.out.println("1: Add");
        System.out.println("2: view tasks");
        System.out.println("3: Mark complete");
        System.out.println("4:Remove");
        System.out.println("5:Search");
        System.out.println("6:Save tasks");
        System.out.println("7: Exit");
       
       System.out.println("Enter your choice");
       choice=keyboard.nextInt();
       keyboard.nextLine();
        // saves the task make a new task object with the new title of the task and add to the array list
       if(choice==1)
       {
           System.out.println("Enter the task you want to add: ");
           String tale=keyboard.nextLine();
           Task tit =new Task(tale,false);
           tasks.add(tit);
       }
       // check if the size of the array list is not 0 if not list the tasks by calling the object printTask.
       //tasks.get(i)gives the number to the title so that we can acess each and every task in the list
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
       //check the index error and mark complete the title acessing the markComplete mesthod according to the user number
       if (choice==3)
       {
           System.out.println("Enter the task you completed");
           int tasknumber= keyboard.nextInt();
           if(tasknumber>=1 && tasknumber<=tasks.size())
           {
               
           tasks.get(tasknumber-1).markComplete();
           }
           else
           {
                    System.out.println("Invalid number");
           }
       }
       //use arraylist name dot remove function to remove the required task according to the number entered by the user
       if (choice==4)
       {
           System.out.println("Enter the task that you want to remove:");
           int tasknumber=keyboard.nextInt();
           if(tasknumber<1 && tasknumber>tasks.size())
           {
               System.out.println("Invalid number!");
           }
           else
           {
               tasks.remove(tasknumber-1);
           }
               
             
       }
       if(choice==5)
       {
           System.out.println("Enter the keyword:");
           String keyword=keyboard.nextLine();
           for(int i=0;i<tasks.size();i++)
           {
               //Task currentTask=tasks.get(i)    we cannot do string currentTask because to access array list is should be the object task
             Task currentTask=tasks.get(i);
                  if(currentTask.title.contains(keyword))
                  {
                     currentTask.printTask();
                  }
           }
       }
       if(choice==6)
       {
           try
           {
               FileWriter writer=new FileWriter("tasks.txt");
               for(Task t:tasks)
               {
                writer.write(t.title + "," + t.completed +"\n");
               
       
               }
               writer.close();
               System.out.println("Task saved sucessfully.");
           }
           catch(Exception e)
                   {
                       System.out.println("Error while saving tasks.");   
                   }
       }
       if(choice==7)
       {
           System.out.println("Exit");
       }
           
            
        }
        
       
    }
}
