package hashing;

import java.util.HashMap;
import java.util.Map;

//finding the highest and lowest frequency number and if there are similar freq then print the lowest
public class highNLowFreq {
  public static void main(String[] args) {
    System.out.println("High and low frequency value sorting");
    int v[] = {1,2,2,2,2,1,3};
    int n = v.length;
    HashMap<Integer,Integer> maparr=new HashMap<>();
        for(int i=0;i<n;i++){
            if(maparr.containsKey(v[i])){
                maparr.put(v[i], maparr.get(v[i])+1);
            }
            else{
                maparr.put(v[i],1);
            }
        }
        int maxfreq=0,minfreq=n;
        int maxele=0, minele=0;
        for(Map.Entry<Integer,Integer> it:maparr.entrySet()){

            int count=it.getValue();
            int element=it.getKey();

            if(count>maxfreq || (count==maxfreq && element<maxele) ){

                maxele=element;
                maxfreq=count;
            }
            if(count<minfreq || (count==minfreq && element<minele)){
                minele=element;
                minfreq=count;
            }
        }

      System.out.println("Max element "+maxele);
      System.out.println("Min element "+minele);
        

  }
}
