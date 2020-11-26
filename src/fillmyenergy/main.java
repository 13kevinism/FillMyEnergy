package fillmyenergy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class main {
    
    public static List<obj> pilihan = new ArrayList<obj>();
    
    public static void main(String[] args) {
    	 Display.display();	
    }
        
    public static obj[] listFood(){
    	obj[] item = new obj[32];
	item [0] = new obj("Roti Tawar",10000,149,60);
        item [1] = new obj("Ayam Panggang",20000,164,100);
        item [2] = new obj("Daging Panggang",40000,150,70);
        item [3] = new obj("Ikan Mas Pepes",20000,143,200);
        item [4] = new obj("Sayur Bayam",5000,18,50);
        item [5] = new obj("Sayur Asam",5000,88,100);
        item [6] = new obj("Sop Ayam",12000,95,100);
        item [7] = new obj("Jus Tomat",8500,20,100 );
        item [8] = new obj("Jus Melon",7000,35,150);
        item [9] = new obj("Apel",3000,92,160);
        item [10] = new obj("Jambu Biji",1000,157,320);
        item [11] = new obj("Mangga",7000,360,500);
        item [12] = new obj("Kentang Goreng",12000,211,150);
        item [13] = new obj("Spaghetti",20000,642,300);
        item [14] = new obj("Nasi Goreng",12000,267,100);
        item [15] = new obj("Mie Goreng",11000,321,200 );
        item [16] = new obj("Bubur Ayam",12000,165,200 );
        item [17] = new obj("Empal Daging",20000,147,100);
        item [18] = new obj("Ikan Bawal Goreng",20000,107,120);
        item [19] = new obj("Bakso Sapi",15000,260,100);
        item [20] = new obj("Ikan Lele Goreng",15000,57,60);
        item [21] = new obj("Gulai Kepala Ikan Kakap",18000,219,320);
        item [22] = new obj("Fried Chicken",8000,194,150);
        item [23] = new obj("Sate Ayam",18000,466,100);
        item [24] = new obj("Sayur Lodeh",5000,61,100);
        item [25] = new obj("Soto Ayam",5000,101,100);
        item [26] = new obj("Tongseng",20000,331,120 );
        item [27] = new obj("Burger",14000,257,125);
        item [28] = new obj("Arem-arem",5000,225,75);
        item [29] = new obj("Lemper",5000,247,70);
        item [30] = new obj("Cheese Cake",5000,128,10);
        item [31] = new obj("Martabak Telur",5000,196,95);
    return item;
    }
    
    public static float hitungBMR(Float umur,Float berat,Float tinggi, int gender){
    	float BMR = 0;
    	
        switch(gender) {      
        //Pria
        case 1: {BMR = (float) (10 * berat + 6.25 * tinggi - 5 * umur + 5);
        				break;}
        //Wanita
        case 2: {BMR = (float) (10 * berat + 6.25 * tinggi - 5 * umur - 161);
					break;}
        }
		return BMR;
    }

    public static float hitungCal(Float umur,Float berat,Float tinggi, int gender, int weightPlan, int exerRate){
        
        Float BMR =	hitungBMR(umur,berat,tinggi,gender);
        Float exerRateFactor, calNeed;
        int weightPlanFactor;
        
        switch(exerRate) {      
        case 1: {exerRateFactor = 1.2f;
        				break;}
        case 2: {exerRateFactor = 1.37f;
					break;}
        case 3: {exerRateFactor = 1.55f;
        				break;}
        case 4: {exerRateFactor = 1.725f;
					break;}
        case 5: {exerRateFactor = 1.9f;
        				break;}
        default : exerRateFactor = 0f;
        }
        
        switch(weightPlan) {      
        case 1: {weightPlanFactor = -1000;
        				break;}
        case 2: {weightPlanFactor = -500;
					break;}
        case 3: {weightPlanFactor = -250;
        				break;}
        case 4: {weightPlanFactor = 0;
					break;}
        case 5: {weightPlanFactor = 250;
        				break;}
        case 6: {weightPlanFactor = 500;
        				break;}
        case 7: {weightPlanFactor = 1000;
        				break;}
        default : weightPlanFactor = 0;
        }
        
        calNeed = BMR * exerRateFactor + weightPlanFactor;
        
        return calNeed;
    }
    
    public static void knapsack( float calNeed){
        obj[] item= listFood();  
        int total = 0;
        int hargatotal = 0;
        
        for(int i=0;i<=31;i++){
                
            if( item[i].energy + total <= calNeed ){
            pilihan.add(item[i]);
            total += item[i].energy;
            hargatotal += item[i].price;
            }
        }
    }
}