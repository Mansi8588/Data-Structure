// using greedy algorthim

//  you have given n activities with their start and end times . Select the maximum number of activities that can be performed by single person ,assuming that a person can only
//   work on single activity at a time .Activities are 
import java.util.*;
class greedy_algorithm{
  public static void main(String arg[]) {
    int start[]={1,3,0,5,8,5};
    int end[]={2,4,6,7,9,9};

  // sorting
    int activity[][]=new int[start.length][3];
    for(int i=0;i<start.length;i++){
      activity[i][0]=i;
      activity[i][1]=start[i];
      activity[i][2]=end[i];
      
    }


    // lambda functiom ->shortform of comparator
    Arrays.sort(activity,Comparator.comparingDouble(o ->o[2]));   // sorting colum 2
    
     

    // end time basis sorted
    int maxAct=0;

    ArrayList<Integer> ans=new ArrayList<>();

    maxAct=1;
    ans.add(activity[0][0]);
    int lastEnd=activity[0][2];
    for(int i=1;i<end.length;i++) {
      if(activity[i][1]>=lastEnd){
        // activity selected
        maxAct++;
        ans.add(activity[i][0]);
        lastEnd=activity[i][2];
      }
    }

    
    // if end time array is already sorted
/*
    maxAct=1;
    ans.add(0);
    int lastEnd=end[0];
    for(int i=1;i<end.length;i++) {
      if(start[i]>=lastEnd){
        // activity selected
        maxAct++;
        ans.add(i);
        lastEnd=end[i];
      }
    }
*/
    System.out.println("maximum activity"+maxAct);
    for(int i=0;i<ans.size();i++) {
      System.out.print("A"+ans.get(i)+" ");
    }
  }
}
      
    
  
