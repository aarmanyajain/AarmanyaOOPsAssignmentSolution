package collage;

public class Driver {
	
		public static void main(String[] args) {
			
		//	superdepartment sd = new superdepartment();
			
			admindepartment ad = new admindepartment();
			
			hrdepartment hr = new hrdepartment();
			
			techdepartment td = new techdepartment();
			
			 ad.departmentname();
			 ad.gettodaywork();
			 ad.getworkdeadline();
			 ad.istodayaholiday();
			 System.out.println("");
			 
			 hr.departmentname();
			 hr.doactivity();
			 hr.gettodaywork();
			 hr.getworkdeadline();
			 hr.istodayaholiday();
			 
			 System.out.println("");
			 
			 td.departmentname();
			 td.gettodaywork();
			 td.getworkdeadline();
			 td.gettechstackinformation();
			 td.istodayaholiday();
			 
		
		}

	}

