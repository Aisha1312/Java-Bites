
/**
 * @author RoohiAisha
 *
 */
public class AMPMToHrsConversion {

	public static String timeConversion(String s) {
		    // Write your code here
		        int h1 = (int)s.charAt(1)-'0';
		        int h2 = (int)s.charAt(0)-'0';
		        int hh = (h2 * 10 + h1 % 10);
		        String st ="";
		        
		        if(s.charAt(8)=='A'){
		            if(hh==12){
		                st="00";
		                for(int i=2;i<=7;i++)
		                {    System.out.println(s.charAt(i));
		                     st = st+s.charAt(i);
		                }
		            }
		            else{
		                for(int i=0;i<=7;i++){
		                     st = st+ s.charAt(i);
		                }
		            }     
		        }
		        else{
		         if(hh==12){
		                st="12";
		                for(int i=2;i<=7;i++)
		                 {
		                     st +=s.charAt(i);
		                }   
		            }
		            else{
		                hh = hh + 12;
		                st= String.valueOf(hh);
		                for(int i=2;i<=7;i++){
		                    st +=s.charAt(i);
		                }
		            }     
		    }  
		    return st;
		  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "07:05:45PM";
		System.out.println("Time in 24 hrs format is " + timeConversion(s));
	}
}
