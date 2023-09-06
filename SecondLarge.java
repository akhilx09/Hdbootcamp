// Find 2nd Largest Number in an Array
public class Secondlarge{  
public static void main(String[] args){
int temp; 
int a[]=new int[]{1,2,5,6,3,2}; 
for (int i = 0; i <7; i++)   
        {  
            for (int j = i + 1; j < 7; j++)   
            {  
                if (a[i] > a[j])   
                {  
                    temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
            }  
        }  
       System.out.println(a[7-2]);
}        
}
