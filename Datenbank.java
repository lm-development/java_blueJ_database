// @author: LM, github.com/lm-development
// updated on September 23, 2019
// a program to show to way sorting algorythms work
public class Datenbank {  
int size;
public int[] database;       //database ist ein array
int r;       // mit int r wird gemessen, wie oft eine zahl in einem array vorkommt

    
    
    


public Datenbank( int pSize) 
 //Datenbank wird mit einem array im Konstruktor erstellt
   {                                      
    database= new int[pSize];
    size = pSize;
        for(int i=0; i<pSize; i++) 
        {
           //Weist jeder Stelle im Array eine zufällige Zahl zwischen 1 und 1000 zu
           database[i]= (int)(Math.random()*1000);
        }
    }

     
    
    
    
    
    
 public void ausgabe()
 {      //Ausgabe aller Wert mittels for Schleife
        System.out.println('\u000C'); //Dieser Befehl macht die Konsole sauber 
        System.out.println("######");//Nur zur Abgrenzung
            for(int i=0; i<size; i++) 
              {
                System.out.println(" "+database[i]+" ");
              }
        System.out.println("######");
  }      

    
    
 
public void selectionSort()    //sorts the array using selection sort. After that, the total runtime of this method is displayed
{ 
        int n = database.length;
        long timeStart = System.currentTimeMillis(); 
       
        for (int i = 0; i < n-1; i++) 
        { 
            
            for (int j = i+1; j < n; j++) 
               {
                  if (database[j] < database[i]) 
                      {
                       int temp = database[i];
                       database[i]= database[j];
                       temp = database[j];}
                      }
                }
        }
            
   
       long timeEnd = System.currentTimeMillis(); 
       System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " Millisek."); 
}

  
    
    
   
 public void  insertionSort() 
 //sorts the array using insertion sort. After that, the total runtime of this method is displayed
  { 
        int n = database.length; 
        long timeStart = System.currentTimeMillis();
     
        for (int i = 1; i < n; i++) 
          { 
            int j = i - 1; 
              while (j >= 0 && database[j] > database[i]) 
              { 
                 database[j + 1] = database[j]; 
                 j = j - 1; 
               }   
             database[j + 1] = database[i]; 
          }
     
        long timeEnd = System.currentTimeMillis(); 
        System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " Millisek."); 
    } 
      
  
    
  public void bubbleSort() 
  //sorts the array using bubble sort. After that, the total runtime of this method is displayed
  {
       int n = database.length;
       long timeStart = System.currentTimeMillis();
        for (int i = 0; i < n-1; i++)
         {
            for (int j = 0; j < n-i-1; j++)
            {
                if (database[j] > database[j+1])
                {
                    // tausche
                    int temp =database[j];
                   database[j] = database[j+1];
                   database[j+1] = temp;
                }
            }
        }
      
        long timeEnd = System.currentTimeMillis(); 
        System.out.println("Verlaufszeit der Schleife: " + (timeEnd - timeStart) + " Millisek."); 
  }
    
    
    
    
    
    
    
   public boolean searchdatabase(int pNumber)
   //sucht die ganze datenbank durch, bis die zahl gefunden wurde
   {
    
      for(int i=0; i<size; i++){if (database[i]==pNumber) 
          {  
             System.out.println('\u000C'); 
             System.out.println("***An der Stelle "+(i-1)+ " ist der Wert " +pNumber+ " vorhanden.***");
             return true; 
            
          }
    }  
    return false;

}      

    

   public boolean searchdatabsepartially(int pAnfang, int pEnde, int pNumber)
   //sucht nur einen teil der datenbank durch und stoppt, wenn die zahl gefunden wurde
   {   
      for(int i=pAnfang; i<pEnde; i++){if (database[i]==pNumber) 
         {   
           System.out.println('\u000C');
           System.out.println("***An der Stelle "+(i-1)+ " ist der Wert " +pNumber+ " vorhanden.***");
           return true; 
            
         }
     
     return false;

   }    

       

public void advanceddatabasesearch( int pNumber) 
//zählt, wie oft die zahl in der datenbank vorkomm
{  
   for(int i=0; i<size; i++){if (database[i]==pNumber) 
     
        {  
          r++;
        }
       
  
   System.out.print('\u000C');
      if(r==0) 
       {
          System.out.println("***Leider war die Suche erfolglos. Die Zahl "+pNumber+ " ist in der Datenbank nicht vorhanden.***");
       }
      if(r>0) 
       {
          System.out.println("***Die Suche war erfolfreich. Die Zahl "+pNumber+ " ist in der Datenbank " +r+ "-Mal vorhanden.***");
       }
  }


    
public void advanceddatabasesearchpartially( int pNumber, int pAnfang, int pEnde) 
  //zählt, wie oft die Zahl in einen Teil der Datanbank vorkommt
  {   
    for(int i=pAnfang; i<pEnde; i++){if (database[i]==pNumber) 
        {  
        r++;
        }
       
   
   System.out.print('\u000C');
      if(r==0) 
        {
          System.out.println("***Leider war die Suche erfolglos. Die Zahl "+pNumber+ " ist in diesem Teil der Datenbank nicht vorhanden.***");
        }
      if(r>0) 
      {
          System.out.println("***Die Suche war erfolfreich. Die Zahl "+pNumber+ " ist in diesem Teil der Datenbank " +r+ "-Mal vorhanden.***");
      }
   } 
